package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Teacher;

public class TempleXkDaoService {
	private TempleDAO templeDAO;

	// 老师查找自己课程名称
	public List<String> getNameByTea(Teacher teacher) {
		List<String> xkNames = new ArrayList<String>();
		String queryString = "SELECT xk.nameXk FROM XueKe xk WHERE xk.teacher.id = " + teacher.getId();
		xkNames = templeDAO.getObjects(queryString);
		System.out.println("~~~~~~~~~~~~"+xkNames.get(0)+"###"+xkNames.size());
		if (xkNames.size() == 0) {
			return null;
		} else
			return xkNames;
	}

	public TempleDAO getTempleDAO() {
		return templeDAO;
	}

	public void setTempleDAO(TempleDAO templeDAO) {
		this.templeDAO = templeDAO;
	}

}
