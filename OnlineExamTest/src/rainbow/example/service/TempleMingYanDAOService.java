package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;

public class TempleMingYanDAOService<T> {
	private TempleDAO dao;
	private List<T> mingyanList;

	public T doLoad(int id) throws Exception {
		String queryString = "SELECT m FROM MingYan m WHERE m.id = '" + id
				+ "'";
		List<T> users = dao.getObjects(queryString);
		if (users.size() == 0) {
			return null;
		} else {
			return users.get(0);
		}
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
