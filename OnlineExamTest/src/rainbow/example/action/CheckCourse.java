package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.Course;
import rainbow.example.domain.Student;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.XueKe;
import rainbow.example.service.TempleCourseDAOService;
import rainbow.example.service.TempleXkDaoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckCourse extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3420491327966290730L;

	private TempleXkDaoService templeXkDaoService;
	private TempleCourseDAOService<Teacher> templeCourseDAOService;
	private Teacher teacher ;
	private XueKe xueKe;
	
	public String getXkNameByTea(){		
		teacher = (Teacher) ActionContext.getContext().getSession().get("userinfo");
		System.out.println(teacher.getName()+"~~~~~~~~~~~~~~~");
		List<String> xkNames =  new ArrayList<String>();
		xkNames = templeXkDaoService.getNameByTea(teacher);
		getStuByTea();
		ActionContext.getContext().getSession().put("xkNames", xkNames);
		return SUCCESS;
	}
	
	public void getStuByTea(){
		List<Student> stus = new ArrayList<Student>();
		stus = templeCourseDAOService.getStus(teacher);
		ActionContext.getContext().getSession().put("stus", stus);
//		for (int i = 0; i < stus.size(); i++) {
//			System.out.println(stus.get(i).getNameStu()+"********************");
//		}
	}
	
	public TempleCourseDAOService<Teacher> getTempleCourseDAOService() {
		return templeCourseDAOService;
	}

	public void setTempleCourseDAOService(TempleCourseDAOService<Teacher> templeCourseDAOService) {
		this.templeCourseDAOService = templeCourseDAOService;
	}

	public TempleXkDaoService getTempleXkDaoService() {
		return templeXkDaoService;
	}

	public void setTempleXkDaoService(TempleXkDaoService templeXkDaoService) {
		this.templeXkDaoService = templeXkDaoService;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public XueKe getXueKe() {
		return xueKe;
	}

	public void setXueKe(XueKe xueKe) {
		this.xueKe = xueKe;
	}
}
