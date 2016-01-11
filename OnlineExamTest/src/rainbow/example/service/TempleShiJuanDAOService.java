package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.ShiJuan;

public class TempleShiJuanDAOService<T> {
	private TempleDAO dao;
	/**添加一个 */
	public void add(ShiJuan class1){
		dao.addObject(class1);
	}
	
	/** 查询所有 */

	public <T> List<T> getAllObjects(Class<T> clazz) {
		return dao.getAllObjects(clazz);
	}
	
	/**获取个数*/
	public Long getAllObjects_num(Class<T> clazz) {
		List<T> list = dao.getAllObjects(clazz);
		return (long) list.size();
	}
	
	//根据试卷号获取试卷类
	public ShiJuan getByID(String id){
		List<ShiJuan> sjs = new ArrayList<ShiJuan>(); 
		String hql = "SELECT sj FROM ShiJuan sj WHERE sj.sjId = "+id;
		sjs = dao.getObjects(hql);
		if (sjs.size() == 0) {
			return null;
		}else {
			return sjs.get(0);
		}
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
