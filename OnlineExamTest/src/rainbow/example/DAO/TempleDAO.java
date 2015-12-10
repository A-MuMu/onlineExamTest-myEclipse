package rainbow.example.DAO;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class TempleDAO extends HibernateDaoSupport {

	/** ��ѯ */
	@SuppressWarnings("unchecked")
	public <T> List<T> getObjects(String queryString) {
		return (List<T>) this.getHibernateTemplate().find(queryString);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getOne(String queryString) {
		return  (T) this.getHibernateTemplate().find(queryString);
	}

	/** ��ѯ���� */
	public <T> List<T> getAllObjects(Class<T> clazz) {
		return this.getHibernateTemplate().loadAll(clazz);
	}

	/** ���һ�� */
	@Transactional (readOnly = false)
	public <T> void addObject(T clazz) {
		this.getHibernateTemplate().save(clazz);
	}
	
	@Transactional
	public <T> void addONE(T clazz){
		this.getHibernateTemplate().save(clazz);
	}

	/** ����ָ���� */
	@Transactional (readOnly = false)
	public <T> void updateObject(T clazz) {
		this.getHibernateTemplate().update(clazz);
	}

	/** ɾ��ָ���� */
	@Transactional (readOnly = false)
	public <T> void deleteObject(T clazz) {
		this.getHibernateTemplate().delete(clazz);
	}

	/** ͨ��id��ȡ */
	public <T> T getObject(Class<T> clazz, Serializable id) {
		return this.getHibernateTemplate().get(clazz, id);
	}
}
