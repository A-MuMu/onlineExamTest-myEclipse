package rainbow.example.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.Teacher;
import rainbow.example.service.TempleTeacherDAOService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherPersonCheck extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1926846696951180974L;
	
	private Teacher teacher;
	private TempleTeacherDAOService<Teacher> teacherDAOService;
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	
	public void checkTeaPersonal(){
		System.out.println("~~~~~~~进来修改信息~~~~~~");
		
		teacher = (Teacher) ActionContext.getContext().getSession().get("userinfo");
		
		teacher.setEmailTea(request.getParameter("email"));
		System.out.println(teacher.getEmailTea()+"~~~~~~~~~~~~~~~~~~~"+teacher.getName());
		teacher.setTel(request.getParameter("tel"));
		teacher.setSushe(request.getParameter("sushe"));
		teacher.setSusheTel(request.getParameter("susheTel"));
		teacher.setHome(request.getParameter("home"));
		teacher.setHomeTel(request.getParameter("homeTel"));
		teacher.setYoubian(request.getParameter("youbian"));
//		teacher.setName("张舒");
		teacher.setName(teacher.getName());
		System.out.println(teacher.getEmailTea()+"~~~~~~~~~~~~~~~~~~~"+teacher.getName());
		
		teacherDAOService.updateObject(teacher);
		
		try {
			response.getWriter().write("1");// 将值写入页面
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public TempleTeacherDAOService<Teacher> getTeacherDAOService() {
		return teacherDAOService;
	}
	public void setTeacherDAOService(TempleTeacherDAOService<Teacher> teacherDAOService) {
		this.teacherDAOService = teacherDAOService;
	}

}
