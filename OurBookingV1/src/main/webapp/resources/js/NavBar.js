//登录注册
// 显示提示信息
$(document).ready(function () {
    $('#reg-btn').hover(function () {
        $('.index_tip').fadeIn();
        $('.index_tip').text($('#reg-btn').attr('data-title'));
    });

    $('#log-btn').hover(function () {
        $('.index_tip').fadeIn();
        $('.index_tip').text($('#log-btn').attr('data-title'));
    });

    $('#mon_tex').hover(function () {
        $('.index_tip').fadeIn();
        $('.index_tip').text($('#mon_tex').attr('data-title'));
    });

    $('#lang-i').hover(function () {
        $('.index_tip').fadeIn();
        $('.index_tip').text($('#lang-i').attr('data-title'));
    });


    $('#wechat-i').hover(function () {
        $('#none_img_id').show();
    });

    $('#wechat-i').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('#none_img_id').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });
    //图片隐藏
    $('#wechat-i').mouseout(function () {
        $('#none_img_id').hide();
    });

    $('.user-btn').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.index_tip').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.user-tex').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20;
        $('.index_tip').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });


    $('#img_id').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20;
        $('.index_tip').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.lang_cla').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20;
        $('.index_tip').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });



    $('.user-btn').mouseout(function () {
        $('.index_tip').hide();
    });

    $('.user-tex').mouseout(function () {
        $('.index_tip').hide();
    });

    $('#img_id').mouseout(function () {
        $('.index_tip').hide();
    });


    $(".person_class_a").click(function(){

        $(".showIfm_none").toggle();
    });
});

// 显示登录/注册窗口
// 切换和关闭登录/注册窗口
$(document).ready(function () {
    $("#loginLi").click(function() {
        $("#LAR-login").show();
        $("#LAR-register").hide();
        $("#loginLi").css("background-color", "white");
        $("#registerLi").css("background-color", "#E9F0FA");
    });
    $("#registerLi").click(function() {
        $("#LAR-login").hide();
        $("#LAR-register").show();
        $("#loginLi").css("background-color", "#E9F0FA");
        $("#registerLi").css("background-color", "white");
    });

    $("#log-btn").click(function() {
        $("#LARid").css({"display":"block"});
        $("#loginLi").click();
    });

    $("#reg-btn").click(function(){
        $("#LARid").css({"display":"block"});
        $("#registerLi").click();
    });

    $("#closebtn").click(function () {
        $("#LARid").hide();
    });
    
    $("#eopInput").blur(function(){
    	var eop = $("#eopInput").val();
    	$.ajax({
    		url:"RegisterVerifyServlet",
    		data:{EOP:eop},
    		success:function(result){
    			if(result == '0'){
    				$("#eoplogin").text("× 格式错误");
    			} else if(result == '2'){
    				$("#eoplogin").text("× 用户不存在");
    			} else {
    				$("#eoplogin").text("");
    			}
    		},
    		error:function(){
    			alert("sorry!网络错误");
    		}
    	});
    });
    $("#eopInput2").blur(function(){
    	var eop = $("#eopInput2").val();
    	$.ajax({
    		url:"../RegisterVerifyServlet",
    		data:{EOP:eop},
    		success:function(result){
    			if(result == '0'){
    				$("#eoplogin").text("× 格式错误");
    			} else if(result == '2'){
    				$("#eoplogin").text("× 用户不存在");
    			} else {
    				$("#eoplogin").text("");
    			}
    		},
    		error:function(){
    			alert("sorry!网络错误");
    		}
    	});
    });
    
//    当鼠标移出的时候，进行判断
    $("#eopReg").blur(function(){
    	var eop = $("#eopReg").val();
    	$.ajax({
    		url:"RegisterVerifyServlet",
    		data:{EOP:eop},
    		success:function(result){
    			if(result == '0'){
    				$("#eop").text("× 格式错误");
    			} else if(result == '1'){
    				$("#eop").text("× 该用户已存在");
    			} else {
    				$("#eop").text("√ 账号可用");
    			}
    		},
    		error:function(){
    			alert("sorry!网络错误");
    		}
    	});
    });
    $("#eopReg1").blur(function(){
    	var eop = $("#eopReg1").val();
    	$.ajax({
    		url:"../RegisterVerifyServlet",
    		data:{EOP:eop},
    		success:function(result){
    			if(result == '0'){
    				$("#eop").text("× 格式错误");
    			} else if(result == '1'){
    				$("#eop").text("× 该用户已存在");
    			} else {
    				$("#eop").text("√ 账号可用");
    			}
    		},
    		error:function(){
    			alert("sorry!网络错误");
    		}
    	});
    });
    
//    验证码
    $("input[name='verifyName1']").blur(function(){
    	var verifyCode = $("input[name='verifyName1']").val();
    	$.ajax({
    		url:"VerifyServlet",
    		data:{VC:verifyCode},
    		success:function(result){
    			$("#verifyCode").text(result);
    		},
    		error:function(){
    			alert("sorry!网络错误");
    		}
    	});
    });
    $("input[name='verifyName']").blur(function(){
    	var verifyCode = $("input[name='verifyName']").val();
    	$.ajax({
    		url:"../VerifyServlet",
    		data:{VC:verifyCode},
    		success:function(result){
    			$("#verifyCode").text(result);
    		},
    		error:function(){
    			alert("sorry!网络错误");
    		}
    	});
    });
    
    /**
     * 注册
     */
    
    $("input[name='reginsterBtn1']").unbind('click').click(function(){
    	if($("#eop").text()=="√ 账号可用" && $("#verifyCode").text()=="√"){
        	var userEmail = $(".emailInput2").val();
        	var userPassword = $(".pwdInput2").val();
    		 $.getJSON(
    				 '../RegisterServlet',
    				 {EmailOrPhone:userEmail,password:userPassword},
    				 function(result){
    					 if(result){
    						 alert("恭喜"+userEmail+"注册成功");
    						 $(".emailInput").attr("value",userEmail);
    						 $("#log-btn").click();
    					 }else{
    						 alert("注册失败！");
    					 }
    				 });
        } else {
        	alert("信息不正确");
        }
	});
    $("input[name='reginsterBtn']").unbind('click').click(function(){
    	if($("#eop").text()=="√ 账号可用" && $("#verifyCode").text()=="√"){
        	var userEmail = $(".emailInput2").val();
        	var userPassword = $(".pwdInput2").val();
    		 $.getJSON(
    				 'RegisterServlet',
    				 {EmailOrPhone:userEmail,password:userPassword},
    				 function(result){
    					 if(result){
    						 alert("恭喜"+userEmail+"注册成功");
    						 $(".emailInput").attr("value",userEmail);
    						 $("#log-btn").click();
    					 }else{
    						 alert("注册失败！");
    					 }
    				 });
        } else {
        	alert("信息不正确");
        }
	});
    
//显示选择货币窗口
    $("#mon_tex").click(function () {
        $("#mon_id_box").toggle();
        $("#language_id").hide();
    });

//显示选择语言
    $(".lang-i-cla").click(function () {
        $("#language_id").toggle();
        $("#mon_id_box").hide();

    });

//显示图片
    $(".user-li_3").mousemove(function () {
        $("#img_id").show();
    });
//隐藏图片
    $(".user-li_3").mouseout(function () {
        $("#img_id").hide();
    });

});
