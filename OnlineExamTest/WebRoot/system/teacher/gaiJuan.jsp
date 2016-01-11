<%@page import="org.w3c.dom.Document"%>
<%@page import="rainbow.example.domain.KeGuan"%>
<%@page import="rainbow.example.domain.PangDuan"%>
<%@page import="rainbow.example.domain.XuanZe"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="rainbow.example.domain.Student"%>
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

<!-- 这个<%=request.getContextPath()%>后面直接加css所在的文件夹名字就可以了 -->
<link href="<%=request.getContextPath()%>/system/css/common.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/content.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/dialog.css"
	type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/system/css/page.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/paper.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.simplemodal.js"></script>
<script>
	$(function() {
		$(".Expand_in").hide();
		$('.Expand_btn').click(function() {
			if ($(".Expand_in").css("display") == "none") {
				$(".Expand_in").show(100).attr('bshow', 'true');
				$('.Expand_btn').text("隐藏答题区");
			} else {
				$(".Expand_in").hide(100).attr('bshow', 'false');
				$('.Expand_btn').text("展开答题区");
			}

		});

		window.onscroll = function() {
			var Ostop = $(window).scrollTop();
			var footHeight = $(".footer").height();
			var bottomTop = $(document).height() - $(window).height()
					- footHeight;
			if (Ostop > bottomTop - 410) {
				$(".Expand_box").css("position", "static");
				$(".Expand_in").show();
			} else {
				$(".Expand_box").css("position", "fixed");
				if ($(".Expand_in").attr('bshow') == 'true') {
					$(".Expand_in").show();
				} else {
					$(".Expand_in").hide();
				}
			}

			if (Ostop > 60) {
				$(".hc_side").css("position", "fixed");
				$(".hc_side").css("top", "0px");
			} else {
				$(".hc_side").css("position", "static");
			}
		}
	});
</script>

<script language="javascript">
	function toggle_zuoda_box(index, obj) {
		var text_box = $('#text_box_' + index);
		var flag = text_box.data("flag");
		if (flag == 1) {
			text_box.data("flag", 0);
			text_box.show();
			$(obj).text("收起↑");
		} else {
			text_box.data("flag", 1);
			text_box.hide();
			$(obj).text("展开↓");
		}
	}

	function select_sq(i, obj) {
		$('.Expand_in .tab').find("a").removeClass("focus");
		$(obj).addClass("focus");
		$('.sq_detail').hide();
		$('#sq_detail_' + i).show();
	}
</script>

<script language="javascript">
	function count_char(textareaNamezzjs, spanName) {
		document.getElementById(spanName).innerHTML = document
				.getElementById(textareaNamezzjs).value.length;
	}
</script>

</head>

