<%@page import="rainbow.example.domain.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<
<head>
<base href="<%=basePath%>">
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩虹-在线开始网</title>

<!-- 这个<%=request.getContextPath()%>后面直接加css所在的文件夹名字就可以了 -->
<link href="<%=request.getContextPath()%>/jsp/common.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/jsp/content.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/jsp/dialog.css"
	type="text/css" rel="stylesheet" />
</head>

<body>
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:include page="/jsp/topNull.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/jsp/topUser.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>

	<div class="main">

		<div class="box2">
			<div class="page_content2">
				<div class="page_nav2">
					<s:action name="stu">

						<table class="topiclist2">
							<tr>
								<td>学号</td>
								<td>姓名</td>
								<td>密码</td>
								<td>邮箱</td>
								<td colspan="2">操作</td>
							</tr>
							<%
								List<Student> list = new ArrayList<Student>();
													Student student = new Student();
													list = (List<Student>) session.getAttribute("magament_stu");
													for(int i = 0;i < list.size();i++){
														student = list.get(i);
							%>
							<tr>
								<td><input type="text" value="<%=student.getIdStu()%>"
									style="border:0px; " id=<%=4*i%>></td>
								<td><input type="text" value="<%=student.getNameStu()%>"
									style="border:0px;" id=<%=4*i+1%>></td>
								<td><input type="text" value="<%=student.getPswStu()%>"
									style="border:0px; " id=<%=4*i+2%>></td>
								<td><input type="text" value="<%=student.getEmailStu()%>"
									style="border:0px; " id=<%=4*i+3%>></td>
								<td><a href="stuxiugai?id=<%=i%>">修改</a></td>
								<td><a href="studelete?id=<%=i%>">删除</a></td>
							</tr>
							<%
								}
							%>
							<tr>
								<td><input type="text" value="  " style="border:0px;"
									name="<%=4*list.size()%>"></td>
								<td><input type="text" value="  " style="border:0px;"
									name=<%=4*list.size()+1%>></td>
								<td><input type="text" value="  " style="border:0px;"
									name=<%=4*list.size()+2%>></td>
								<td><input type="text" value="  " style="border:0px;"
									name=<%=4*list.size()+3%>></td>
								<td colspan="2">
								<a href="stuadd?i=<%=4*list.size()%>">增加</a></td>
							</tr>
						</table>
					</s:action>
				</div>
				<div class="box_bottom2">
					<img src="<%=request.getContextPath()%>/jsp/box_bottom_bg2.jpg" />
				</div>
			</div>
		</div>

	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
