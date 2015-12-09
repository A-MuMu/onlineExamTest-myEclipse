package rainbow.example.action;

import rainbow.example.domain.ShiJuan;
import rainbow.example.service.TempleShiJuanDAOService;

import com.opensymphony.xwork2.ActionSupport;

public class CunShiJuanAction extends ActionSupport {
	private TempleShiJuanDAOService<ShiJuan> templeShiJuanDAOService;
	
	public void cunShiJuan(ShiJuan shiJuan){
		templeShiJuanDAOService.add(shiJuan);
	}

	public TempleShiJuanDAOService<ShiJuan> getTempleShiJuanDAOService() {
		return templeShiJuanDAOService;
	}

	public void setTempleShiJuanDAOService(
			TempleShiJuanDAOService<ShiJuan> templeShiJuanDAOService) {
		this.templeShiJuanDAOService = templeShiJuanDAOService;
	}

}
