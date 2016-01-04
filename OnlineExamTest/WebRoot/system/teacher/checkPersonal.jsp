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
	function redirect() {
		window.location.href("personal.jsp");
	}
	function submit() {
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
						<font color=#666600 size=5><b>福州大学教师个人信息修改表</b></font>
					</center>
					<center>
						<input onclick="submit()" id="bt_edit" type="submit" value="确认修改"
							name="bt_edit" style="height: 25px ; width: 90px" />
					    &nbsp;&nbsp;
					    <input
							onclick="redirect()" id="bt_print" type="submit" value="取消返回"
							name="bt_print" style="height: 25px ; width: 90px" />
					</center>
					<br />
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
								<td align=center><span id=contentplaceholder1_lb_xmpy><%=teacher.getNamePy()%></span></td>
								<td valign=middle rowspan=6 width=100 align=center><span
									id=contentplaceholder1_lb_img><img border=0 src=""
										width=100></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>曾用名</td>
								<td align=center><span id=contentplaceholder1_lb_cym><%=teacher.getUsedName()%></span></td>
								<td align=center>性别</td>
								<td align=center><span id=contentplaceholder1_lb_xb><%=teacher.getSex()%></span></td>
								<td align=center>出生日期</td>
								<td align=center><span id=contentplaceholder1_lb_csrq><%=teacher.getBornDate()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>国别</td>
								<td align=center><span id=contentplaceholder1_lb_gb><%=teacher.getCountry()%></span></td>
								<td align=center>民族</td>
								<td align=center><span id=contentplaceholder1_lb_mz><%=teacher.getMingzu()%></span></td>
								<td align=center>政治面貌</td>
								<td align=center><span id=contentplaceholder1_lb_zzmm><%=teacher.getZhengzhiMm()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>出生地</td>
								<td align=center><span id=contentplaceholder1_lb_xssy><%=teacher.getBornWhere()%></span></td>
								<td align=center>籍贯</td>
								<td align=center><span id=contentplaceholder1_lb_jg><%=teacher.getJiguan()%></span></td>
								<td align=center>婚姻</td>
								<td align=center><span id=contentplaceholder1_lb_hyzk><%=teacher.getHunyin()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>身份证号</td>
								<td colspan=2><span id=contentplaceholder1_lb_sfzh>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=teacher.getShenfenId()%></span></td>
								<td align=center>教&nbsp;师&nbsp;号</td>
								<td colspan=2><span id=contentplaceholder1_lb_ksh>&nbsp;&nbsp;&nbsp;<%=teacher.getJiaoshiId()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>所在学院</td>
								<td align=center><span id=contentplaceholder1_lb_bxxs><%=teacher.getXueyuan()%></span></td>
								<td align=center>所在专业</td>
								<td align=center><span id=contentplaceholder1_lb_bxlx><%=teacher.getZhuanye()%></span></td>
								<td align=center>入职方式</td>
								<td align=center><span id=contentplaceholder1_lb_rxfs><%=teacher.getRuzhiFs()%></span></td>
							</tr>

							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>职位</td>
								<td align=center><span id=contentplaceholder1_lb_rxny><%=teacher.getZhiwei()%></span></td>
								<td align=center>入职年月</td>
								<td align=center><span id=contentplaceholder1_lb_xz><%=teacher.getRuzhiDate()%></span></td>
								<td align=center>任期</td>
								<td colspan=2><span id=contentplaceholder1_lb_xxnx>&nbsp;&nbsp;&nbsp;<%=teacher.getRenqi()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>职位变动</td>
								<td colspan=6><span id=contentplaceholder1_lb_xjxx><%=teacher.getZhiweiChange()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>主要成就</td>
								<td colspan=6><span id=contentplaceholder1_lb_byzt><%=teacher.getZhuyaoChengjiu()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>任教学科</td>
								<td colspan=6><span id=contentplaceholder1_lb_fxzy><%=teacher.getRenjiaoXk()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>本人电话</td>
								<td colspan=3><span id=contentplaceholder1_lb_lxdh><%=teacher.getTel()%></span></td>
								<td align=center>e-mail</td>
								<td colspan=2><span id=contentplaceholder1_lb_email><%=teacher.getEmailTea()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>宿舍</td>
								<td><span id=contentplaceholder1_lb_ssdz><%=teacher.getSushe()%></span></td>
								<td align=center>宿舍电话</td>
								<td><span id=contentplaceholder1_lb_ssdh><%=teacher.getSusheTel()%></span></td>
								<td align=center>家庭电话</td>
								<td colspan=2><span id=contentplaceholder1_lb_jtdh><%=teacher.getHomeTel()%></span></td>
							</tr>
							<tr
								style="height: 30px; vertical-align: middle; border-bottom: gray 1px solid; border-left: gray 1px solid">
								<td align=center>家庭地址</td>
								<td colspan=3><span id=contentplaceholder1_lb_jtdz><%=teacher.getHome()%></span></td>
								<td align=center>家庭邮编</td>
								<td colspan=2><span id=contentplaceholder1_lb_yzbm><%=teacher.getYoubian()%></span></td>
							</tr>
						</tbody>
					</table>
					<br />
					<br />
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
