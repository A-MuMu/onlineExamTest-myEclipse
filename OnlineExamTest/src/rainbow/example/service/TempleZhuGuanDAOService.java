package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;

public class TempleZhuGuanDAOService<T> {
	private TempleDAO dao;

	public List<T>  fineZG(String hardOReasy){
		String queryString = "SELECT zg FROM KeGuan zg WHERE zg.type= '"+hardOReasy+"'";
		List<T> zhuGuans = dao.getObjects(queryString);
		if (zhuGuans.size() == 0) {
			return null;
		} else {
			return zhuGuans;
		}
	}
	
	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
