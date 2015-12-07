package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;

public class TempleXuanZeDAOService<T> {
	private TempleDAO dao;

	/** 查询所有 */
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
