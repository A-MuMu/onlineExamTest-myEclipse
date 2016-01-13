package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Loginuser;

public class TempleLoginUserService {
	private Loginuser loginuser;
	private TempleDAO dao;
	
	public <T> void save(T user){
		dao.addObject(user);
	}
	
	public <T> List<T> get(Class<T> clazz) {
		List<T> list = new ArrayList<T>();
		list = dao.getAllObjects(clazz);
		if(list.size() == 0){
			return null;
		}else {
			return list;
		}
//		return dao.getAllObjects(clazz);
	}
	
	public Loginuser getLoginuser() {
		return loginuser;
	}
	public void setLoginuser(Loginuser loginuser) {
		this.loginuser = loginuser;
	}
	public TempleDAO getDao() {
		return dao;
	}
	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
