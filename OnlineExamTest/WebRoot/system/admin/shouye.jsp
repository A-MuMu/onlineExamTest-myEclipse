<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<jsp:include page="/system/admin/topAdminNull.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/system/admin/topAdmin.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>

	<div class="main">
		<div class="publicbox box">
			<a href="stu" class="training">
				<ul>
					<li><h2>学生管理</h2></li>
					<li><p>学生信息综合管理，包含学生信息添加、修改、删除、查看等。信息包含学生个人成绩、学生个人情况等。</p></li>
				</ul>
			</a> <a href="teacher" class="testpaper"
				onclick="auto_make_paper();">
				<ul>
					<li><h2>教师管理</h2></li>
					<li><p>教师信息综合管理，包含教师信息添加、修改、删除、查看等。信息包含教师个人履历，教学年志，教学学科等。</p></li>
				</ul>
			</a> <a href="<%=request.getContextPath()%>/system/admin/kaoshi.jsp" class="zhenti">
				<ul>
					<li><h2>考试管理</h2></li>
					<li><p>考试过程时时管理，重置考生试卷，视频监控考生等多项管理手段。</p></li>
				</ul>
			</a> <a href="" class="exam" onclick="alert('暂未开放');">
				<ul>
					<li><h2>试卷审核</h2></li>
					<li><p>对老师提交的试卷进行审核，对学生要求查卷等做出回应，以及考试时间事项通知等。</p></li>
				</ul>
			</a>
		</div>



	</div>
</body>
</html>
