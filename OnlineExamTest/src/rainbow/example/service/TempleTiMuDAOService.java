package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;

public class TempleTiMuDAOService<T> {
	private TempleDAO dao;

	public List<T>  fineXZ(String hardOReasy){
		String queryString = "SELECT xz FROM XuanZe xz WHERE xz.type= '"+hardOReasy+"'";
		List<T> xuanZEs = dao.getObjects(queryString);
		if (xuanZEs.size() == 0) {
			return null;
		} else {
			return xuanZEs;
		}
	}
	
	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
	
	
}
