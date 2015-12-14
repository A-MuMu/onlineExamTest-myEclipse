package rainbow.example.action;

import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Controller;

import rainbow.example.domain.Course;
import rainbow.example.domain.DaAnJuan;
import rainbow.example.domain.KeGuan;
import rainbow.example.domain.PangDuan;
import rainbow.example.domain.ShiJuan;
import rainbow.example.domain.Student;
import rainbow.example.domain.XuanZe;
import rainbow.example.domain.XueKe;
import rainbow.example.service.TempleCourseDAOService;
import rainbow.example.service.TempleDaAnDAOService;
import rainbow.example.service.TemplePangDuanDAOService;
import rainbow.example.service.TempleShiJuanDAOService;
import rainbow.example.service.TempleTiMuDAOService;
import rainbow.example.service.TempleXuanZeDAOService;
import rainbow.example.service.TempleZhuGuanDAOService;
import rainbow.example.util.DaAn2sql;
import rainbow.example.util.TrueORfalse;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@ParentPackage("json-default")
// 注意这边要加 json 默认不是json的
public class KaoShiAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2418277377162128674L;
	Map<String, Object> session = null;
	static final Logger logger = Logger.getLogger(KaoShiAction.class);
	private TempleCourseDAOService<Course> templeCourseDAOService;
	private TempleTiMuDAOService<XuanZe> templeTiMuDAOService;
	private TemplePangDuanDAOService<PangDuan> templePangDuanDAOService;
	private TempleZhuGuanDAOService<KeGuan> templeZhuGuanDAOService;
	private TempleShiJuanDAOService<ShiJuan> templeShiJuanDAOService;
	private TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService;
	private TempleXuanZeDAOService<XuanZe> templeXuanZeDAOService;

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();

	static List<XuanZe> list_1 = new ArrayList<XuanZe>();
	static List<PangDuan> list_pdDuans_1 = new ArrayList<PangDuan>();
	static List<KeGuan> list_zg_1 = new ArrayList<KeGuan>();
	static List<XuanZe> list_2 = new ArrayList<XuanZe>();
	static List<PangDuan> list_pdDuans_2 = new ArrayList<PangDuan>();
	static List<KeGuan> list_zg_2 = new ArrayList<KeGuan>();
	List<XuanZe> list_hard = new ArrayList<XuanZe>();
	List<XuanZe> list_easy = new ArrayList<XuanZe>();
	List<PangDuan> pd_hard = new ArrayList<PangDuan>();
	List<PangDuan> pd_easy = new ArrayList<PangDuan>();
	List<KeGuan> zg_hard = new ArrayList<KeGuan>();
	List<KeGuan> zg_easy = new ArrayList<KeGuan>();

	static int num_point_hard = 0;// 标志
	static int num_point_easy = 0;// 标志
	private static int flog = 0;// 标志,应该为MAP，一个学科对应一个值，一个学科做一次，未实现,static 先不用
