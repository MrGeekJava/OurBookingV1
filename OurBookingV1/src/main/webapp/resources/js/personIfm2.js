$(document).ready(function(){
	//personInfor2.jsp获取cookie表单的值
//	alert($.cookie("Order_User_Name"));
//	alert($.cookie("Order_User_Email"));
	$(".get_user_Name").text($.cookie("Order_User_Name"));
	$(".get_user_email").text($.cookie("Order_User_Email"));

	$("#get_pre_tel").blur(function(){
        var inpvalue = $("#get_pre_tel").val().split(" ")[1];
		var phone=/^1[34578]\d{9}$/;		
		if(inpvalue.match(phone)==null){ 
//			alert("不是手机好吗");
			    $(".input_ifm_tel").html("<p style='color: red;'>请检查您的电话号码</p>");
	            $("#get_pre_tel").css("border-color","red");
	        }else{
//	    		alert("是手机好吗");
				 $(".input_ifm_tel").html("<p style='display: inline-block'><i style='color:#383838;font-style:normal;'>请填写您的电话号码</i><i style='color: red;display: inline-block'>*</i> </p>");
	            $("#get_pre_tel").css("border-color","green");
	        }
	});
	
});