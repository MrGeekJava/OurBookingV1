/**
 * Created by Nier on 2018/8/8.
 */
$(document).ready(function() {
	
    $("#hide_i").click(function(){
       $("#container_holiday").hide("show");
    });    
  //处理注册
    //在页面中动态加载相同模块的时候，当触发第二次加载的模块时，有时会连第一个模块的内容随之改变，这是因为为第一个模块注册点击事件时并没有销毁而执行了两遍。
    //此时需要手动的添加事件移除方法，可以选择在每次事件处理完成后销毁该事件，也可选择在下次事件触发前销毁之前的事件。
    //用unbind消除
    
    $(".subRegister").unbind('click').click(function(){
    	var userEmail = $("#emailInput2").val();
    	var userPassword = $("#pwdInput2").val();
		 $.getJSON('RegisterServlet',
				 {Email:userEmail,password:userPassword},
				 function(result){
					 var user = eval(result.user);
					 alert("恭喜"+user.userName+"登录成功");
					 $("#LARid").css({
						 "display":"none"
					 });
					 $(".user-li_5").css({
							 "display":"none"
					 		});
					 
					 $(".user-li_6").css({
						 "display":"none"
				 		});
					 
				 });
	
	});


    //��ʾ����
    $('.user_email').hover(function(){
        $('.tip2').fadeIn();
        $('.tip2').text($('.user_email').attr('data-title'));
    });

    //��ȡ���λ��
    $('.user_email').mousemove(function(e){
        var top = e.pageY+15;
        var left = e.pageX+20; //ʹ�����ֿ���ʾ���������·�
        $('.tip2').css({
            'top' : top + 'px',
            'left': left+ 'px'
        });
    });


    //��������
    $('.user_email').mouseout(function(){
        $('.tip2').hide();
    });



});




    $(document).ready(function(){
        //����4
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
            // ����Ұ�ť��ʱ����Ҫ��ʾ��ǰͼƬ�ĺ�һ�ţ�����slideIndexֵҪ����1
            slideindex4++;
            var animateLength = slideindex4 * 275 + "px";
            $(".container4list").animate({"left":animateLength},"slow")  });

        //����5
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
            // ����Ұ�ť��ʱ����Ҫ��ʾ��ǰͼƬ�ĺ�һ�ţ�����slideIndexֵҪ����1
            slideindex5++;
            var animateLength = slideindex5 * 550 + "px";
            $(".container5list").animate({"left":animateLength},"slow")  });

        $(".container6 ul li p").css("color","#006BBc");

        //����7
        $(".tab_menu li").click(function(){
            //��ȡ��ǰԪ���±�
            var _index = $(this).index();
            //��ʾ��ǰ������������
            $(".tab_box div").eq(_index).show().siblings().hide();
            $(this).addClass("change").siblings().removeClass("change");
        });
        //����8
        $(".tab_menu8 li").click(function(){
            //��ȡ��ǰԪ���±�
            var _index8 = $(this).index();
            //��ʾ��ǰ������������
            $(".tab_box8 div").eq(_index8).show().siblings().hide();
            $(this).addClass("change").siblings().removeClass("change");
        });

        //����9
        $(".tab_menu9 li").click(function(){
            var _index9 = $(this).index();
            $(".tab_box9 div").eq(_index9).show().siblings().hide();
            $(this).addClass("change").siblings().remove("change");
        });
    });

