<%@page import="rainbow.example.domain.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="rainbow.example.domain.User"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	String myPath = basePath + "system/teacher/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩虹-在线考试网</title>

<!-- 这个<%=request.getContextPath()%>后面直接加css所在的文件夹名字就可以了 -->
<link href="<%=request.getContextPath()%>/system/css/common.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/content.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/dialog.css"
	type="text/css" rel="stylesheet" />
</head>

<body>
	<div class="nav">
		<div class="wapper">
			<div class="logo">
				<img src="<%=request.getContextPath()%>/system/css/logo.jpg" />
			</div>
			<div class="nav_but_ls yahei">
				<ul>
					<li class="sy"><a href="<%=path%>/system/teacher/shouye.jsp"><span>首
								页</span></a></li>
					<li class="xc"><a
						href="<%=request.getContextPath()%>/system/teacher/courseManager.jsp"><span>课堂评分</span></a></li>
					<li class="sl"><a
						href="<%=request.getContextPath()%>/system/teacher/personal.jsp"><span>个人信息</span></a></li>
					<li class="lx"><a href="<%=myPath%>ketang"><span>学生管理</span></a></li>
					<li class="jc"><a href="<%=myPath%>checkMyStudent"><span>试卷评改</span></a></li>
				</ul>
			</div>
			<div class="toolbar" style="margin-left:120px;">
				<%
					User u = null;
					u = (User) session.getAttribute("USER");
				%>
				<p>
					你好，<%=u.getId().getName()%><a
						href="<%=path%>/system/login/loginOut.jsp">退出</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>
