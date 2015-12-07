var float_second = 0;
var answers_1 = new Array();
var answers_2 = new Array();
var answers_3 = new Array();
var no_Num = 0;

$(function() {

	// 时间
	// var float_second = 0;
	var timeout;
	function show_time() {
		float_second++;
		var t_hour = parseInt(float_second / 3600);
		var t_minute = parseInt((float_second % 3600) / 60);
		var t_second = float_second % 60;
		if (t_hour < 10)
			t_hour = '0' + t_hour;
		if (t_minute < 10)
			t_minute = '0' + t_minute;
		if (t_second < 10)
			t_second = '0' + t_second;
		$('#hc_time').html(t_hour + ':' + t_minute + ':' + t_second);
		timeout = window.setTimeout(show_time, 1000);
	}
	// 控制第一次进入才显示
	alert("考试时长：45分钟！祝君成功！");
	// 控制刷新页面，上交试卷
	show_time();

	// 交卷
	$('#paper_submit')
			.click(
					function() {
						ajax_answer_1();
						ajax_answer_2();
						ajax_answer_3();

						var html = '';
						html += '<div class="commit-exercise-wrap"><div class="commit-exercise">';
						html += '<div class="lead">还剩' + no_Num
								+ '道题未答完，确定要交卷吗？</div>';
						html += '<div class="button-row">';
						html += '<span class="btn btn-paper btn-paper-xlarge submit">确定交卷</span>';
						html += '<br>';
						html += '<span class="btn btn-paper btn-paper-xlarge cancel">谢谢提醒，继续做</span>';
						html += '</div>';
						html += '</div>';
						html += '</div>';
						$.modal(html);
						clearTimeout(timeout);

						// alert(float_second);

						$('.commit-exercise-wrap .submit').click(function() {
							var url = 'submit';
							var xuanze = answers_1.toString();
							var pangduan = answers_2.toString();
							var zhuguan = answers_3.toString();
//							alert(xuanze + "~~" + pangduan + "~~" +zhuguan);
							$.ajax({
								type : "post",
								url : url,
								data : {
									"xuanze" : xuanze,
									"pangduan" : pangduan,
									"zhuguan" : zhuguan
								},
								dataType : 'json',
								success : function(URL) {
									alert("恭喜你交卷成功！");
									$.modal.close();
									window.location.href = "jsp/shouye.jsp";
								},
								error : function(){
									alert("交卷失败,请重新提交！");
									$.modal.close();
								} 
								
							});
							
						});

						$('.commit-exercise-wrap .cancel').click(function() {
							$.modal.close();
							show_time();
						});
						no_Num = 0;
					});
});

// 答题 单选题
function ajax_answer_1() {

	var question_ids = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	// var answers = new Array();
	// alert(question_ids.length);
	for (var iIndex = 0; iIndex < question_ids.length; iIndex++) {
		var tt = document.getElementsByName(question_ids[iIndex]);
		var mark = 0;
		for (var id = 0; id < tt.length; id++) {
			if (tt[id].checked) {

				mark = 1;
				answers_1[iIndex] = tt[id].value;
				break;
			}
		}
		if (mark == 0) {
			answers_1[iIndex] = -1;
			no_Num++;
		}
//		 alert(answers_1[iIndex]);
	}

}

// 答题 判断题
function ajax_answer_2() {

	var question_ids = new Array(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
	// var answers = new Array();
	// alert(question_ids.length);
	for (var iIndex = 0; iIndex < question_ids.length; iIndex++) {
		var tt = document.getElementsByName(question_ids[iIndex]);
		var mark = 0;
		for (var id = 0; id < tt.length; id++) {
			if (tt[id].checked) {
				mark = 1;
				answers_2[iIndex] = tt[id].value;
				break;
			}
		}
		if (mark == 0) {
			answers_2[iIndex] = -1;
			no_Num++;
		}
//		 alert(answers_2[iIndex]);
	}

}

// 主观题
function ajax_answer_3() {
	var text_1 = document.getElementById("status_0");
	var text_2 = document.getElementById("status_1");
	var text_3 = document.getElementById("status_2");

	answers_3[0] = text_1;
	answers_3[1] = text_2;
	answers_3[2] = text_3;
	// 第一题
	if (text_1.value == null || text_1.value == "") {
		answers_3[0] = -1;
		no_Num++;
	} else
		answers_3[0] = text_1.value;

	// 第二题
	if (text_2.value == null || text_2.value == "") {
		answers_3[1] = -1;
		no_Num++;
	} else
		answers_3[1] = text_2.value;

	// 第三题
	if (text_3.value == null || text_3.value == "") {
		answers_3[2] = -1;
		no_Num++;
	} else
		answers_3[2] = text_3.value;

	// 校验问答题答案输出
	// alert(answers_3[0]);
	// alert(answers_3[1]);
	// alert(answers_3[2]);
}
