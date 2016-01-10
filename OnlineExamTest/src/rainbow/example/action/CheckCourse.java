package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.Course;
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
	private Teacher teacher;
	private XueKe xueKe;
	
	public String getXkNameByTea(){
		teacher = (Teacher) ActionContext.getContext().getSession().get("userinfo");
		List<String> xkNames =  new ArrayList<String>();
		xkNames = templeXkDaoService.getNameByTea(teacher);
		ActionContext.getContext().getSession().put("xkNames", xkNames);
		return SUCCESS;
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
