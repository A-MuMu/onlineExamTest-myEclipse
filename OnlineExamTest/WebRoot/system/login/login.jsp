<%@page import="rainbow.example.domain.Student"%>
<%@page import="rainbow.example.util.ValidateUtil"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩虹-在线开始网</title>

<!-- 这个<%=request.getContextPath()%>后面直接加css所在的文件夹名字就可以了 -->
<link href="<%=request.getContextPath()%>/system/css/common.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/content.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/dialog.css"
	type="text/css" rel="stylesheet" />
</head>

<body>
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:include page="/system/login/topNull.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/system/login/topUser.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>

	<div class="main">
		<div class="box2">
			<div class="page_content2">
				<div class="page_nav2">
					<h1>
						<span class="lf"></span><span class="title">用户登录</span><span
							class="rt"></span>
						<div class="clear"></div>
					</h1>
					<s:form id="u_login_form" method="post" action="userLogin" namespace="/system/login">
						<table class="logintable">
							<tr>
								<td width="60">账 号 ：</td>
								<td><input type="text" class="login_input"
									name="loginID" /></td>
								<td><%=ValidateUtil.showError(request, "zhanghao")%></td>
							</tr>
							<tr>
								<td>密 码 ：</td>
								<td><input type="password" class="login_input"
									name="loginPSW" /></td>
								<td><%=ValidateUtil.showError(request, "password")%></td>

							</tr>
							<tr>
								<td></td>
								<td><input value='' type="submit" class="loginbt"></input></td>

							</tr>
						</table>
					</s:form>
				</div>
			</div>
			<div class="box_bottom2">
				<img src="<%=request.getContextPath()%>/system/css/box_bottom_bg2.jpg" />
			</div>
		</div>
	</div>
	<jsp:include page="/system/login/footer.jsp"></jsp:include>
</body>
</html>

