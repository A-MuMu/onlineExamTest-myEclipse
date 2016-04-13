function submit(){
	var loginID = document.getElementsByName("loginID");
	var loginPSW = document.getElementsByName("loginPSW");
	var url = 'system/login/userLogin';
	$.ajax({
		type : "post",
		url : url,
		data : {
			"loginID" : loginID[0].value,
			"loginPSW": loginPSW[0].value
		},
		dataType : 'json',
		success : function(URL) {
			if (URL == "1"){
				alert("登陆成功！");
				$.modal.close();
				window.location.href ="../student/shouye.jsp";
			}
			else if (URL == "2"){
				alert("登陆成功！");
				$.modal.close();
				window.location.href ="../teacher/shouye.jsp";
			}
			else if (URL == "3"){
				alert("登陆成功！");
				$.modal.close();
				window.location.href ="../admin/shouye.jsp";
			}
			else{
				alert("登录失败,请确认账号密码！");
				$.modal.close();
				location.reload();
			}
		},
		error : function(){
			alert("登录失败,请确认账号密码！");
			$.modal.close();
			location.reload();
		} 
		
	});
}