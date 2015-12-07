package rainbow.example.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ValidateUtil {
	
	public static void validateErr(HttpServletRequest request,String eString) {
		String xuehao = "�˺Ų���Ϊ�գ�";
		String password ="���벻��Ϊ�գ�";
		String wrongUser ="���û������ڣ�";
		String wrongPwd = "�������벻��ȷ��";
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
				errorMsg.put(field, field+"����Ϊ��!");
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
