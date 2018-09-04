/**
 * Created by Nier on 2018/8/16.
 */
$(document).ready(function () {
    $('.order_ifm_p1').hover(function () {
        $('.tips').fadeIn();
        $('.tips').text($('.order_ifm_p1').attr('data-title'));
    });

    $('.order_ifm_p1').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX -31; //使得文字块显示在鼠标的右下方
        $('.tips').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.order_ifm_p1').mouseout(function () {
        $('.tips').hide();
    });


    $('.order_information_next1_p').hover(function () {
        //$('.tip3').show();
        $('.tip3').show("show");
        $('.tip3').text($('.order_information_next1_p').attr('data-title'));
    });

    $('.order_information_next1_p').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.tip3').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });


    //显示图片
    $('.container_order_ifm_img').hover(function () {
        $('.modal').show();
    });

    $('.order_ifm_r_img1').hover(function () {
        $('.modal2').show();
    });
    $('.order_ifm_r_img2').hover(function () {
        $('.modal3').show();
    });
    $('.order_ifm_r_img3').hover(function () {
        $('.modal4').show();
    });
    $('.order_ifm_r_img4').hover(function () {
        $('.modal5').show();
    });

    //图片移动
    $('.container_order_ifm_img').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.modal').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.order_ifm_r_img1').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.modal2').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.order_ifm_r_img2').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.modal3').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.order_ifm_r_img3').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.modal4').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    $('.order_ifm_r_img4').mousemove(function (e) {
        var top = e.pageY + 15;
        var left = e.pageX + 20; //使得文字块显示在鼠标的右下方
        $('.modal5').css({
            'top': top + 'px',
            'left': left + 'px'
        });
    });

    //图片隐藏
    $('.container_order_ifm_img').mouseout(function () {
        $('.modal').hide();
    });

    $('.order_ifm_r_img1').mouseout(function () {
        $('.modal2').hide();
    });

    $('.order_ifm_r_img2').mouseout(function () {
        $('.modal3').hide();
    });
    $('.order_ifm_r_img3').mouseout(function () {
        $('.modal4').hide();
    });
    $('.order_ifm_r_img4').mouseout(function () {
        $('.modal5').hide();
    });


    $('.order_information_next1_p').mouseout(function () {
        $('.tip3').hide();
    });


//表单标签事件
    $(".input_ifm_centre_inp").blur(function () {
        //alert("q");
        var inpvalue = $(".input_ifm_centre_inp").val();
        //alert(inpvalue);
        if(inpvalue!=""){
            $(".input_ifm_centre_p").html("<p style='display: inline-block'>姓（拼音或英语<i style='color: red;display: inline-block'>*</i> </p>");
            $(".input_ifm_centre_inp").css("border-color","green");

        }else{
            $(".input_ifm_centre_p").html("<p style='color: red;'>请填写您的姓</p>");
            $(".input_ifm_centre_inp").css("border-color","red");
        }
    });

    $(".input_ifm_right_inp").blur(function () {
        //alert("q");
        var inpvalue = $(".input_ifm_right_inp").val();
        //alert(inpvalue);
        if(inpvalue!=""){
            $(".input_ifm_right_p").html("<p style='display: inline-block'>名（拼音或英语）</p>");
            $(".input_ifm_right_inp").css("border-color","green");

        }else{
            $(".input_ifm_right_p").html("<p style='color: red;'>请填写您的名</p>");
            $(".input_ifm_right_inp").css("border-color","red");
        }
    });






    $(".input_ifm_inp_email").blur(function () {
        //alert("q");
        var inpvalue = $(".input_ifm_inp_email").val();
        //alert(inpvalue);

        var pattern= /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
        var strEmail=pattern.test(inpvalue);
        if(strEmail){
            //邮箱格式正确
            $(".user_ifm_p").html("<p style='display: inline-block'>邮箱号码<i style='color: red;display: inline-block'></i> </p>");
            $(".input_ifm_inp_email").css("border-color","green");
        }else{
            //邮箱格式不正确
            $(".user_ifm_p").html("<p style='color: red;'>请填入有效的邮箱号码</p>");
            $(".input_ifm_inp_email").css("border-color","red");
        }
    });

    $(".input_ifm_inp_email2").blur(function () {
        //alert("q");
        var inpvalue2 = $(".input_ifm_inp_email2").val();
        var inpvalue = $(".input_ifm_inp_email").val();
        var pattern= /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
        var strEmail=pattern.test(inpvalue2);
        if(strEmail){
            //确认邮箱格式正确
                if(inpvalue2==inpvalue){
                    $(".user_ifm_p2").html("<p style='display: inline-block'>确认邮箱号码<i style='color: red;display: inline-block'></i> </p>");
                    $(".user_ifm_p").html("<p style='display: inline-block'>邮箱号码<i style='color: red;display: inline-block'></i> </p>");
                    $(".input_ifm_inp_email").css("border-color","green");
                    $(".input_ifm_inp_email2").css("border-color","green");
                }else{
                    $(".user_ifm_p").html("<p style='color: red;'>请检查两个邮箱号码是否一致</p>");
                    $(".input_ifm_inp_email").css("border-color","red");
                    $(".input_ifm_inp_email2").css("border-color","red");
                }
        }
        else{
            //邮箱格式不正确
                    $(".user_ifm_p").html("<p style='color: red;'>请填入有效的邮箱号码</p>");
                    $(".input_ifm_inp_email").css("border-color","red");
                    $(".input_ifm_inp_email2").css("border-color","red");
        }

    });









});


function set_Pre_tel(){
    var selectValue= $('#select_pre_phone option:selected').val();
    document.getElementById("get_pre_tel").value = selectValue;
}





























