function check(){
	var select = document.getElementById("all").value;
	var xuehao = document.getElementById("sortByXueHao").value;
	var name = document.getElementById("sortByName").value;
	alert(select+"~`"+xuehao+"~"+name);
	var url = checkTo;
	$ajax({
		type : "post",
		url : url,
		data : {
			select : select ,
			xuehao : xuehao ,
			name : name 
		},
		dataType : 'json',
		success : function(URL) {
			alert("您的信息已经查询成功！");
			$.modal.close();
			location.reload();
		},
		error : function(){
			alert("查询失败,请重新查询！");
			$.modal.close();
		} 
	});
}

function clean(){
	document.getElementById("all").value="全部";
	document.getElementById("sortByXueHao").value="";
	document.getElementById("sortByName").value="";
	location.reload();
}