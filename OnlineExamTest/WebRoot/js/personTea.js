function submit(){
	var tel = document.getElementsByName("tel");
	var email = document.getElementsByName("e-mail");
	var sushe = document.getElementsByName("sushe");
	var susheTel = document.getElementsByName("sushe-tel");
	var home = document.getElementsByName("home");
	var homeTel = document.getElementsByName("home-tel");
	var youbian = document.getElementsByName("youbian");
	alert(email+"~~"+email[0].value.replace("(点击修改)", "")+"~~"+tel[0].value.replace("(点击修改)", ""));
	var url = 'checkTeaPersonal' ;
	$.ajax({
		type : "post",
		url : url,
		data : {
			"tel" : tel[0].value.replace("(点击修改)", ""),
			"email" : email[0].value.replace("(点击修改)", ""),
			"sushe" : sushe[0].value.replace("(点击修改)", ""),
			"susheTel" : susheTel[0].value.replace("(点击修改)", ""),
			"home" : home[0].value.replace("(点击修改)", ""),
			"homeTel" :homeTel[0].value.replace("(点击修改)", ""),
			"youbian" :youbian[0].value.replace("(点击修改)", "")
		},
		dataType : 'json',
		success : function(URL) {
			alert("您的信息已经修改成功！");
			$.modal.close();
			window.location.href = "personal.jsp";
		},
		error : function(){
			alert("修改失败,请重新提交！");
			$.modal.close();
		} 
		
	});
}