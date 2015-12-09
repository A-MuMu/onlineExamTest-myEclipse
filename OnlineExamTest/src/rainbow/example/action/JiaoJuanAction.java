package rainbow.example.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.log4j.Logger;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.service.TempleDaAnDAOService;
import rainbow.example.util.DaAn2sql;

import com.opensymphony.xwork2.ActionSupport;

public class JiaoJuanAction extends ActionSupport {
	private DaAnJuan daJuan;
	private TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService;
	static final Logger logger = Logger.getLogger(JiaoJuanAction.class);
	
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
		
//		DaAnJuan daJuan = new DaAnJuan();
		String xuanze,pangduan,zhuguan;
		xuanze = request.getParameter("xuanze");
		pangduan = request.getParameter("pangduan");
		zhuguan = request.getParameter("zhuguan");
		DaAn2sql.intoDaAn_xz(daJuan,xuanze);
		DaAn2sql.intoDaAn_pd(daJuan,pangduan);
		DaAn2sql.intoDaAn_zg(daJuan,zhuguan);
		
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
	
	public DaAnJuan getDaJuan() {
		return daJuan;
	}

	public void setDaJuan(DaAnJuan daJuan) {
		this.daJuan = daJuan;
	}

	public TempleDaAnDAOService<DaAnJuan> getTempleDaAnDAOService() {
		return templeDaAnDAOService;
	}
	public void setTempleDaAnDAOService(
			TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService) {
		this.templeDaAnDAOService = templeDaAnDAOService;
	}
}
