<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
	
  </body>
</html>
