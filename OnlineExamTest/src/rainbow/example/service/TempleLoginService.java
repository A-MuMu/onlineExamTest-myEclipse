package rainbow.example.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import rainbow.example.DAO.TempleDAO;
import rainbow.example.domain.User;
import rainbow.example.domain.UserException;

public class TempleLoginService {
	private User user;
	private TempleDAO dao;
	private List<User> users;

	public User doLogin(String userName, String password) throws UserException {
		if (userName == null || "".equals(userName.trim()))
			throw new UserException("账号不能为空！");
		else if (password == null || "".equals(password.trim()))
			throw new UserException("密码不能为空！");

		// 输出 ->进入的账号信息
		System.out.println(userName+"****");

		String queryString = "SELECT u FROM User u WHERE u.id.id = '" + userName +"'" ;

		users = dao.getObjects(queryString);

		System.out.println(queryString);

		if (users.size() == 0)
			throw new UserException("该用户不存在！");
		else {
			User loginUser = (User) users.get(0);

			System.out.println(loginUser.getId().getId() + "********" + loginUser.getId().getPsw());

			if (loginUser != null) {
				if (!password.equals(loginUser.getId().getPsw()))
					throw new UserException("密码输入不正确！");
				else {
					ActionContext.getContext().getSession().put("USER", loginUser);
					return loginUser;
				}
			}
		}
		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TempleDAO getDao() {
		return dao;
	}

	public void setDao(TempleDAO dao) {
		this.dao = dao;
	}
}
