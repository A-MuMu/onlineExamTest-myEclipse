package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.domain.ShiJuan;
import rainbow.example.domain.StuCourse;
import rainbow.example.domain.Student;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.XueKe;
import rainbow.example.service.TempleCourseDAOService;
import rainbow.example.service.TempleDaAnDAOService;
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
	private TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService;
	private Teacher teacher;
	private XueKe xueKe;
	private List<String> xkNames = new ArrayList<String>();
	private List<StuCourse> stuCs = new ArrayList<StuCourse>();
	private String num , No , daNo;
	private ShiJuan sj;
	private DaAnJuan daAnJuan;
	
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
		stuCs.clear();
		for (int i = 0; i < xkNames.size(); i++) {
			if (templeStuCourseDaoService.queryDaAns(xkNames.get(i))!=null) {
				stuCs.addAll(templeStuCourseDaoService.queryDaAns(xkNames.get(i)));
			}
			System.out.println(xkNames.size()+"@@"+stuCs.size()+"@@@"+stuCs.get(i).getId().getShijuan()+"%%%"+stuCs.get(1).getId().getShijuan());
		}
		
		ActionContext.getContext().getSession().put("stuCs", stuCs);
	}

	public String chaJuan(){
		num = request.getParameter("num");
		
		sj = templeShiJuanDAOService.getByID(num);
		System.out.println(num+"......................"+sj.getStuId()+"...........");
		ActionContext.getContext().getSession().put("sj", sj);
		return SUCCESS;
	}
	
	public String gaiJuan(){
		No = request.getParameter("No");
		daNo = request.getParameter("daNo");
		System.out.println(No+"!!!!!!!!!!!!!!!"+daNo);
		
		sj = templeShiJuanDAOService.getByID(No);
		daAnJuan = templeDaAnDAOService.getByID(daNo);
		
		System.out.println(daAnJuan.getNameXk()+"``````````````"+sj.getStuId()+"`````````````");
		ActionContext.getContext().getSession().put("sj", sj);
		ActionContext.getContext().getSession().put("dj", daAnJuan);
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

	public TempleDaAnDAOService<DaAnJuan> getTempleDaAnDAOService() {
		return templeDaAnDAOService;
	}

	public void setTempleDaAnDAOService(
			TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService) {
		this.templeDaAnDAOService = templeDaAnDAOService;
	}
	
}
