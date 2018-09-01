/**
 * Created by Nier on 2018/8/8.
 */
$(document).ready(function() {
	
    $("#hide_i").click(function(){
       $("#container_holiday").hide("show");
    });    
  //处理注册
    
    $("#sub-userRegister").click(function(){
    	var userEmail = $("#emailInput2").val();
    	var userPassword = $("#pwdInput2").val();
alert("1");
		 $.getJSON('RegisterServlet',
				 {Email:userEmail,password:userPassword},
				 function(result){
					 var user = eval(result.user);
					 alert(user.userName);
					 $("#LARid").css({
						 "display":"none"
					 });
					 $(".user-li_5").css({
							 "display":"none"
					 		});
					 
					 $(".user-li_6").css({
						 "display":"none"
				 		});
					 
				 }
				 
				 );
	
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

