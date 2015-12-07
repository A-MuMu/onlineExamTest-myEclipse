package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.Teacher;
import rainbow.example.service.TempleTeacherDAOService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherMagamentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2888290688253649205L;
	
	private TempleTeacherDAOService<Teacher> teacherDAOService;
	
	HttpServletRequest request = ServletActionContext.getRequest();

	static List<Teacher> list = new ArrayList<Teacher>();

	public void stu() {
		list = (List<Teacher>) teacherDAOService.getAllObjects(Teacher.class);
		if (list == null) {
			
			;
		} else {
//			System.out.println("~~~");
			ActionContext.getContext().getSession().put("magament_tea", list);
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
			Teacher student = new Teacher();
			Long num = new Long(list.size());
			System.out.println(num);
			student.setId(num+1);
			student.setTeaId(xuehao);
			student.setName(xingming);
			student.setPwsTea(mima);
			student.setEmailTea(youX);
			try {
				teacherDAOService.addUser(student);
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
		Teacher student = new Teacher();
		Long n = new Long(i);
		System.out.println(n);
		student.setId(n+1);
		student.setTeaId(xuehao);
		student.setName(xingming);
		student.setPwsTea(mima);
		student.setEmailTea(youX);
		teacherDAOService.deleteObject(student);
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
		Teacher student = new Teacher();
		Long n = new Long(i);
		System.out.println(n);
		student.setId(n+1);
		student.setTeaId(xuehao);
		student.setName(xingming);
		student.setPwsTea(mima);
		student.setEmailTea(youX);
		teacherDAOService.updateObject(student);
		return SUCCESS;
	}

	public TempleTeacherDAOService<Teacher> getTeacherDAOService() {
		return teacherDAOService;
	}

	public void setTeacherDAOService(TempleTeacherDAOService<Teacher> teacherDAOService) {
		this.teacherDAOService = teacherDAOService;
	}
}
