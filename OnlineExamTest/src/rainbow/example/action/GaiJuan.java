package rainbow.example.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.Submit;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.service.TempleGaiJuanDAOService;

import com.opensymphony.xwork2.ActionSupport;

public class GaiJuan extends ActionSupport {

	/**;
	 * 
	 */
	private static final long serialVersionUID = 7365856958945121714L;
	
	private DaAnJuan daAnJuan;
	private TempleGaiJuanDAOService templeGaiJuanDAOService;
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	public void Submit(){
		String no = request.getParameter("no");
		String no1 = request.getParameter("no1");
		String no2 = request.getParameter("no2");
		String no3 = request.getParameter("no3");
		int sum = Integer.parseInt(no1)+Integer.parseInt(no2)+Integer.parseInt(no3);
		System.out.print(sum +"!!!!!!!!!!"+no1+"!!!!!!!!!!"+no3+"!!!!!!!!!!"+no2);
		daAnJuan = templeGaiJuanDAOService.getByID(no);
		daAnJuan.setZongFen(sum);
		templeGaiJuanDAOService.save(daAnJuan);
		try {
//			final String URL = "jsp/shouye.jsp";
			response.getWriter().write("1");// 将值写入页面
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DaAnJuan getDaAnJuan() {
		return daAnJuan;
	}

	public void setDaAnJuan(DaAnJuan daAnJuan) {
		this.daAnJuan = daAnJuan;
	}

	public TempleGaiJuanDAOService getTempleGaiJuanDAOService() {
		return templeGaiJuanDAOService;
	}

	public void setTempleGaiJuanDAOService(
			TempleGaiJuanDAOService templeGaiJuanDAOService) {
		this.templeGaiJuanDAOService = templeGaiJuanDAOService;
	}

}
