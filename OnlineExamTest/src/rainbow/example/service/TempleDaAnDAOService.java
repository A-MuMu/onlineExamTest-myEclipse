package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.DaAnJuan;

/*
 * ����ҵ������߼�ʵ��
 */
public class TempleDaAnDAOService<T> {
	private TempleDAO dao;
	/*
	 * ���һ�� */
	public void add(DaAnJuan clazz){
		dao.addObject(clazz);
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
