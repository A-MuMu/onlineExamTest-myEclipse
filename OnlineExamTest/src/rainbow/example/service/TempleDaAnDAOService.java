package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.DaAnJuan;
import rainbow.example.domain.StuCourse;

/*
 * ����ҵ������߼�ʵ��
 */
public class TempleDaAnDAOService<T> {
	private TempleDAO dao;
	/*
	 * ���һ��
	 */
	public void add(DaAnJuan clazz) {
		dao.addObject(clazz);
	}

	/** ��ѯ���� */

	public <T> List<T> getAllObjects(Class<T> clazz) {
		return dao.getAllObjects(clazz);
	}

	/** ��ȡ���� */
	public Long getAllObjects_num(Class<T> clazz) {
		List<T> list = dao.getAllObjects(clazz);
		return (long) list.size();
	}
	
	//ͨ��id��ȡ�𰸾���
	public DaAnJuan getByID(String id){
		List<DaAnJuan> list = new ArrayList<DaAnJuan>();
		String hql = "SELECT da FROM DaAnJuan da WHERE da.daJuan = "+id;
		list = dao.getObjects(hql);
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
