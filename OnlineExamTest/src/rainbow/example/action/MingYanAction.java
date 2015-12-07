package rainbow.example.action;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import rainbow.example.domain.MingYan;
import rainbow.example.service.TempleMingYanDAOService;

import com.opensymphony.xwork2.ActionSupport;

public class MingYanAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5776730705538510950L;
	private MingYan mingYan;
	private TempleMingYanDAOService<MingYan> templeMingYanDAOService;
	
	public void doMingYan(){
		Random random = new Random();
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			MingYan my = templeMingYanDAOService.doLoad(random.nextInt(6)+1);
			if (my == null) {
			}
			else if (my != null) {
//				System.out.println(my.getYuJu());
				request.setAttribute("mingyan", my.getYuJu());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public MingYan getMingYan() {
		return mingYan;
	}

	public void setMingYan(MingYan mingYan) {
		this.mingYan = mingYan;
	}

	public TempleMingYanDAOService<MingYan> getTempleMingYanDAOService() {
		return templeMingYanDAOService;
	}

	public void setTempleMingYanDAOService(
			TempleMingYanDAOService<MingYan> templeMingYanDAOService) {
		this.templeMingYanDAOService = templeMingYanDAOService;
	}
	
}