<body>
	<%
		if (session.getAttribute("USER") == null) {
	%>
	<jsp:include page="/system/topNull.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<%
		if (session.getAttribute("USER") != null) {
	%>
	<jsp:include page="/system/student/topLiKaoShi.jsp"></jsp:include><!-- 此处必须在同一行，不能换行 -->
	<%
		}
	%>
	<div class="main">

		<div class="box">

			<div class="page_content" data-id="2036981"
				style="position:relative;">
				<%
					Student u = null;
					u = (Student) session.getAttribute("userinfo");
					String course = (String) session.getAttribute("course");
				%>
				<div class="page_nav">
					<a href="?mod=shenlun"><%=u.getNameStu()%></a> &gt;&gt; <a
						href="?mod=shenlun&act=index&pid=25"><%=course%></a>
				</div>
				<%
					String str1 = null;
					String str2 = null;
					if (course != null) {
						str1 = "2014-2015第二学期";
						str2 = "期末试卷";
				%>
				<div class="hc_title"><%=str1 + " " + course + " " + str2%></div>
				<%
					}
				%>
				<form id="xuanze" name="xuanze" method="post" action="xuanze.action">

					<div class="left">
						<div style="height:1px;"></div>
						<div class="hc_side" style="width:144px; position:fixed;">
							<div class="hc_time" id="hc_time">00:45:00</div>
							<ul>
								<li class="on">阅读原题</li>
								<li class="paper_submit" id="paper_submit">我要交卷</li>
								<!-- <li class="paper_save" id="paper_save">下次继续做</li> -->
							</ul>

						</div>
					</div>
					<div class="right">
						<div class="zuoda_box">

							<h1>
								<span>选择题</span><a href="javascript:void(0);"
									onclick="toggle_zuoda_box(1, this);">收起↑</a>
							</h1>

							<div class="text" id="text_box_1" data-flag="0">

								<table class="topiclist1">
									<%
										List<XuanZe> zx = (List<XuanZe>) session.getAttribute("xuanze");
										XuanZe xuanze = null;

										for (int i = 0; i < zx.size(); i++) {
											xuanze = zx.get(i);
									%>
									<tr class="huanxian">
										<td colspan="2"><%=(i + 1) + "、" + xuanze.getTiMu()%></td>
									</tr>

									<tr class="huanxian">
										<td><input type="radio" name="<%=(i + 1)%>"
											value="A"><%=xuanze.getA()%></td>
										<td><input type="radio" name="<%=(i + 1)%>"
											value="B"><%=xuanze.getB()%></td>
									</tr>
									<tr>
										<td><input type="radio" name="<%=(i + 1)%>"
											value="C"><%=xuanze.getC()%></td>
										<td><input type="radio" class="radio" name="<%=(i + 1)%>"
											value="D"><%=xuanze.getD()%></td>
									</tr>
									<%
										}
									%>
								</table>

							</div>
							<h1>
								<span>判断题</span><a href="javascript:void(0);"
									onclick="toggle_zuoda_box(2, this);">收起↑</a>
							</h1>

							<div class="text" id="text_box_2" data-flag="0">
								<s:action id="xuanze" name="pangduan">

									<table class="topiclist1">
										<%
											List<PangDuan> pd = (List<PangDuan>) session
														.getAttribute("pangduan");
												PangDuan pangduan = null;

												for (int i = 0; i < pd.size(); i++) {
													pangduan = pd.get(i);
										%>
										<tr class="huanxian">
											<td colspan="2"><%=(i + 1) + "、" + pangduan.getTiMu()%></td>
										</tr>
										<tr></tr>
										<tr class="huanxian">
											<td><input type="radio" name="<%=(i + 11)%>" value="1">正确
											</td>
											<td><input type="radio" name="<%=(i + 11)%>" value="0">错误
											</td>
										</tr>

										<%
											}
										%>
									</table>
								</s:action>
							</div>
							<h1>
								<span>主观题</span><a href="javascript:void(0);"
									onclick="toggle_zuoda_box(3, this);">收起↑</a>
							</h1>

							<div class="text" id="text_box_3" data-flag="0">
								<s:action id="xuanze" name="zhuguan">
									<table class="topiclist1">
										<%
											List<KeGuan> zg = (List<KeGuan>) session
														.getAttribute("zhuguan");
												KeGuan zhuguan = null;

												for (int i = 0; i < zg.size(); i++) {
													zhuguan = zg.get(i);
										%>
										<tr class="huanxian">
											<td colspan="2"><%=(i + 1) + "、" + zhuguan.getTiMu()%></td>
										</tr>
										<tr></tr>
										<tr></tr>
										<%
											}
										%>
									</table>
								</s:action>
							</div>
						</div>
					</div>
				</form>
				<div class="clearfix"></div>
			</div>

			<div
				style="z-index:99;margin:0 auto;width:1000px;height:330px;position:relative;">
				<div class="Expand_box"
					style="z-index:999; position:fixed; bottom:0;">
					<h1>
						<span class="Expand_btn">展开答题区</span>
					</h1>
					<div class="Expand_in">
						<ul class="tab">
							<li><a class="focus" href="javascript:void(0);"
								onclick="select_sq(0,this);">第一题</a></li>
							<li><a href="javascript:void(0);"
								onclick="select_sq(1,this);">第二题</a></li>
							<li><a href="javascript:void(0);"
								onclick="select_sq(2,this);">第三题</a></li>
						</ul>

						<div id="sq_detail_0" class="sq_detail ">
							<textarea id="status_0" class="sq_answer" data-sq-id="1280"
								onkeydown="count_char('status_0','counter_0');"
								onkeyup="count_char('status_0','counter_0');"></textarea>
							<p class="right">
								当前已输入<span id="counter_0">0</span>字
							</p>
						</div>
						<div id="sq_detail_1" class="sq_detail hide">
							<textarea id="status_1" class="sq_answer" data-sq-id="1281"
								onkeydown="count_char('status_1','counter_1');"
								onkeyup="count_char('status_1','counter_1');"></textarea>
							<p class="right">
								当前已输入<span id="counter_1">0</span>字
							</p>
						</div>
						<div id="sq_detail_2" class="sq_detail hide">
							<textarea id="status_2" class="sq_answer" data-sq-id="1282"
								onkeydown="count_char('status_2','counter_2');"
								onkeyup="count_char('status_2','counter_2');"></textarea>
							<p class="right">
								当前已输入<span id="counter_2">0</span>字
							</p>
						</div>

					</div>
				</div>
			</div>

			<div class="box_bottom">
				<img src="<%=request.getContextPath()%>/system/css/box_bottom_bg05.jpg" />
			</div>
		</div>

	</div>
	<jsp:include page="/system/footer.jsp"></jsp:include>
</body>
</html>
