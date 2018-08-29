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



});


function set_Pre_tel(){
    var selectValue= $('#select_pre_phone option:selected').text();
    document.getElementById("get_pre_tel").value = selectValue;
}





























