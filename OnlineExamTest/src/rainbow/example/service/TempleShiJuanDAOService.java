package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.ShiJuan;

public class TempleShiJuanDAOService<T> {
	private TempleDAO dao;
	/**���һ�� */
	public void add(ShiJuan class1){
		dao.addObject(class1);
	}
	
	/** ��ѯ���� */

	public <T> List<T> getAllObjects(Class<T> clazz) {
		return dao.getAllObjects(clazz);
	}
	
	/**��ȡ����*/
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
