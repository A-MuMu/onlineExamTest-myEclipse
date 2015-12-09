package rainbow.example.service;

import java.util.List;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.Course;
import rainbow.example.domain.Student;
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
		String hqlString = "SELECT xk FROM XueKe xk WHERE xk.id.xkid="+xkID;
		List<XueKe> xks = dao.getObjects(hqlString);
		return xks;
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
