package rainbow.example.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.Student;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.UserException;
import rainbow.example.service.TempleStuDAOService;
import rainbow.example.service.TempleTeacherDAOService;
import rainbow.example.util.ValidateUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4730714773607758673L;

	private Student user;
//	private 

	private TempleStuDAOService<Student> userService;
	private TempleTeacherDAOService<Teacher> teacherDAOService;

	private String searchText;

	@SuppressWarnings("unused")
	public String doLogin(){
		String result = "";
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("user.idStu");
		String psw = request.getParameter("user.pswStu");
		Student loginUser;
//		Teacher teacher;
		try {
			loginUser = userService.doLogin(id, psw);
//			teacher = teacherDAOService.doLogin(id, psw);
			if (loginUser == null /*|| teacher == null*/){
				result = "exception";
			} else if(loginUser != null){
				ActionContext.getContext().getSession().put("userinfo", loginUser);
				result = SUCCESS;
			}/*else if(teacher != null){
				ActionContext.getContext().getSession().put("userinfo", teacher);
				result = SUCCESS;
			}*/
		} catch (UserException e) {
			// TODO: handle exception
			ValidateUtil.validateErr(request, e.getMessage());
			result = "exception";
		}
		return result;
	}

	public TempleStuDAOService<Student> getUserService() {
		return userService;
	}

	public void setUserService(TempleStuDAOService<Student> userService) {
		this.userService = userService;
	}


	public Student getUser() {
		return user;
	}

	public void setUser(Student user) {
		this.user = user;
	}

	public TempleTeacherDAOService<Teacher> getTeacherDAOService() {
		return teacherDAOService;
	}

	public void setTeacherDAOService(
			TempleTeacherDAOService<Teacher> teacherDAOService) {
		this.teacherDAOService = teacherDAOService;
	}
}
