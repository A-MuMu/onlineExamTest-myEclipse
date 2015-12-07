package rainbow.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.XuanZe;
import rainbow.example.service.TempleXuanZeDAOService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class XuanZeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8178649518582631732L;

	private TempleXuanZeDAOService<XuanZe> templeXuanZeDAOService;

	HttpServletRequest request = ServletActionContext.getRequest();

	static List<XuanZe> list = new ArrayList<XuanZe>();

	public void stu() {
		list = (List<XuanZe>) templeXuanZeDAOService
				.getAllObjects(XuanZe.class);
		if (list == null) {
			System.out.println("~~~");
			;
		} else {
			// System.out.println("~~~");
			ActionContext.getContext().getSession().put("magament_xz", list);
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
			// System.out.println(i);
			stuxiugai = stuxiugai + 8 * i;
			studelete = studelete + 8 * i;
			// System.out.println(studelete+"~~~"+stuxiugai);
			if (request.getParameter(stuxiugai) != null) {
				// System.out.println(stuxiugai+"~~~~~~"+i);
				xiugai(i);
			} else if (request.getParameter(studelete) != null) {
				// System.out.println("~~~~~~"+i);
				delete(i);
			}
		}
		return SUCCESS;
	}

	public String add() {
		System.out.println("add");
		String th = request.getParameter("-1");
		String tm = request.getParameter("-2");
		String da = request.getParameter("-3");
		String nd = request.getParameter("-4");
		String a = request.getParameter("-5");
		String b = request.getParameter("-6");
		String c = request.getParameter("-7");
		String d = request.getParameter("-8");
		System.out.println(tm);
		if (th == null || "".equals(th.trim()) || tm == null
				|| "".equals(tm.trim()) || da == null || "".equals(da.trim())
				|| nd == null || "".equals(nd.trim()) || a == null
				|| "".equals(a.trim()) || b == null || "".equals(b.trim())
				|| c == null || "".equals(c.trim()) || d == null
				|| "".equals(d.trim())) {
			;
		} else {
			XuanZe student = new XuanZe();
			Long num = new Long(list.size());
			System.out.println(num);
			student.setXzid(num + 1);
			student.setTiMu(tm);
			student.setA(a);
			student.setB(b);
			student.setC(c);
			student.setD(d);
			student.setType(nd);
			student.setDaAn(da);
			try {
				templeXuanZeDAOService.addUser(student);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return SUCCESS;
	}

	public String delete(int i) {
		String delete = "studelete";
		delete = delete + 8 * i;
		int num = 8 * i;
		String th = request.getParameter(num + 1 + "");
		String tm = request.getParameter(num + 2 + "");
		String da = request.getParameter(num + 3 + "");
		String nd = request.getParameter(num + 4 + "");
		String a = request.getParameter(num + 5 + "");
		String b = request.getParameter(num + 6 + "");
		String c = request.getParameter(num + 7 + "");
		String d = request.getParameter(num + 8 + "");
		// System.out.println(xuehao+"~~~"+xingming+"~~`"+i);
		XuanZe student = new XuanZe();
		Long n = new Long(i);
		System.out.println(n);
		student.setXzid(n + 1);
		student.setTiMu(tm);
		student.setA(a);
		student.setB(b);
		student.setC(c);
		student.setD(d);
		student.setType(nd);
		student.setDaAn(da);
		templeXuanZeDAOService.deleteObject(student);
		return SUCCESS;
	}

	public String xiugai(int i) {
		String stuxiugai = "stuxiugai";
		stuxiugai = stuxiugai + 8 * i;
		int num = 8 * i;
		String th = request.getParameter(num + 1 + "");
		String tm = request.getParameter(num + 2 + "");
		String da = request.getParameter(num + 3 + "");
		String nd = request.getParameter(num + 4 + "");
		String a = request.getParameter(num + 5 + "");
		String b = request.getParameter(num + 6 + "");
		String c = request.getParameter(num + 7 + "");
		String d = request.getParameter(num + 8 + "");
		XuanZe student = new XuanZe();
		Long n = new Long(i);
		System.out.println(n);
		student.setXzid(n + 1);
		student.setTiMu(tm);
		student.setA(a);
		student.setB(b);
		student.setC(c);
		student.setD(d);
		student.setType(nd);
		student.setDaAn(da);
		templeXuanZeDAOService.updateObject(student);
		return SUCCESS;
	}

	public TempleXuanZeDAOService<XuanZe> getTempleXuanZeDAOService() {
		return templeXuanZeDAOService;
	}

	public void setTempleXuanZeDAOService(
			TempleXuanZeDAOService<XuanZe> templeXuanZeDAOService) {
		this.templeXuanZeDAOService = templeXuanZeDAOService;
	}

}
