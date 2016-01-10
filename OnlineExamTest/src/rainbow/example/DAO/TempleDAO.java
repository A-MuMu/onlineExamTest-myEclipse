package rainbow.example.DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

public class TempleDAO extends HibernateDaoSupport {

	/** 查询 */
	@SuppressWarnings("unchecked")
	public <T> List<T> getObjects(String queryString) {
		return (List<T>) this.getHibernateTemplate().find(queryString);
	}

	/*
	 * find 返回的是集合
	 * 
	 * @SuppressWarnings("unchecked") public <T> T getOne(String queryString) {
	 * return (T) this.getHibernateTemplate().find(queryString); }
	 */

	/** 查询所有 */
	public <T> List<T> getAllObjects(Class<T> clazz) {
		return this.getHibernateTemplate().loadAll(clazz);
	}

	/** 添加一个 */
	@Transactional(readOnly = false)
	public <T> void addObject(T clazz) {
		this.getHibernateTemplate().save(clazz);
	}

	//sql语句
	@SuppressWarnings("unchecked")
	public <T> List<T> queryBySql(String sql) {
		List<T> list = this.getSessionFactory().getCurrentSession().createSQLQuery(sql).list();    
		return list;
	}
	
	//sql语句
	public int excuteBySql(String sql) {
		int result;
		SQLQuery query = this.getSessionFactory().getCurrentSession().createSQLQuery(sql);
		result = query.executeUpdate();
		return result;
	}

	@Transactional
	public <T> void addONE(T clazz) {
		this.getHibernateTemplate().save(clazz);
	}

	/** 更新指定的 */
	@Transactional(readOnly = false)
	public <T> void updateObject(T clazz) {
		this.getHibernateTemplate().update(clazz);
	}

	/** 删除指定的 */
	@Transactional(readOnly = false)
	public <T> void deleteObject(T clazz) {
		this.getHibernateTemplate().delete(clazz);
	}

	/** 通过id获取 */
	public <T> T getObject(Class<T> clazz, Serializable id) {
		return this.getHibernateTemplate().get(clazz, id);
	}
}
