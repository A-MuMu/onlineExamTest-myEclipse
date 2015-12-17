package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Admin;

public class TempleAdminLoginService {
	private TempleDAO dao;
	
	public Admin getOne(String id){
		List<Admin> list;
		String queryString = "SELECT u FROM Admin u WHERE u.loginId = '"+ id +"'";
		list = dao.getObjects(queryString);
		if (list.size() == 0) {
			return null;
		}else {
			return list.get(0);
		}
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}

}
