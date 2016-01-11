package rainbow.example.service;

import java.util.ArrayList;
import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Course;
import rainbow.example.domain.Student;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.XueKe;
import rainbow.example.domain.XueKeId;

public class TempleCourseDAOService<T> {
	private TempleDAO dao;
	private Course course;
	private Student student;
	private XueKe xueke;

	// 信息获取
	public List<T> queryUsers(Student stu) {
		int idString = stu.getId();
		String queryString1 = "SELECT c FROM Course c WHERE c.student.id = "
				+ idString;
		List<T> courses = dao.getObjects(queryString1);
		if (courses.size() == 0) {
			return null;
		} else {
			return courses;
		}
	}

	// 获取学科名称
	public List<XueKe> queryXueKes(Long xkID) {
		String hqlString = "SELECT xk FROM XueKe xk WHERE xk.id.xkid=" + xkID;
		List<XueKe> xks = dao.getObjects(hqlString);
		return xks;
	}

	// 老师获取学科
	public List<XueKe> getXKs(Teacher teacher) {
		String hql = "SELECT xk FROM XueKe xk WHERE xk.teacher.id = "
				+ teacher.getId();
		List<XueKe> list = dao.getObjects(hql);
		if (list.size() == 0) {
			return null;
		} else
			return list;
	}

	// SQL老师查询学生

	public List<Integer> getStus(Teacher teacher) {
		List<Integer> stus = null;
		System.out.print(teacher.getId() + "@@");
		String queryString = "SELECT stu.id FROM Student stu WHERE stu.id = any("
				+ "SELECT c.stuID FROM Course c WHERE c.TeaID = "
				+ teacher.getId() + ")";
		stus = dao.queryBySql(queryString);
		System.out.print(stus.size() + "@@" + "###");
		if (stus.size() == 0) {
			return null;
		} else
			return stus;
	}

	public void addUser(T user) throws Exception {
		dao.addObject(user);
	}

	public void modifyUser(T user) throws Exception {
		dao.updateObject(user);
	}

	public void deleteUser(int id, Class<T> clazz) throws Exception {
		T u = dao.getObject(clazz, id);
		dao.deleteObject(u);
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public XueKe getXueke() {
		return xueke;
	}

	public void setXueke(XueKe xueke) {
		this.xueke = xueke;
	}

}
