//    ****************菜单选项卡***************
function openModel(evt, modelName) {
    var i, model, modelLinks;
    model = document.getElementsByClassName("Model ");
    for (i = 0; i < model.length; i++) {
        model[i].style.display = "none";
    }
    modelLinks = document.getElementsByClassName("BarLi");
    for (i = 0; i < modelLinks.length; i++) {
        modelLinks[i].className = modelLinks[i].className.replace("active", "");
    }
    document.getElementById(modelName).style.display = "block";
    evt.currentTarget.className += "active";
}
$(document).ready(function(){


////    *****************个人中心****************
////        设置首个内容上浮效果
    $(".first-info-con-a").mouseover(function (){
        $(this).css({"background-color":"#0077CC"});
        $(this).children(".first-info-con-icon").css({"margin-top":"30px"});
        $(this).children(".first-info-con-p1").css({"margin-top":"-5px","color":"white"});
        $(this).children(".first-info-con-p2").css({"margin-top":"-10px","color":"white"});
    });

    $(".first-info-con-a").mouseleave(function (){
        $(this).css({"background-color":"white"});
        $(this).children(".first-info-con-icon").css({"margin-top":"40px"});
        $(this).children(".first-info-con-p1").css({"margin-top":"0px","color":"black"});
        $(this).children(".first-info-con-p2").css({"margin-top":"0px","color":"black"});
    });

////    *******************设置*****************
////        设置选项卡：左菜单的固定
    $(window).bind("scroll", function () {
        var height = $(this).scrollTop(); 		// 当前窗口的滚动距离
        var top;
        if (height >= 140) {
            $(".InstallBar").css({"top": "-20px"});
        } else {
            top = (140 - height).toString() + 'px';
            $(".InstallBar").css({"top": top});
        }
    });

////        动态插入生日日期

    for(var i=1; i<=31; i++){
        $("#select_day").append("<option value='" + i + "'>" + i +"</option>");
    }
    for(var i=1; i<=12; i++){
        $("#select_month").append("<option value='" + i + "月'>" + i +"月</option>");
    }
    for(var i=2018; i>=1906; i--){
        $("#select_year").append("<option value='" + i + "'>" + i +"</option>");
    }

////    修改家庭地址按钮

    $("#changAdBtn").click(function(){
        $("#showAddress").css({"display":"none"});
        $(this).css({"display":"none"});
        $(".second_Ad_card").css({"display":"block"});
    });

    $("a[name='save']").click(function(){
        var country = $("#country").find("option:selected").text();
        var city = $("#city").val();
        var address = $("#address").val();
        var postal = $("#postal").val();
        $("#showAddress").html(address + "," + postal + "," + city + "," + country);
        $("a[name='exit']").click();
    });

    $("a[name='exit']").click(function(){
        $("#showAddress").css({"display":"inline-block"});
        $("#changAdBtn").css({"display":"block"});
        $(".second_Ad_card").css({"display":"none"});
    });

//    添加必要设施按钮

    $("#addFacility").click(function(){
        $("#facilities").css({"display":"none"});
        $(this).css({"display":"none"});
        $(".four_setFacility").css({"display":"block"});
    });

    $(".four_button-a[name='save']").click(function(){
        var isc = "";
        $(".four_row_facility_model input:checked").each(function(){      //遍历全部checkbox
            isc += $(this).val() + ",";              //获取所有checkbox的值
        });
        $("#facilities").html(isc);
        $(".four_button-a[name='exit']").click();
    });

    $(".four_button-a[name='exit']").click(function(){
        $("#facilities").css({"display":"inline-block"});
        $("#addFacility").css({"display":"block"});
        $(".four_setFacility").css({"display":"none"});
    });
//  修改头像
    $(".first_row_setHeadImg").click(function(){
       $(".changeHeadImg").css({"display":"block"});
    });
    $(".closeImg").click(function(){
        $(".changeHeadImg").css({"display":"none"});
    });
});


var result=document.getElementById("img-vessel");
var file=document.getElementById("imgfile");

//判断浏览器是否支持FileReader接口
if(typeof FileReader == 'undefined'){
    //使选择控件不可操作
    file.setAttribute("disabled","disabled");
}

function readAsDataURL(){
    //检验是否为图像文件
    var file = document.getElementById("imgfile").files[0];
    if(!/image\/\w+/.test(file.type)){
        alert("抱歉，只支持图片类型哦！");
        return false;
    }
    var reader = new FileReader();
    //将文件以Data URL形式读入页面
    reader.readAsDataURL(file);
    reader.onload=function(e){
        var result=document.getElementById("img-vessel");
        //显示文件
        document.getElementById("aaa").innerHTML=this.result;
        result.innerHTML='<img src="'+this.result+'" />';
    }
}


