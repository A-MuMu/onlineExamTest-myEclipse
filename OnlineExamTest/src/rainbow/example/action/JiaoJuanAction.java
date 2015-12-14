package rainbow.example.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.log4j.Logger;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.domain.Student;
import rainbow.example.service.TempleDaAnDAOService;
import rainbow.example.util.DaAn2sql;
import rainbow.example.util.TrueORfalse;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class JiaoJuanAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService;
	static final Logger logger = Logger.getLogger(JiaoJuanAction.class);
	private Long numDaJuan;
	private int ziZhuFenShu = 0;
	SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	
	public void addDaJuan(DaAnJuan daJuan){
		System.out.println("~~~~~~~~~~~~~");
		templeDaAnDAOService.add(daJuan);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~交卷~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void submit() {
		System.out.println("~~~~~~~进来交卷~~~~~~");
		logger.info("~~~~~~~进来交卷~~~~~~");
		numDaJuan = findDaJuanNum(DaAnJuan.class);
		
		DaAnJuan daJuan = new DaAnJuan();		
		String xuanze,pangduan,zhuguan;
		xuanze = request.getParameter("xuanze");
		pangduan = request.getParameter("pangduan");
		zhuguan = request.getParameter("zhuguan");
		DaAn2sql.intoDaAn_xz(daJuan,xuanze);
		DaAn2sql.intoDaAn_pd(daJuan,pangduan);
		DaAn2sql.intoDaAn_zg(daJuan,zhuguan);
		daJuan.setIdStu(getStuID());
		daJuan.setDaJuan(numDaJuan+1);
		TrueORfalse.setDaJuan(daJuan);
		ziZhuFenShu = TrueORfalse.getListXuanZes() + TrueORfalse.getListPangDuans();
		daJuan.setZuZhuFenShu(ziZhuFenShu);
		
		daJuan.setDate(new Date());
		System.out.println(new Date());
		
//		daJuan.setZongFen(3);            
		daJuan.setShiJuan(DaAn2sql.getShiJuan());
		
		System.out.println(daJuan.getPangduan1()
				+"#"+daJuan.getPangduan1()
				+"#"+daJuan.getPangduan2()
				+"#"+daJuan.getPangduan3()
				+"#"+daJuan.getPangduan4()
				+"#"+daJuan.getPangduan5()
				+"#"+daJuan.getPangduan6()
				+"#"+daJuan.getPangduan7()
				+"#"+daJuan.getPangduan8()
				+"#"+daJuan.getPangduan9()
				+"#"+daJuan.getPangduan10()
				+"#"+daJuan.getDaJuan()
				+"#"+daJuan.getXuanze1()
				+"#"+daJuan.getXuanze2()
				+"#"+daJuan.getXuanze3()
				+"#"+daJuan.getXuanze4()
				+"#"+daJuan.getXuanze5()
				+"#"+daJuan.getXuanze6()
				+"#"+daJuan.getXuanze7()
				+"#"+daJuan.getXuanze8()
				+"#"+daJuan.getXuanze9()
				+"#"+daJuan.getXuanze10()
				+"#"+daJuan.getIdStu()
				+"#"+daJuan.getZhuguan1()
				+"#"+daJuan.getZhuguan2()
				+"#"+daJuan.getZhuguan3()
				+"#"+daJuan.getZongFen()
				+"#"+daJuan.getZuZhuFenShu()
				);
		
		addDaJuan(daJuan);
		
		
		
		System.out.println("~~~~~~~输出："+xuanze+ "~~~~~~~~~~~");
		logger.info("提交试卷输出："+xuanze + "~~~~~~~~~~~");
		try {
//			final String URL = "jsp/shouye.jsp";
			response.getWriter().write("1");// 将值写入页面
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获取登录学生ID
	public Long getStuID(){
		Student student = (Student) ActionContext.getContext().getSession().get("userinfo");
		return student.getId().longValue();
	}
	
	//获取答卷数量
	public Long findDaJuanNum(Class clazz){
		Long num = templeDaAnDAOService.getAllObjects_num(clazz);
		return num;
	}

	public TempleDaAnDAOService<DaAnJuan> getTempleDaAnDAOService() {
		return templeDaAnDAOService;
	}
	public void setTempleDaAnDAOService(
			TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService) {
		this.templeDaAnDAOService = templeDaAnDAOService;
	}
}
