<%@ page import="rainbow.example.domain.Student"%>
<%@ page import="rainbow.example.domain.Course"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ListIterator"%>
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

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script language="javascript">
	$(document).ready(function() {
		$("li#sortByCourse").click(function() {
			window.location.reload();
		});
	});
</script>

<%-- <script language="javascript">
	$(document).ready(function() {
		$("li#sortByCourse").click(function() {
			$.ajax({
				url : "getAjaxMessage",//.action 不用写出来
				type : "get",
				async : false,
				cache : false,//false才能时时刷新
				dataType : 'html',
				error : function() {
					alert("发生错误啦~~~");
				},
				success : function(data) {
					//var mes = data;
					//if (mes == "~") {
					//	alert(mes);
					//}
					$("ul.class_area li").html(data.valueOf(0));
				}
			});

		});
		$("li#sortByTeacher").click(function() {
			$(this).hide();
		});
	});
</script> --%>

<%-- 这个<%=request.getContextPath()%>后面直接加css所在的文件夹名字就可以了 --%>
<link href="<%=request.getContextPath()%>/system/css/common.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/content.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/dialog.css"
	type="text/css" rel="stylesheet" />
</head>

<body onload="opener.location.reload()">
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:forward page="/system/login.jsp"></jsp:forward>

	<!-- 此处必须在同一行，不能换行 -->
	<!--<jsp:include page="/jsp/topNull.jsp"></jsp:include>-->
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

	<div class="main">

		<div class="box2">
			<div class="page_content2">
				<div class="page_nav2">
					<div class="classify">
						<%
							Student u = null;
							u = (Student) session.getAttribute("userinfo");
						%>
						<h2>
							<u><%=u.getNameStu()%>：</u> 同学的课程信息：
						</h2>
						<s:action id="kaoshi" name="kaoshi" executeResult="true"
							namespace="/">

							<div class="classify_in" >
								<ul class="tab">
									<li class="focus" id="sortByCourse"><a>按课程分类</a><span></span></li>
									<li class="focus" id="sortByTeacher"><a>按老师分类</a></li>
									<!-- focus的自动识别 -->
									<!-- <li><a>按老师分类</a></li>  -->
								</ul>

								<ul class="class_area">
									<%
										List<String> xkNames = new ArrayList<String>();
										xkNames = (List) session.getAttribute("xkNames");
										if (xkNames != null) {
											int num = xkNames.size();
											for (int i = 0; i < num; i++) {
									%>
									<li><a href="kaoshi1?mod=<%=xkNames.get(i)%>"><%=xkNames.get(i)%></a></li>
									<%
										}
									}
									%>
								</ul>
							</div>
						</s:action>
					</div>
					<!-- 					<div class="check">
						<p id="check" >--请先选择课程，选择好课程后会生成相应试卷--</p>
					</div> -->
					<%
						String course = (String) session.getAttribute("course");
						if (course != null){
					%>
					<s:action id="kaoshi" name="kaoshi1">
						<table class="topiclist" >
							<%
								String str1 = null;
								String str2 = null;
								if (course != null) {
								str1 = "2014-2015第二学期";
								str2 = "期末试卷";
							%>
							<tr>
								<td>[难] <%=str1 + "‘" + course + "’" + str2%></td>
								<td class="enter_bt"><a href="kaoshi2?mid=1"></a></td>
							</tr>
							<!-- 
						<tr>
							<td>[中]</td>
							<td class="enter_bt"><a href="/jsp/LiKaoshi.jsp"></a></td>
						</tr>
						 -->
							<tr>
								<td>[易] <%=str1 + "‘" + course + "’" + str2%></td>
								<td class="enter_bt"><a href="kaoshi2?mid=2"></a></td>
							</tr>
							<%
								}
							%>
						</table>
					</s:action>
					<%
						}
					%>
				</div>
			</div>
			<div class="box_bottom2">
				<img src="<%=request.getContextPath()%>/system/css/box_bottom_bg2.jpg" />
			</div>
		</div>
	</div>
	<jsp:include page="/system/student/footer.jsp"></jsp:include>
</body>
</html>
