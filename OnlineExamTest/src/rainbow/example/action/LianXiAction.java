package rainbow.example.action;

import java.util.List;

import rainbow.example.domain.DaAnJuan;
import rainbow.example.domain.ShiJuan;
import rainbow.example.service.TempleDaAnDAOService;

import com.opensymphony.xwork2.ActionSupport;

public class LianXiAction extends ActionSupport {
	private String flog = "false"; // 用于标记是否卷子改好了
	private TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService;

	public String checkOut(){
		List<ShiJuan> sjList = templeDaAnDAOService.getUnableObjects();
		return SUCCESS;
	}

	public TempleDaAnDAOService<DaAnJuan> getTempleDaAnDAOService() {
		return templeDaAnDAOService;
	}

	public void setTempleDaAnDAOService(
			TempleDaAnDAOService<DaAnJuan> templeDaAnDAOService) {
		this.templeDaAnDAOService = templeDaAnDAOService;
	}
}
