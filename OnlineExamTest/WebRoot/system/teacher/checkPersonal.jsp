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
<script type="text/javascript">
	function preview() {
		bdhtml = window.document.body.innerHTML;//获取当前页的html代码 
		sprnstr = "<!--startprint-->"; //设置打印开始区域 
		eprnstr = "<!--endprint-->"; //设置打印结束区域 
		prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 17); //从开始代码向后取html 

		prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));//从结束代码向前取html 
		window.document.body.innerHTML = prnhtml;
		window.print();
		window.document.body.innerHTML = bdhtml;
	}

	function preview_main() {
		parent.main.focus();
		bdhtml = parent.main.document.body.innerHTML; //获取当前页的html代码 
		sprnstr = "<!--startprint-->"; //设置打印开始区域 
		eprnstr = "<!--endprint-->"; //设置打印结束区域 
		prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 17); //从开始代码向后取html 

		prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr)); //从结束代码向前取html 
		parent.main.document.body.innerHTML = prnhtml;
		window.print();
		parent.main.document.body.innerHTML = bdhtml;
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

	<div class="main">
		<div class="box2">
			<div class="page_content2">
				<div class="page_nav2">
					<br />
					<center>
						<font color=#666600 size=5><b>福州大学教师个人信息一览表</b></font>
					</center>
					
					<%
						Teacher teacher = (Teacher) session.getAttribute("userinfo");
					%>
					<table style="border-collapse: collapse; table-layout: fixed"
						cellspacing=0 cellpadding=0 width=800 align=center border=1>
						<tbody>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>工号</td>
								<td align=center><span id=contentplaceholder1_lb_xh><%=teacher.getTeaId()%></span></td>
								<td align=center>姓名</td>
								<td align=center><span id=contentplaceholder1_lb_xm><%=teacher.getName()%></span></td>
								<td align=center>姓名拼音</td>
								<td align=left><span id=contentplaceholder1_lb_xmpy>linjunxin</span></td>
								<td valign=middle rowspan=6 width=100 align=center><span
									id=contentplaceholder1_lb_img><img border=0
										src="http://59.77.226.32/xszp/12/221200214.jpg" width=100></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>曾用名</td>
								<td align=center><span id=contentplaceholder1_lb_cym></span></td>
								<td align=center>性别</td>
								<td align=center><span id=contentplaceholder1_lb_xb>男</span></td>
								<td align=center>出生日期</td>
								<td align=center><span id=contentplaceholder1_lb_csrq>1994-02-17</span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>国别</td>
								<td align=center><span id=contentplaceholder1_lb_gb></span></td>
								<td align=center>民族</td>
								<td align=center><span id=contentplaceholder1_lb_mz>汉族</span></td>
								<td align=center>政治面貌</td>
								<td align=center><span id=contentplaceholder1_lb_zzmm>共青团员</span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>出生地</td>
								<td align=center><span id=contentplaceholder1_lb_xssy>莆田市城厢区</span></td>
								<td align=center>籍贯</td>
								<td align=center><span id=contentplaceholder1_lb_jg>莆田市城厢区</span></td>
								<td align=center>婚姻</td>
								<td align=center><span id=contentplaceholder1_lb_hyzk></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>身份证号</td>
								<td colspan=2><span id=contentplaceholder1_lb_sfzh>350322199402171511</span></td>
								<td align=center>考&nbsp;生&nbsp;号</td>
								<td colspan=2><span id=contentplaceholder1_lb_ksh>12350302150185</span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>所在学院</td>
								<td><span id=contentplaceholder1_lb_bxxs></span></td>
								<td align=center>所在专业</td>
								<td><span id=contentplaceholder1_lb_bxlx></span></td>
								<td align=center>入职方式</td>
								<td><span id=contentplaceholder1_lb_rxfs></span></td>
							</tr>

							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>职位</td>
								<td><span id=contentplaceholder1_lb_rxny></span></td>
								<td align=center>入职年月</td>
								<td><span id=contentplaceholder1_lb_xz>4</span>年</td>
								<td align=center>任期</td>
								<td colspan=2><span id=contentplaceholder1_lb_xxnx>6</span>年</td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>职位变动</td>
								<td colspan=6><span id=contentplaceholder1_lb_xjxx></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>主要成就</td>
								<td colspan=6><span id=contentplaceholder1_lb_byzt></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>任教学科</td>
								<td colspan=6><span id=contentplaceholder1_lb_fxzy></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>本人电话</td>
								<td colspan=3><span id=contentplaceholder1_lb_lxdh>18860115945</span></td>
								<td align=center>e-mail</td>
								<td colspan=2><span id=contentplaceholder1_lb_email><%=teacher.getEmailTea() %></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>宿舍</td>
								<td><span id=contentplaceholder1_lb_ssdz></span></td>
								<td align=center>宿舍电话</td>
								<td><span id=contentplaceholder1_lb_ssdh></span></td>
								<td align=center>家庭电话</td>
								<td colspan=2><span id=contentplaceholder1_lb_jtdh></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>家庭地址</td>
								<td colspan=3><span id=contentplaceholder1_lb_jtdz>福建省莆田市城厢区学园南街1699号莆田一中</span></td>
								<td align=center>家庭邮编</td>
								<td colspan=2><span id=contentplaceholder1_lb_yzbm>351100</span></td>
							</tr>
						</tbody>
					</table>
					<center></center>
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
