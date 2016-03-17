<%@page import="rainbow.example.domain.DaAnJuan"%>
<%@page import="rainbow.example.domain.Student"%>
<%@page import="rainbow.example.domain.Teacher"%>
<%@page import="rainbow.example.domain.StuCourse"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
	String myPath = basePath + "system/admin/";
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
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/TeaCheckStu.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.simplemodal.js"></script>
<script type="text/javascript">
	function redirect() {
		window.location.href("stu.jsp");
	}
</script>

</head>

<body>
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:forward page="/system/login/login.jsp"></jsp:forward>
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
	<%
		List<Student> list = (List<Student>) session.getAttribute("magament_stu");
		String no = request.getParameter("No");
		int i = Integer.parseInt(no);
	%>
	<div class="main">
		<div class="box2">
			<div class="page_content2">
				<div class="page_nav3">
					<div class="QuickOne">
						<table style="width:250px" class="mytable">
							<tbody>
								<tr style="height: 20px">
									<td colspan="2" align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #C1C1C1;">学生个人信息修改</td>
								</tr>
								<tr style="height: 20px">
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #C1C1C1;">ID:</td>
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #efefef;"><input
										style="border: 1px solid #C1C1C1;height: 36px;font-size:19px" /></td>
								</tr>
								<tr style="height: 20px">
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #C1C1C1;">学号:</td>
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #efefef;"><input
										style="border: 1px solid #C1C1C1;height: 36px;font-size:19px" /></td>
								</tr>
								<tr style="height: 20px">
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #C1C1C1;">姓名:</td>
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #efefef;"><input
										style="border: 1px solid #C1C1C1;height: 36px;font-size:19px" /></td>
								</tr>
								<tr style="height: 20px">
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #C1C1C1;">邮箱:</td>
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #efefef;"><input
										style="border: 1px solid #C1C1C1;height: 36px;font-size:19px" /></td>
								</tr>
								<tr style="height: 20px">
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #C1C1C1;">密码:</td>
									<td align="center"
										style="border: 1px solid #FFF;height: 36px;width: 20%;background-color: #efefef;"><input
										style="border: 1px solid #C1C1C1;height: 36px;font-size:19px" /></td>
								</tr>
						</table>
						<br />
						<center>
							<input onclick="submit()" id="bt_edit" type="submit" value="确认修改"
								name="bt_edit" style="height: 25px ; width: 90px" />
							&nbsp;&nbsp; <input onclick="redirect()" id="bt_print"
								type="submit" value="取消返回" name="bt_print"
								style="height: 25px ; width: 90px" />
						</center>

					</div>
				</div>
			</div>
			<div class="box_bottom2">
				<img
					src="<%=request.getContextPath()%>/system/css/box_bottom_bg2.jpg" />
			</div>
		</div>
	</div>
</body>
</html>
