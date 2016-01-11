package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Student;

/**
 * 用户管理业务逻辑的实现
 * */

public class TempleStuDAOService<T> {

	private TempleDAO dao;
	
	public Student getOne(String id){
		List<Student> list;
		String queryString = "SELECT u FROM Student u WHERE u.idStu = '"+ id +"'";
		list = dao.getObjects(queryString);
		if (list.size() == 0) {
			return null;
		}else {
			return list.get(0);
		}
	}
	
	public Student getOneByID(String id){
		List<Student> list;
		String queryString = "SELECT u FROM Student u WHERE u.id = '"+ id +"'";
		list = dao.getObjects(queryString);
		if (list.size() == 0) {
			return null;
		}else {
			return list.get(0);
		}
	}

	public List<T> queryUsers(String uname, Class<T> clazz) {
		if (uname == null || "".equals(uname))
			return dao.getAllObjects(clazz);
		String queryString = "SELECT u FROM Student u WHERE u.idStu like "
				+ uname + "%";
		return dao.getObjects(queryString);
	}
	
	/** 查询所有 */
	@SuppressWarnings("hiding")
	public <T> List<T> getAllObjects(Class<T> clazz) {
		List<T> list = new ArrayList<T>();
		list = dao.getAllObjects(clazz);
		if(list.size() == 0){
			return null;
		}else {
			return list;
		}
//		return dao.getAllObjects(clazz);
	}

	public void addUser(T user) throws Exception {
		dao.addObject(user);
	}

	/** 更新指定的 */
	@SuppressWarnings("hiding")
	public <T> void updateObject(T clazz) {
		dao.updateObject(clazz);
	}

	@SuppressWarnings("hiding")
	public <T> void deleteObject(T clazz) {
		dao.deleteObject(clazz);
	}

	public T getUser(Class<T> clazz, int id) {
		return dao.getObject(clazz, id);
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
