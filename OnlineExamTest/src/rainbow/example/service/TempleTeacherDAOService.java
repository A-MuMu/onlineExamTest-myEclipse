package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.UserException;

public class TempleTeacherDAOService<T> {
	private TempleDAO dao;
	private List<T> users;

	public Teacher doLogin(String userName, String password)
			throws UserException {
		if (userName == null || "".equals(userName.trim()))
			throw new UserException("�˺Ų���Ϊ�գ�");
		else if (password == null || "".equals(password.trim()))
			throw new UserException("���벻��Ϊ�գ�");

		// ��� ->������˺���Ϣ
		System.out.println(userName);

		String queryString = "SELECT t FROM Teacher t WHERE t.teaId = '"
				+ userName+"'";// + " AND u.pswStu = " + password;

		users = dao.getObjects(queryString);
		if (users.size() == 0)
			throw new UserException("���û������ڣ�");
		else {
			System.out.println(queryString);
			Teacher loginUser = (Teacher) users.get(0);
			if (loginUser != null) {
				if (!password.equals(loginUser.getPwsTea()))
					throw new UserException("�������벻��ȷ��");
				else
					return loginUser;
			}
		}
		return null;
	}

	public List<T> queryUsers(String uname, Class<T> clazz) {
		if (uname == null || "".equals(uname))
			return dao.getAllObjects(clazz);
		String queryString = "SELECT u FROM Student u WHERE u.idStu like "
				+ uname + "%";
		return dao.getObjects(queryString);
	}

	/** ��ѯ���� */
	@SuppressWarnings("hiding")
	public <T> List<T> getAllObjects(Class<T> clazz) {
		List<T> list = new ArrayList<T>();
		list = dao.getAllObjects(clazz);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
		// return dao.getAllObjects(clazz);
	}

	public void addUser(T user) throws Exception {
		dao.addObject(user);
	}

	/** ����ָ���� */
	@SuppressWarnings("hiding")
	public <T> void updateObject(T clazz) {
		dao.updateObject(clazz);
	}

	@SuppressWarnings("hiding")
	public <T> void deleteObject(T clazz) {
		dao.deleteObject(clazz);
	}

	public T getUser(Class<T> clazz, int id) {
		return dao.getObject(clazz, id);
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
