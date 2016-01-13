package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.DaAnJuan;

public class TempleGaiJuanDAOService {
	private TempleDAO dao;
	private DaAnJuan daAnJuan;
	
	public DaAnJuan getByID(String id){
		List<DaAnJuan> list = new ArrayList<DaAnJuan>();
		String hql = "SELECT d FROM DaAnJuan d WHERE d.daJuan = " + id;
		list = dao.getObjects(hql);
		if (list.size() == 0) {
			return null;
		}else
			return list.get(0);
	}
	
	public void save(DaAnJuan d){
		dao.updateObject(d);
	}

	public DaAnJuan getDaAnJuan() {
		return daAnJuan;
	}

	public void setDaAnJuan(DaAnJuan daAnJuan) {
		this.daAnJuan = daAnJuan;
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}

}
