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

