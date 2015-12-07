package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;

public class TemplePangDuanDAOService<T> {
	private TempleDAO dao;

	public List<T>  finePD(String hardOReasy){
		String queryString = "SELECT pd FROM PangDuan pd WHERE pd.type= '"+hardOReasy+"'";
		List<T> pangDauns = dao.getObjects(queryString);
		if (pangDauns.size() == 0) {
			return null;
		} else {
			return pangDauns;
		}
	}
	
	/** ²éÑ¯ËùÓÐ */
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
	
	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
