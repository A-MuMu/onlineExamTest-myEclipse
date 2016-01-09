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
	<jsp:forward page="/system/login.jsp"></jsp:forward>
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/system/teacher/topLaoShi.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>

	<div class="main">
		<div class="publicbox box">
			<a
				href="<%=request.getContextPath()%>/system/teacher/courseManager.jsp"
				class="training">
				<ul>
					<li><h2>课程管理</h2></li>
					<li><p>查看自己所教课程的上课时间、地点安排，并可以进行调课申请等操作。</p></li>
				</ul>
			</a> <a href="<%=request.getContextPath()%>/system/teacher/personal.jsp"
				class="testpaper" onclick="auto_make_paper();">
				<ul>
					<li><h2>个人信息</h2></li>
					<li><p>信息包含教师个人履历，教学年志，教学学科，与提交某些内容的信息更正等。</p></li>
				</ul>
			</a> <a href="<%=request.getContextPath()%>/system/teacher/checkMyStudent.jsp"
				class="zhenti">
				<ul>
					<li><h2>学生管理</h2></li>
					<li><p>可查看中选课程学生信息，并记录学生平时上课表现与课堂互动分。</p></li>
				</ul>
			</a> <a href="javascript:void(0);" class="exam" onclick="alert('暂未开放');">
				<ul>
					<li><h2>试卷评改</h2></li>
					<li><p>对学生提交的试卷中的问答题进行评改，查看学生试卷成绩成绩与对应的课程总体考试情况。</p></li>
				</ul>
			</a>
		</div>

	</div>
</body>
</html>
