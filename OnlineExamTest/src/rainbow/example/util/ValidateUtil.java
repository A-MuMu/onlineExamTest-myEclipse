package rainbow.example.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ValidateUtil {
	
	public static void validateErr(HttpServletRequest request,String eString) {
		String xuehao = "账号不能为空！";
		String password ="密码不能为空！";
		String wrongUser ="该用户不存在！";
		String wrongPwd = "密码输入不正确！";
		Map<String,String> errorMsg = new HashMap<String,String>();
		if (xuehao==eString || wrongUser==eString){
			errorMsg.put("zhanghao", eString);
		}
		else {
			errorMsg.put("password", eString);
		}
		request.setAttribute("errorMsg", errorMsg);
	}
	
	public static boolean validateNull(HttpServletRequest request,String[] fields) {
		boolean validate = true;
		Map<String,String> errorMsg = new HashMap<String,String>();
		for(String field:fields) {
			String value = request.getParameter(field);
			if(value==null||"".equals(value.trim())) {
				validate = false;
				errorMsg.put(field, field+"不能为空!");
			}
		}
		if(!validate) request.setAttribute("errorMsg", errorMsg);
		return validate;
	}
	
	@SuppressWarnings("unchecked")
	public static String showError(HttpServletRequest request,String field) {
		Map<String,String> errorMsg = (Map<String,String>)request.getAttribute("errorMsg");
		if(errorMsg==null) return "";
		String msg = errorMsg.get(field);
		if(msg==null) return "";
		return msg;
	}
}
