package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.ShiJuan;
import rainbow.example.domain.StuCourse;
import rainbow.example.domain.Student;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.XueKe;
import rainbow.example.service.TempleCourseDAOService;
import rainbow.example.service.TempleShiJuanDAOService;
import rainbow.example.service.TempleStuCourseDaoService;
import rainbow.example.service.TempleStuDAOService;
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
	private TempleStuDAOService<Student> templeStuDAOService;
	private TempleStuCourseDaoService templeStuCourseDaoService;
	private TempleShiJuanDAOService<ShiJuan> templeShiJuanDAOService;
	private Teacher teacher;
	private XueKe xueKe;
	private List<String> xkNames = new ArrayList<String>();
	private List<StuCourse> stuCs = new ArrayList<StuCourse>();
	private String num;
	private ShiJuan sj;
	
	HttpServletRequest request = ServletActionContext.getRequest();

	public String getXkNameByTea() {
		teacher = (Teacher) ActionContext.getContext().getSession()
				.get("userinfo");
		System.out.println(teacher.getName() + "~~~~~~~~~~~~~~~");		
		xkNames = templeXkDaoService.getNameByTea(teacher);
		getStuByTea();
		ActionContext.getContext().getSession().put("xkNames", xkNames);
		return SUCCESS;
	}

	public void getStuByTea() {
		// 获取老师所教学的课程
		for (int i = 0; i < xkNames.size(); i++) {
			if (templeStuCourseDaoService.queryDaAns(xkNames.get(i))!=null) {
				stuCs.addAll(templeStuCourseDaoService.queryDaAns(xkNames.get(i)));
			}
		}
		System.out.println(stuCs.get(1).getDate()+"%%%%%%%%%%%%%%%%");
		ActionContext.getContext().getSession().put("stuCs", stuCs);
	}

	public String chaJuan(){
		num = request.getParameter("num");
		
		sj = templeShiJuanDAOService.getByID(num);
		System.out.println(num+"......................"+sj.getStuId()+"...........");
		ActionContext.getContext().getSession().put("sj", sj);
		return SUCCESS;
	}
	
	public TempleStuCourseDaoService getTempleStuCourseDaoService() {
		return templeStuCourseDaoService;
	}

	public void setTempleStuCourseDaoService(
			TempleStuCourseDaoService templeStuCourseDaoService) {
		this.templeStuCourseDaoService = templeStuCourseDaoService;
	}

	public TempleStuDAOService<Student> getTempleStuDAOService() {
		return templeStuDAOService;
	}

	public void setTempleStuDAOService(
			TempleStuDAOService<Student> templeStuDAOService) {
		this.templeStuDAOService = templeStuDAOService;
	}

	public TempleCourseDAOService<Teacher> getTempleCourseDAOService() {
		return templeCourseDAOService;
	}

	public void setTempleCourseDAOService(
			TempleCourseDAOService<Teacher> templeCourseDAOService) {
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
	
	public TempleShiJuanDAOService<ShiJuan> getTempleShiJuanDAOService() {
		return templeShiJuanDAOService;
	}

	public void setTempleShiJuanDAOService(
			TempleShiJuanDAOService<ShiJuan> templeShiJuanDAOService) {
		this.templeShiJuanDAOService = templeShiJuanDAOService;
	}

	public XueKe getXueKe() {
		return xueKe;
	}

	public void setXueKe(XueKe xueKe) {
		this.xueKe = xueKe;
	}
}
