package rainbow.example.service;

import java.util.Iterator;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.StuCourse;

public class TempleStuCourseDaoService {
	private TempleDAO dao;
	private StuCourse stuCourse;
	private List<StuCourse> list;
	
	/* 老师通过课程查询学生 */
	public List<StuCourse> queryDaAns(String xkName) {
		String queryString = "SELECT s FROM StuCourse s WHERE s.id.xkname = '" + xkName +"'";
		list = dao.getObjects(queryString);
	    Iterator<StuCourse> iterator = list.iterator();
	    if (iterator.hasNext()) {
			System.out.println(iterator.next().getId().getShijuan()+"~~"+iterator.next().getId().getShijuan());
		}
//		System.out.println(list.size()+"@@@"+list.get(0).getShijuan()+"@@@"+list.get(1).getShijuan());
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}
	
	public TempleDAO getDao() {
		return dao;
	}
	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
	public StuCourse getStuCourse() {
		return stuCourse;
	}
	public void setStuCourse(StuCourse stuCourse) {
		this.stuCourse = stuCourse;
	}
	public List<StuCourse> getList() {
		return list;
	}
	public void setList(List<StuCourse> list) {
		this.list = list;
	}
	
}