//	static Map<String, Integer> flogMap;
//	private int flog = 0;

	ShiJuan shiJuan_hard = new ShiJuan();
	ShiJuan shiJuan_easy = new ShiJuan();
	static Student stu = new Student();
	static int mid;
	private static String myNameXK;
	private static String course_lastTime;

	public void findCourse() {
		session = ActionContext.getContext().getSession();
		// Student
		stu = (Student) session.get("userinfo");
		List<String> xkNames = new ArrayList<String>();
		try {
			List<Course> courses = templeCourseDAOService.queryUsers(stu);
			if (courses == null) {
				System.out.println("~~~");
			} else {
				ListIterator<Course> li = courses.listIterator();
				Course course = null;
				List<XueKe> xueKe = null;
				while (li.hasNext()) {
					course = (Course) li.next();
					System.out.println(course.getXueKe().getId());
					// 学科ID 和 TeacherID 有点乱
					System.out.println("TeacherID:"
							+ course.getXueKe().getId().getXkid() + "  "
							+ "学科ID:" + course.getXueKe().getId().getTeaId());
					xueKe = templeCourseDAOService.queryXueKes(course
							.getXueKe().getId().getXkid());
					Iterator<XueKe> iterator = xueKe.iterator();
					while (iterator.hasNext()) {
						// System.out.println(iterator.next().getNameXk());
						xkNames.add(iterator.next().getNameXk());
					}
				}
			}
			for (int i = 0; i < xkNames.size(); i++) {
//				flogMap.put(xkNames.get(i), 0);
				System.out.println(xkNames.get(i));
//				System.out.println("*************************"+flogMap.get(xkNames.get(i))
//						+ "*************************");
			}
			ActionContext.getContext().getSession().put("xkNames", xkNames);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public String showCourse() {
		String string = (String) request.getParameter("mod");
		System.out.println(string);
		/*
		 * if (string.equals("JAVA")) { course = "JAVA"; } else if
		 * (string.equals("操作系统")) { course = "操作系统"; } else if
		 * (string.equals("软件工程")) { course = "软件工程"; } else if
		 * (string.equals("数据结构")) { course = "数据结构"; } else if
		 * (string.equals("LINUX")) { course = "LINUX"; } else if
		 * (string.equals("JAVAEE")) { course = "JAVAEE"; }
		 */
		if (string != null) {
			course_lastTime = string;
			ActionContext.getContext().getSession().put("course", string);
			xkIDselected(string);
		}
		return SUCCESS;
	}

	public void xkIDselected(String string) {
		System.out.print("*********************"+course_lastTime+"*********************");
		this.myNameXK = course_lastTime;
		System.out.println(this.myNameXK);
//		flog = flogMap.get(this.myNameXK);
		System.out.print("*********************"+flog+"*********************");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~出题~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public String intoKaoShi() {
		if (flog == 0 ) {
			flog++;
			mid = Integer.parseInt(request.getParameter("mid"));
			String course = (String) ActionContext.getContext().getSession()
					.get("course");

			int num_xz_hard;
			int num_pd_hard;
			int num_tk_hard;
			int num_zg_hard;

			list_hard = findXZ("hard", course);// 10个 0-9
			pd_hard = findPD("hard", course);
			zg_hard = findZG("hard", course);
			list_easy = findXZ("easy", course);// 8个 0-7
			pd_easy = findPD("easy", course);
			zg_easy = findZG("easy", course);

			System.out.println("选择题hard数组大小" + list_hard.size());
			System.out.println("选择题easy数组大小" + list_easy.size());
			System.out.println("判断题hard数组大小" + pd_hard.size());
			System.out.println("判断题easy数组大小" + pd_easy.size());
			System.out.println("主观题hard数组大小" + zg_hard.size());
			System.out.println("主观题easy数组大小" + zg_easy.size());

			if (mid == 1 && num_point_hard == 0) {
				num_point_hard++;
				num_xz_hard = 3;// 表示 10-3=7，从第四题开始是难度大的
				num_pd_hard = 3;// 表示 10-3=7，从第四题开始是难度大的
				num_tk_hard = 1;// 表示 5-3=2，从第三题开始是难度大的
				num_zg_hard = 1;// 表示 5-3=2，从第三题开始是难度大的
				for (int j = 0; j < 3; j++) {
					if (j < num_zg_hard) {
						list_zg_1.add(j, zg_easy.get(j));
					} else {
						list_zg_1.add(j, zg_hard.get(j - num_zg_hard));
					}
				}
				for (int i = 0; i < 10; i++) {
					if (i < num_xz_hard) {
						list_1.add(i, list_easy.get(i));
						list_pdDuans_1.add(i, pd_easy.get(i));
					} else if (i >= num_xz_hard) {
						list_1.add(i, list_hard.get(i - num_xz_hard));
						list_pdDuans_1.add(i, pd_hard.get(i - num_pd_hard));
					}
				}
			} else if (mid == 2 && num_point_easy == 0) {
				num_point_easy++;
				num_xz_hard = 5;
				num_pd_hard = 5;
				num_tk_hard = 2;
				num_zg_hard = 2;
				for (int i = 0; i < 10; i++) {
					if (i < num_xz_hard) {
						list_2.add(i, list_easy.get(i));
						list_pdDuans_2.add(i, pd_easy.get(i));
					} else if (i >= num_xz_hard) {
						list_2.add(i, list_hard.get(9 - i));
						list_pdDuans_2.add(i, pd_hard.get(i - num_xz_hard));
					}
				}
				for (int j = 0; j < 3; j++) {
					if (j < num_zg_hard) {
						list_zg_2.add(j, zg_easy.get(j));
					} else {
						list_zg_2.add(j, zg_hard.get(j - num_zg_hard));
					}
				}
			}
			if (mid == 1) {
				ActionContext.getContext().getSession().put("xuanze", list_1);
				ActionContext.getContext().getSession()
						.put("pangduan", list_pdDuans_1);
				ActionContext.getContext().getSession()
						.put("zhuguan", list_zg_1);
			} else if (mid == 2) {
				ActionContext.getContext().getSession().put("xuanze", list_2);
				ActionContext.getContext().getSession()
						.put("pangduan", list_pdDuans_2);
				ActionContext.getContext().getSession()
						.put("zhuguan", list_zg_2);
			}
			System.out.println("~~~~~~" + num_point_hard + "~~~~~~"
					+ num_point_easy + "**********" + myNameXK+ "**********" +flog);
			if (num_point_hard == 1) {
				addShiJuan_hard();
			}
			if (num_point_easy == 1) {
				addShiJuan_easy();
			}

			return SUCCESS;
		} else {
			ActionContext.getContext().getSession().put("flog", flog);
			return ERROR;
		}
	}

	public void addShiJuan_hard() {
		ShiJuan shiJuan = new ShiJuan();
		Long num_shijuan = findShiJuanNum(ShiJuan.class);

		shiJuan.setSjId(num_shijuan + 1);
		shiJuan.setStuId(stu.getId().longValue());
		shiJuan.setNameXK(this.myNameXK);
		System.out.println(num_shijuan + "#############" + this.myNameXK);

		int i = 0;
		//传选择、判断、问答对象到改卷util
		TrueORfalse.setListXuanZes(list_1);
		TrueORfalse.setListPangDuans(list_pdDuans_1);
		TrueORfalse.setListZhuGuans(list_zg_1);
		
		//为试卷domain添加属性
		shiJuan.setKeGuanByZhuguan1(list_zg_1.get(i));
		shiJuan.setKeGuanByZhuguan2(list_zg_1.get(i + 1));
		shiJuan.setKeGuanByZhuguan3(list_zg_1.get(i + 2));

		shiJuan.setPangDuanByPangduan1(list_pdDuans_1.get(i));
		shiJuan.setPangDuanByPangduan2(list_pdDuans_1.get(i + 1));
		shiJuan.setPangDuanByPangduan3(list_pdDuans_1.get(i + 2));
		shiJuan.setPangDuanByPangduan4(list_pdDuans_1.get(i + 3));
		shiJuan.setPangDuanByPangduan5(list_pdDuans_1.get(i + 4));
		shiJuan.setPangDuanByPangduan6(list_pdDuans_1.get(i + 5));
		shiJuan.setPangDuanByPangduan7(list_pdDuans_1.get(i + 6));
		shiJuan.setPangDuanByPangduan8(list_pdDuans_1.get(i + 7));
		shiJuan.setPangDuanByPangduan9(list_pdDuans_1.get(i + 8));
		shiJuan.setPangDuanByPangduan10(list_pdDuans_1.get(i + 9));

		shiJuan.setXuanZeByXuanze1(list_1.get(i));
		shiJuan.setXuanZeByXuanze2(list_1.get(i + 1));
		shiJuan.setXuanZeByXuanze3(list_1.get(i + 2));
		shiJuan.setXuanZeByXuanze4(list_1.get(i + 3));
		shiJuan.setXuanZeByXuanze5(list_1.get(i + 4));
		shiJuan.setXuanZeByXuanze6(list_1.get(i + 5));
		shiJuan.setXuanZeByXuanze7(list_1.get(i + 6));
		shiJuan.setXuanZeByXuanze8(list_1.get(i + 7));
		shiJuan.setXuanZeByXuanze9(list_1.get(i + 8));
		shiJuan.setXuanZeByXuanze10(list_1.get(i + 9));

		System.out.println(shiJuan.getKeGuanByZhuguan1().getTiMu());
		templeShiJuanDAOService.add(shiJuan);
		DaAn2sql.setShiJuan(shiJuan);
		shiJuan_hard = shiJuan;
		num_point_hard++;
	}

	public void addShiJuan_easy() {
		ShiJuan shiJuan = new ShiJuan();
		Long num_shijuan = findShiJuanNum(ShiJuan.class);

		shiJuan.setSjId(num_shijuan + 1);
		shiJuan.setStuId(stu.getId().longValue());
		shiJuan.setNameXK(this.myNameXK);
		System.out.println(num_shijuan + "#############" + this.myNameXK);

		int i = 0;
		//传选择、判断、问答对象到改卷util
		TrueORfalse.setListXuanZes(list_2);
		TrueORfalse.setListPangDuans(list_pdDuans_2);
		TrueORfalse.setListZhuGuans(list_zg_2);
		
		//为试卷domain添加属性
		shiJuan.setKeGuanByZhuguan1(list_zg_2.get(i));
		shiJuan.setKeGuanByZhuguan2(list_zg_2.get(i + 1));
		shiJuan.setKeGuanByZhuguan3(list_zg_2.get(i + 2));

		shiJuan.setPangDuanByPangduan1(list_pdDuans_2.get(i));
		shiJuan.setPangDuanByPangduan2(list_pdDuans_2.get(i + 1));
		shiJuan.setPangDuanByPangduan3(list_pdDuans_2.get(i + 2));
		shiJuan.setPangDuanByPangduan4(list_pdDuans_2.get(i + 3));
		shiJuan.setPangDuanByPangduan5(list_pdDuans_2.get(i + 4));
		shiJuan.setPangDuanByPangduan6(list_pdDuans_2.get(i + 5));
		shiJuan.setPangDuanByPangduan7(list_pdDuans_2.get(i + 6));
		shiJuan.setPangDuanByPangduan8(list_pdDuans_2.get(i + 7));
		shiJuan.setPangDuanByPangduan9(list_pdDuans_2.get(i + 8));
		shiJuan.setPangDuanByPangduan10(list_pdDuans_2.get(i + 9));

		shiJuan.setXuanZeByXuanze1(list_2.get(i));
		shiJuan.setXuanZeByXuanze2(list_2.get(i + 1));
		shiJuan.setXuanZeByXuanze3(list_2.get(i + 2));
		shiJuan.setXuanZeByXuanze4(list_2.get(i + 3));
		shiJuan.setXuanZeByXuanze5(list_2.get(i + 4));
		shiJuan.setXuanZeByXuanze6(list_2.get(i + 5));
		shiJuan.setXuanZeByXuanze7(list_2.get(i + 6));
		shiJuan.setXuanZeByXuanze8(list_2.get(i + 7));
		shiJuan.setXuanZeByXuanze9(list_2.get(i + 8));
		shiJuan.setXuanZeByXuanze10(list_2.get(i + 9));

		System.out.println(shiJuan.getKeGuanByZhuguan1().getTiMu());
		templeShiJuanDAOService.add(shiJuan);
		DaAn2sql.setShiJuan(shiJuan);
		shiJuan_easy = shiJuan;
		num_point_easy++;
	}

	public List<XuanZe> findXZ(String hardOReasy, String course) {
		List<XuanZe> list = new ArrayList<XuanZe>();
		XuanZe zx = null;
		List<XueKe> xKe = null;
		list = (List<XuanZe>) templeTiMuDAOService.fineXZ(hardOReasy);
		if (list == null) {
			;
		} else {
			ListIterator<XuanZe> iterator = list.listIterator();
			while (iterator.hasNext()) {
				zx = (XuanZe) iterator.next();
				System.out.print(zx.getXzid());// 输出排队题序
				// 备注选择题表主键关联出错，teaID与xkID相关关联
				xKe = (List<XueKe>) templeCourseDAOService.queryXueKes(zx
						.getXueKe().getId().getTeaId());
				if (!xKe.get(0).getNameXk().equals(course)) {
					System.out.println(xKe.get(0).getNameXk());
					iterator.remove();
				}
			}
			Collections.shuffle(list);// 打乱顺序
			System.out.println(list.get(0).getXzid());// 验证打乱题序
		}
		return list;
	}

	public List<PangDuan> findPD(String hardOReasy, String course) {
		List<PangDuan> list = new ArrayList<PangDuan>();
		PangDuan pd = null;
		List<XueKe> xKe = null;
		list = (List<PangDuan>) templePangDuanDAOService.finePD(hardOReasy);
		if (list == null) {
			;
		} else {
			ListIterator<PangDuan> iterator = list.listIterator();
			while (iterator.hasNext()) {
				pd = (PangDuan) iterator.next();
				System.out.print(pd.getPdid());// 输出排队题序

				xKe = (List<XueKe>) templeCourseDAOService.queryXueKes(pd
						.getXueKe().getId().getTeaId());
				if (!xKe.get(0).getNameXk().equals(course)) {
					System.out.println(xKe.get(0).getNameXk());
					iterator.remove();
				}
			}
			Collections.shuffle(list);
			System.out.println(list.get(0).getPdid());// 验证打乱题序
		}
		return list;
	}

	public List<KeGuan> findZG(String hardOReasy, String course) {
		List<KeGuan> list = new ArrayList<KeGuan>();
		KeGuan zg = null;
		List<XueKe> xKe = null;
		list = (List<KeGuan>) templeZhuGuanDAOService.fineZG(hardOReasy);
		if (list == null) {
			;
		} else {
			ListIterator<KeGuan> iterator = list.listIterator();
			while (iterator.hasNext()) {
				zg = (KeGuan) iterator.next();
				System.out.print(zg.getKgid());// 输出排队题序

				xKe = (List<XueKe>) templeCourseDAOService.queryXueKes(zg
						.getXueKe().getId().getTeaId());
				if (!xKe.get(0).getNameXk().equals(course)) {
					System.out.println(xKe.get(0).getNameXk());
					iterator.remove();
				}
			}
			Collections.shuffle(list);
			System.out.println(list.get(0).getKgid());// 验证打乱题序
		}
		return list;
	}

	public void lianxi() {
		int miid = Integer.parseInt(request.getParameter("miid"));
		if (miid == 1) {
			List<XuanZe> xzList = new ArrayList<XuanZe>();
			xzList = templeXuanZeDAOService.getAllObjects(XuanZe.class);
			ActionContext.getContext().getSession().put("xz", xzList);
			try {
				request.getRequestDispatcher("/jsp/lianxi1.jsp").forward(
						request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (miid == 2) {
			List<PangDuan> pdlist = new ArrayList<PangDuan>();
			pdlist = templePangDuanDAOService.getAllObjects(PangDuan.class);
			ActionContext.getContext().getSession().put("pd", pdlist);
			try {
				request.getRequestDispatcher("/jsp/lainxi2.jsp").forward(
						request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Long findDanAnJuanNum(Class clazz) {
		Long num = templeDaAnDAOService.getAllObjects_num(clazz);
		return num;
	}

	public Long findShiJuanNum(Class clazz) {
		Long num = templeShiJuanDAOService.getAllObjects_num(clazz);
		return num;
	}

	public TempleCourseDAOService<Course> getTempleCourseDAOService() {
		return templeCourseDAOService;
	}

	public void setTempleCourseDAOService(
			TempleCourseDAOService<Course> templeCourseDAOService) {
		this.templeCourseDAOService = templeCourseDAOService;
	}

	public TempleTiMuDAOService<XuanZe> getTempleTiMuDAOService() {
		return templeTiMuDAOService;
	}

	public void setTempleTiMuDAOService(
			TempleTiMuDAOService<XuanZe> templeTiMuDAOService) {
		this.templeTiMuDAOService = templeTiMuDAOService;
	}

	public TemplePangDuanDAOService<PangDuan> getTemplePangDuanDAOService() {
		return templePangDuanDAOService;
	}

	public void setTemplePangDuanDAOService(
			TemplePangDuanDAOService<PangDuan> templePangDuanDAOService) {
		this.templePangDuanDAOService = templePangDuanDAOService;
	}

	public TempleZhuGuanDAOService<KeGuan> getTempleZhuGuanDAOService() {
		return templeZhuGuanDAOService;
	}

	public void setTempleZhuGuanDAOService(
			TempleZhuGuanDAOService<KeGuan> templeZhuGuanDAOService) {
		this.templeZhuGuanDAOService = templeZhuGuanDAOService;
	}

	public TempleShiJuanDAOService<ShiJuan> getTempleShiJuanDAOService() {
		return templeShiJuanDAOService;
	}

	public void setTempleShiJuanDAOService(
			TempleShiJuanDAOService<ShiJuan> templeShiJuanDAOService) {
		this.templeShiJuanDAOService = templeShiJuanDAOService;
	}

	public TempleDaAnDAOService<DaAnJuan> getTempleDaAnDAOService() {
		return templeDaAnDAOService;
	}

	public void setTempleDaAnDAOService(
			TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService) {
		this.templeDaAnDAOService = templeDaAnDAOService;
	}

	public TempleXuanZeDAOService<XuanZe> getTempleXuanZeDAOService() {
		return templeXuanZeDAOService;
	}

	public void setTempleXuanZeDAOService(
			TempleXuanZeDAOService<XuanZe> templeXuanZeDAOService) {
		this.templeXuanZeDAOService = templeXuanZeDAOService;
	}

}
