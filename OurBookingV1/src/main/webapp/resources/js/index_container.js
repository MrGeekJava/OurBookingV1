/**
 * Created by Nier on 2018/8/8.
 */
$(document).ready(function() {
    $("#hide_i").click(function(){
       $("#container_holiday").hide("show");
    });

    //显示文字
    $('.user_email').hover(function(){
        $('.tip2').fadeIn();
        $('.tip2').text($('.user_email').attr('data-title'));
    });

    //获取鼠标位置
    $('.user_email').mousemove(function(e){
        var top = e.pageY+15;
        var left = e.pageX+20; //使得文字块显示在鼠标的右下方
        $('.tip2').css({
            'top' : top + 'px',
            'left': left+ 'px'
        });
    });


    //隐藏文字
    $('.user_email').mouseout(function(){
        $('.tip2').hide();
    });



});




    $(document).ready(function(){
        //内容4
        var slideindex4 = 0;
        $("#slideLeftBtn4").click(function(){
            slideindex4--;
            var animateLength = slideindex4 * 275 + "px";
            $(".container4list").animate({"left":animateLength},"slow",function(){
                if(slideindex4==2){
                    $("#slideLeftBtn4").hide();
                    //return false;
                }
            });
        });
        $("#slideRightBtn4").click(function(){
            // 点击右按钮的时候想要显示当前图片的后一张，所以slideIndex值要加上1
            slideindex4++;
            var animateLength = slideindex4 * 275 + "px";
            $(".container4list").animate({"left":animateLength},"slow")  });

        //内容5
        var slideindex5 = 0;
        $("#slideLeftBtn5").click(function(){
            slideindex5--;
            var animateLength = slideindex5 * 550 + "px";
            $(".container5list").animate({"left":animateLength},"slow",function(){
                if(slideindex5==2){
                    //$("#slideLeftBtn5").hide();
                    //return false;
                    $(".container5list").stop();
                }
            });
        });
        $("#slideRightBtn5").click(function(){
            // 点击右按钮的时候想要显示当前图片的后一张，所以slideIndex值要加上1
            slideindex5++;
            var animateLength = slideindex5 * 550 + "px";
            $(".container5list").animate({"left":animateLength},"slow")  });

        $(".container6 ul li p").css("color","#006BBc");

        //内容7
        $(".tab_menu li").click(function(){
            //获取当前元素下标
            var _index = $(this).index();
            //显示当前，隐藏其他的
            $(".tab_box div").eq(_index).show().siblings().hide();
            $(this).addClass("change").siblings().removeClass("change");
        });
        //内容8
        $(".tab_menu8 li").click(function(){
            //获取当前元素下标
            var _index8 = $(this).index();
            //显示当前，隐藏其他的
            $(".tab_box8 div").eq(_index8).show().siblings().hide();
            $(this).addClass("change").siblings().removeClass("change");
        });

        //内容9
        $(".tab_menu9 li").click(function(){
            var _index9 = $(this).index();
            $(".tab_box9 div").eq(_index9).show().siblings().hide();
            $(this).addClass("change").siblings().remove("change");
        });
    });

