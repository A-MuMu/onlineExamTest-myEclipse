package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Teacher;

public class TempleTeacherDAOService<T> {
	private TempleDAO dao;
	
	public Teacher getOne(String id){
		List<Teacher> list;
		String queryString = "SELECT t FROM Teacher t WHERE t.teaId = '"+ id +"'" ;
		System.out.println(queryString);
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
		String queryString = "SELECT t FROM Teacher t WHERE t.teaId "
				+ uname + "%";
		return dao.getObjects(queryString);
	}

	/** ��ѯ���� */
	@SuppressWarnings("hiding")
	public <T> List<T> getAllObjects(Class<T> clazz) {
		List<T> list = new ArrayList<T>();
		list = dao.getAllObjects(clazz);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
		// return dao.getAllObjects(clazz);
	}

	public void addUser(T user) throws Exception {
		dao.addObject(user);
	}

	/** ����ָ���� */
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
