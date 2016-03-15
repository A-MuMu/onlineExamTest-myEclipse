<%@page import="rainbow.example.domain.ShiJuan"%>
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
<link href="<%=request.getContextPath()%>/system/css/page.css"
	type="text/css" rel="stylesheet" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js">
	
</script>
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
		ShiJuan sj = (ShiJuan) session.getAttribute("sj");
	%>
	<div class="main">

		<div class="box">

			<div class="page_content" data-id="2036981"
				style="position:relative;">
				<%
					
				%>
				<div class="page_nav">
					<span><a href="<%=request.getContextPath()%>/system/teacher/checkMyStudent.jsp" style="color:black;font-weight:bold">返回</a> &gt;&gt;</span> <span id="test"
						style="color:#EE0000;font-weight:bold">红色标记为正确答案！</span>
				</div>
				<div class="hc_title"><%="2014-2015第二学期" + " " + sj.getNameXK() + " " + "期末试卷"%></div>
				<form id="xuanze" name="xuanze" method="post" action="xuanze.action">
					<div class="left">
						<div style="height:1px;"></div>
						<div class="hc_side" style="width:144px; position:fixed;">
							<div class="hc_time"></div>
							<ul>
								<li class="on" style="font-weight: bold;">试卷号：</li>
								<li class="paper_submit" style="font-weight: bold;"><%=sj.getSjId()%></li>
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
										List<XuanZe> list1 = new ArrayList<XuanZe>();
										list1.add(sj.getXuanZeByXuanze1()); 
										list1.add(sj.getXuanZeByXuanze2()); 
										list1.add(sj.getXuanZeByXuanze3()); 
										list1.add(sj.getXuanZeByXuanze4()); 
										list1.add(sj.getXuanZeByXuanze5()); 
										list1.add(sj.getXuanZeByXuanze6()); 
										list1.add(sj.getXuanZeByXuanze7()); 
										list1.add(sj.getXuanZeByXuanze8()); 
										list1.add(sj.getXuanZeByXuanze9()); 
										list1.add(sj.getXuanZeByXuanze10()); 
										for(int i =0 ; i<list1.size();i++){
									%>
									<tr class="huanxian">
										<td colspan="2"><%=(i + 1) + "、" +list1.get(i).getTiMu()%></td>
									</tr>

									<tr class="huanxian">
										<td><input type="radio" name="<%=(i + 1)%>" value="A"><span
											id="<%=(4*i + 0)%>"><%=list1.get(i).getA()%></span></td>
										<td><input type="radio" name="<%=(i + 1)%>" value="B"><span
											id="<%=(4*i + 1)%>"><%=list1.get(i).getB()%></span></td>
									</tr>
									<tr>
										<td><input type="radio" name="<%=(i + 1)%>" value="C"><span
											id="<%=(4*i + 2)%>"><%=list1.get(i).getC()%></span></td>
										<td><input type="radio" name="<%=(i + 1)%>" value="D"><span
											id="<%=(4*i + 3)%>"><%=list1.get(i).getD()%></span></td>
									</tr>
									<script type="text/javascript"> 
										var abcd = '<%=list1.get(i).getDaAn()%>';
										if(abcd == 'A'){
											var aaa = '<%=(4*i + 0)%>';
											document.getElementById(aaa).style.color = "#EE0000";
											document.getElementById(aaa).style.fontWeight="bold";
										}
										if(abcd == 'B'){
											var bbb = '<%=(4*i + 1)%>';
											document.getElementById(bbb).style.color = "#EE0000";
											document.getElementById(bbb).style.fontWeight="bold";
										}
										if(abcd == 'C'){
											var ccc = '<%=(4*i + 2)%>';
											document.getElementById(ccc).style.color = "#EE0000";
											document.getElementById(ccc).style.fontWeight="bold";
										}
										if(abcd == 'D'){
											var ddd = '<%=(4*i + 3)%>';
											document.getElementById(ddd).style.color = "#EE0000";
											document.getElementById(ddd).style.fontWeight = "bold";
										}
									</script>
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

								<table class="topiclist1">
									<%
									List<PangDuan> list2 = new ArrayList<PangDuan>();
									list2.add(sj.getPangDuanByPangduan1());
									list2.add(sj.getPangDuanByPangduan2());
									list2.add(sj.getPangDuanByPangduan3());
									list2.add(sj.getPangDuanByPangduan4());
									list2.add(sj.getPangDuanByPangduan5());
									list2.add(sj.getPangDuanByPangduan6());
									list2.add(sj.getPangDuanByPangduan7());
									list2.add(sj.getPangDuanByPangduan8());
									list2.add(sj.getPangDuanByPangduan9());
									list2.add(sj.getPangDuanByPangduan10());
									for(int j = 0;j < list2.size();j++){
									%>
									<tr class="huanxian">
										<td colspan="2"><%=list2.get(j).getTiMu() %></td>
									</tr>
									<tr></tr>
									<tr class="huanxian">
										<td><input type="radio" name="<%=j+11 %>" value="1"><span id="<%=-(2*j+1) %>">正确</span></td>
										<td><input type="radio" name="<%=j+11 %>" value="0"><span id="<%=-(2*j+2) %>">错误</span></td>
									</tr>
									<script type="text/javascript"> 
										var abcd = '<%=list2.get(j).getDaAn()%>';
										if(abcd == '1'){
											var aaa = '<%=-(2*j + 1)%>';
											document.getElementById(aaa).style.color = "#EE0000";
											document.getElementById(aaa).style.fontWeight="bold";
										}
										if(abcd == '0'){
											var bbb = '<%=-(2*j + 2)%>';
											document.getElementById(bbb).style.color = "#EE0000";
											document.getElementById(bbb).style.fontWeight="bold";
										}
									</script>
									<%} %>
								</table>
							</div>
							<h1>
								<span>主观题</span><a href="javascript:void(0);"
									onclick="toggle_zuoda_box(3, this);">收起↑</a>
							</h1>

							<div class="text" id="text_box_3" data-flag="0">
								<table class="topiclist1">
								<%
								List<KeGuan> list3 = new ArrayList<KeGuan>();
								list3.add(sj.getKeGuanByZhuguan1());
								list3.add(sj.getKeGuanByZhuguan2());
								list3.add(sj.getKeGuanByZhuguan3());
								for(int k = 0; k<list3.size();k++){
								%>
									<tr class="huanxian">
										<td colspan="2"><%=list3.get(k).getTiMu() %></td>
									</tr>
								<%} %>
								</table>
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
				<img
					src="<%=request.getContextPath()%>/system/css/box_bottom_bg05.jpg" />
			</div>
		</div>

	</div>
	<jsp:include page="/system/teacher/footer.jsp"></jsp:include>
</body>
</html>
