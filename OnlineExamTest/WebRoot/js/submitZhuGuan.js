function submitZg(){
	//var no  = document.getElementById("no");
	var no1 = document.getElementsByName("no1");
	var no2 = document.getElementsByName("no2");
	var no3 = document.getElementsByName("no3");
	alert(document.getElementById("no").value);
	var url = 'system/teacher/zhuGuanSubmit';
	$.ajax({
		type : "post",
		url : url,
		data : {
			"no"  : document.getElementById("no").value,
			"no1" : no1[0].value,
			"no2" : no2[0].value,
			"no3" : no3[0].value
		},
		dataType : 'json',
		success : function(URL) {
			alert("评卷成功！辛苦您了，敬爱的老师");
			$.modal.close();
			window.location.href = "shouye.jsp";
		},
		error : function(){
			alert("服务器在开小差，麻烦您重试！");
			$.modal.close();
		} 
		
	});
}