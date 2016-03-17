<%@ page import="rainbow.example.domain.MingYan"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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
<link href="<%=request.getContextPath()%>/system/css/index.css" type="text/css"
	rel="stylesheet" />
</head>

<body>
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:include page="/system/student/topNull.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/system/student/topUser.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<div class="bg">

		<div class="banner yahei">
			<div class="wapper">
				<h2 class="tit">彩虹-在线考试题库</h2>
				<p class="text">收录福大数学与计算机科学/软件学院多学科历年卷，欢迎师生们参与在线体验！</p>
				<%
					if (session.getAttribute("USER") == null) {
				%>
				<a href="<%=path%>/system/login.jsp"><span class="register">登录系统>></span></a>
				<%
					}
				%>
			</div>
		</div>
	</div>

	<div class="main">
		<h2 class="yahei">考试寄语：</h2>
		<div class="mingyan">
			<s:action name="mingyan" executeResult="true" namespace="/system/student"></s:action>
			<jsp:include page="/system/student/mingyan.jsp"></jsp:include>
		</div>
	</div>
	<br/>
	<jsp:include page="/system/student/footer.jsp"></jsp:include>
</body>
</html>
