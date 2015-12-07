package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.support.StaticApplicationContext;

import rainbow.example.domain.Student;
import rainbow.example.service.TempleStuDAOService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MagamentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8950122478844670120L;

	private TempleStuDAOService<Student> templeStuDAOService;

	HttpServletRequest request = ServletActionContext.getRequest();

	static List<Student> list = new ArrayList<Student>();

	public void stu() {
		list = (List<Student>) templeStuDAOService.getAllObjects(Student.class);
		if (list == null) {
			;
		} else {
			ActionContext.getContext().getSession().put("magament_stu", list);
		}

	}

	public String stucheck() {
		// int j_add = 0;
		// int j_delete = 0;
		if (request.getParameter("stuadd") != null) {
			add();
		}
		for (int i = 0; i < list.size(); i++) {
			String stuxiugai = "stuxiugai";
			String studelete = "studelete";
//			System.out.println(i);
			stuxiugai = stuxiugai + 4 * i;
			studelete = studelete + 4 * i;
//			System.out.println(studelete+"~~~"+stuxiugai);
			if (request.getParameter(stuxiugai) != null) {
//				System.out.println(stuxiugai+"~~~~~~"+i);
				xiugai(i);
			} else if (request.getParameter(studelete) != null) {
//				System.out.println("~~~~~~"+i);
				delete(i);
			}
		}
		return SUCCESS;
	}

	public String add() {
		System.out.println("add");
		String xuehao = request.getParameter("-1");
		String xingming = request.getParameter("-2");
		String mima = request.getParameter("-3");
		String youX = request.getParameter("-4");
		System.out.println(xuehao);
		if (xuehao == null || "".equals(xuehao.trim()) || xingming == null
				|| "".equals(xingming.trim()) || mima == null
				|| "".equals(mima.trim()) || youX == null
				|| "".equals(youX.trim())) {
			;
		} else {
			Student student = new Student();
			System.out.println(list.size());
			student.setId(list.size() + 1);
			student.setIdStu(xuehao);
			student.setNameStu(xingming);
			student.setPswStu(mima);
			student.setEmailStu(youX);
			try {
				templeStuDAOService.addUser(student);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return SUCCESS;
	}

	public String delete(int i) {
		String delete = "studelete";
		delete = delete + 4 * i;
		int num = 4*i;
		String xuehao = request.getParameter(num+1+"");
		String xingming = request.getParameter(num+2+"");
		String mima = request.getParameter(num+3+"");
		String youX = request.getParameter(num+4+"");
//		System.out.println(xuehao+"~~~"+xingming+"~~`"+i);
		Student student = new Student();
		student.setId(i+1);
		student.setIdStu(xuehao);
		student.setNameStu(xingming);
		student.setPswStu(mima);
		student.setEmailStu(youX);
		templeStuDAOService.deleteObject(student);
		return SUCCESS;
	}

	public String xiugai(int i) {
		String stuxiugai = "stuxiugai";
		stuxiugai = stuxiugai + 4 * i;
		int num = 4*i;
		String xuehao = request.getParameter(num+1+"");
		String xingming = request.getParameter(num+2+"");
		String mima = request.getParameter(num+3+"");
		String youX = request.getParameter(num+4+"");
		Student student = new Student();
		student.setId(i+1);
		student.setIdStu(xuehao);
		student.setNameStu(xingming);
		student.setPswStu(mima);
		student.setEmailStu(youX);
		templeStuDAOService.updateObject(student);
		return SUCCESS;
	}

	public TempleStuDAOService<Student> getTempleStuDAOService() {
		return templeStuDAOService;
	}

	public void setTempleStuDAOService(
			TempleStuDAOService<Student> templeStuDAOService) {
		this.templeStuDAOService = templeStuDAOService;
	}

}
