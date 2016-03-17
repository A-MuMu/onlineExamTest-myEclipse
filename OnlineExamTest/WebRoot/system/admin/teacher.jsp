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
	<jsp:forward page="/system/login/login.jsp"></jsp:forward>
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
	<%
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
											style="border: 1px solid #FFF;height: 36px;width: 13%;">学号</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 11%;">姓名</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 10%;">课程</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 6%;">试卷号</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 11%;">考试时间</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 11%;">客观题分数</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 11%;">主观题分数</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 9%;">总分</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 15%;">修改</td>
									</tr>
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
