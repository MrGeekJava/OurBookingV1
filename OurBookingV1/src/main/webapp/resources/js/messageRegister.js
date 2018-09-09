/**
 * Created by xiaoxin on 2018/9/9.
 */
$(document).ready(function(){

    $(".LAR-ulphone>.icon-cha2").click(function(){
        $("#LARidphone").fadeOut();
        $(".LAR-Containerphone").fadeOut();
    });
    $(".acquireMaphone").click(function(){
       
        phone = $("#emailInputphone").val();
        var pattern = /^1[34578]\d{9}$/;
        if(pattern.test(phone)==false){
            $("#emailInputphone").val("");
            alert("输入手机号码格式不正确");

        };

        //利用ajax把手机号传入后台
        $.ajax({
            url: 'SendSms',
            type: "POST",
            //发送参数
            data: {"phone":phone},
            //返回结果
            success: function(result){
                //控制台打印结果
                //console.log("验证码是"+result);
                code = result;
            }
        });
    });
    $(".sub-btnphone").click(function(){
        //验证验证码
        var sms = $("#pwdInputphone").val();
        alert(sms);
        if(sms==""){
            alert("验证码未填写！");
        }else{
            if(code==sms){
                alert("登录成功");
            }else{
                $("#pwdInputphone").val("");
                alert("验证码错误");
            }
        }


    });
//监听短信验证按键
    $(".weicharLogin").click(function(){
    	$(".LAR-Background").css({"display":"none"});
        $("#LARidphone").fadeIn();
        $(".LAR-Containerphone").fadeIn();
    });
    
    $(".weicharLoginphone").click(function(){
    	$("#LARidphone").fadeOut();
    	$(".LAR-Containerphone").fadeOut();
    	$(".LAR-Background").show();
    	$("#LAR-login").show();
        $("#LAR-register").hide();
        $("#loginLi").css("background-color", "white");
        $("#registerLi").css("background-color", "#E9F0FA");
    });
});
