package rainbow.example.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.Student;
import rainbow.example.domain.Teacher;
import rainbow.example.domain.User;
import rainbow.example.domain.UserException;
import rainbow.example.service.TempleLoginService;
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

	private TempleStuDAOService<Student> userService;
	private TempleTeacherDAOService<Teacher> teacherDAOService;
	private TempleLoginService templeLoginService;

	@SuppressWarnings("unused")
	public String doLogin() {
		String result = "exception";
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("loginID");
		String psw = request.getParameter("loginPSW");
		User loginUser;
		try {
			// loginUser = userService.doLogin(id, psw);
			loginUser = templeLoginService.doLogin(id, psw);
			System.out.println(loginUser.getId().getId() + "****LoginAction****" + loginUser.getId().getPsw());

			if (loginUser == null) {
				result = "exception";
			} else if (loginUser != null) {
				Student student = userService.getOne(loginUser.getId().getId());
				if (student != null) {
					ActionContext.getContext().getSession().put("userinfo", student);
					result = "student";
				} else {
					Teacher teacher = teacherDAOService.getOne(loginUser.getId().getId());
					if (teacher != null) {
						ActionContext.getContext().getSession().put("userinfo", teacher);
						result = "teacher";
					}
				}
			}
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

	public TempleTeacherDAOService<Teacher> getTeacherDAOService() {
		return teacherDAOService;
	}

	public void setTeacherDAOService(TempleTeacherDAOService<Teacher> teacherDAOService) {
		this.teacherDAOService = teacherDAOService;
	}

	public TempleLoginService getTempleLoginService() {
		return templeLoginService;
	}

	public void setTempleLoginService(TempleLoginService templeLoginService) {
		this.templeLoginService = templeLoginService;
	}
}
