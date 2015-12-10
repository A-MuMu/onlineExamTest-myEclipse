package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.DaAnJuan;

/*
 * 交卷业务管理逻辑实现
 */
public class TempleDaAnDAOService<T> {
	private TempleDAO dao;
	/*
	 * 添加一个 */
	public void add(DaAnJuan clazz){
		dao.addObject(clazz);
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

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}

}
