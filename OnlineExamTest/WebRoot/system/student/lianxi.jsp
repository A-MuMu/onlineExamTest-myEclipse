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
	src="<%=request.getContextPath()%>/js/jquery.min.js"></script>

<script>
	$(document).ready(function() {

	});
</script>

<style type="text/css">
.pages {
	text-align: center;
	font-size: 12px;
}

.pages * {
	border: 1px solid #E6E7E1;
	height: 24px;
	line-height: 24px;
	padding: 3px 6px;
	margin: 1px;
	color: #0099CC;
}

.pages b {
	background-color: #0099CC;
	border-color: #0099CC;
	color: #FFFFFF;
}

.pages a {
	text-decoration: none;
}

.pages a:hover {
	border-color: #0099CC;
}

.pn {
	border-color: #0099CC;
}

.tab {
	float: left;
	width: 852px;
	height: 20px;
	border-bottom: 1px solid #e2e2e2;
	margin-left: 60px;
}

.tab a {
	font-size: 16px;
	font-family: "Microsoft Yahei", "微软雅黑";
}

.tab .focus a {
	color: #f00;
}

.tab .focus span {
	width: 13px;
	height: 8px;
	display: block;
	background: url(../css/tabfocus.jpg) no-repeat;
	float: left;
	position: absolute;
	bottom: -1px;
	_bottom: -3px;
	left: 40px;
	font-size: 0;
}

.tab li {
	width: 100px;
	height: 20px;
	position: relative;
	text-align: left;
	line-height: 20px;
	margin: 4 15px;
}

.tab .focus {
	position: relative;
}
</style>
</head>

<body>
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:forward page="/system/login.jsp"></jsp:forward><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/system/topUser.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<div class="main">
		<div class="box2">
			<div class="page_content2">
				<div class="page_nav2">
					<div class="h1">
						<span class="lf"></span>
						<ul class="ct_focus">
							<li class="focus"><a class="typeb">练习历史</a><span> </span></li>
							<li><a>我的错题</a></li>

						</ul>
						<span class="rt"></span>


						<!-- <ul class="tab">
							<li class="focus" id="sortByXuanze"><a>选择题</a><span>
							</span></li>
							<li class="" id="sortByPanduan"><a>判断题</a></li>
							<li class="" id="sortByKeguan"><a>问答题</a></li>
							focus的自动识别
						</ul> -->

					</div>
					<br />
					<table class="topiclist" style="border-collapse:collapse;">
						<tr>
							<td style="border-bottom:1px solid #ececec;">
								<h3>2015年上半年四川公务员考试《申论》真题试卷</h3>
								<p>作答时间：2015年06月12日</p>
							</td>
							<td style="border-bottom:1px solid #ececec;" class="view_bt">
								<a href="index.php?mod=exercise&act=paper&tid=2050705">继续做题</a>
							</td>
						</tr>
						<tr>
							<td bgcolor="#fbfbfb">
								<h3>2015年上半年四川公务员考试《申论》真题试卷</h3>
								<p>作答时间：2015年06月12日</p>
							</td>
							<td bgcolor="#fbfbfb" class="view_bt"><a
								href="index.php?mod=exercise&act=paper&tid=2050702">继续做题</a></td>
						</tr>
						<tr>
							<td style="border-bottom:1px solid #ececec;">
								<h3>2015年上半年四川公务员考试《申论》真题试卷</h3>
								<p>作答时间：2015年05月25日</p>
							</td>
							<td style="border-bottom:1px solid #ececec;" class="view_bt">
								<a href="index.php?mod=exercise&act=paper&tid=1973648">继续做题</a>
							</td>
						</tr>
					</table>



					<div class="topiclist">

						<div class="pages">
							<b>1</b>
						</div>
					</div>

				</div>
			</div>
			<div class="box_bottom2">
				<img src="<%=request.getContextPath()%>/system/css/box_bottom_bg2.jpg" />
			</div>
		</div>
	</div>
<jsp:include page="/system/footer.jsp"></jsp:include>
</body>
</html>
