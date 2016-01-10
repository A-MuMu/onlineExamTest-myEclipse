<%@page import="rainbow.example.domain.Teacher"%>
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
		Teacher teacher = (Teacher) session.getAttribute("userinfo");
		List<String> xkNames = new ArrayList<String>();
		xkNames = (List<String>) session.getAttribute("xkNames");
	%>
	<div class="main">
		<div class="box2">
			<div class="page_content2">
				<div class="page_nav3">
					<div class="classify2">
						<div class="QuickOne">
							<p
								style="position: relative; width:32.333%; float:left;font-size: 18px;">
								课程: <select id="sortByCourse" name="sortByCourse"
									style=" height:25px;font-size: 17px;border: 1px solid #C0C0C0;width:60%;font-weight:lighter;">
									<option value="全部" id="all"
										style="font-size:17px;font-weight:lighter;">全部</option>
									<%
										for (int i = 0; i < xkNames.size(); i++) {
									%>
									<option value="<%=xkNames.get(i)%>" id="<%=xkNames.get(i)%>"
										style="font-size:17px;font-weight:lighter;"><%=xkNames.get(i)%></option>
									<%
										}
									%>
								</select>
							</p>
							<p
								style="position: relative; width:32.333%; float:left;font-size: 18px;">
								学号: <input id="sortByXueHao" name="sortByXueHao" type="text"
									style="height:25px;font-size: 17px;border: 1px solid #C0C0C0;width:60%;font-weight:lighter;"
									type="text">
							</p>
							<p
								style="position: relative; width:32.333%; float:left;font-size: 18px;">
								姓名: <input id="sortByName" name="sortByName" type="text"
									style="height:25px;font-size: 17px;border: 1px solid #C0C0C0;width:60%;font-weight:lighter;"
									type="text">
							</p>
							<br /> <br /> <br />
							<div style="margin:0 320px">
								<input onclick="check()" id="bt_check" type="submit" value="查询"
									name="bt_check" style="height: 32px ; width:75px" />
								&nbsp;&nbsp; <input onclick="clean()" id="bt_clean"
									type="submit" value="重置查询" name="bt_clean"
									style="height: 32px ; width: 75px" />
							</div>
							<br /> <br /> <br /> <br />

						</div>

						<div class=".QuickOne_area">
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
											style="border: 1px solid #FFF;height: 36px;width: 11%;">选择题分数</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 11%;">判断题分数</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 11%;">主观题分数</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 9%;">总分</td>
										<td align="center"
											style="border: 1px solid #FFF;height: 36px;width: 15%;">修改</td>
									</tr>
									<%
										for (int i = 0; i < 10; i++) {
									%>
									<tr></tr>
									<%
										}
									%>
								</tbody>
							</table>
							<br />

						</div>

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
