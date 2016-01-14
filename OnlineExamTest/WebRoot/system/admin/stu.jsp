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
		window.location.href("personal.jsp");
	}
</script>

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
	<%
		List<Student> list = (List<Student>)session.getAttribute("magament_stu");
	%>
	<div class="main">
		<div class="box2">
			<div class="page_content2">
				<div class="page_nav3">
						<div class="QuickOne">
							<table class="mytable">
								<tbody>
									<tr style="background-color: #C1C1C1;height: 20px">
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><input
											type="checkbox" onclick="click(this)" id="click0" /></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;">ID</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;">学号</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;">姓名</td>
										
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;">邮箱</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;">密码</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;">修改</td>
									</tr>
									<%
										for (int i = 0; i < list.size(); i++) {
									%>
									<tr style="background-color: #efefef;height: 18px">
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><input
											type="checkbox" onclick="click(this)" id="click0" /></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><%=list.get(i).getId()%></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><%=list.get(i).getIdStu()%></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><%=list.get(i).getNameStu()%></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><%=list.get(i).getEmailStu()%></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;"><%=list.get(i).getPswStu()%></td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 15%; "><a style="color:#ee0000" href="<%=request.getContextPath()%>/system/admin/checkStu.jsp?No=<%=list.get(i).getId() %>">修改</a></td>
									</tr>
									<%
										}
									%>
							</table>
							<br />


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
