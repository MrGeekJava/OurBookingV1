/**
 * 订单显示模块
 */
$(document).ready(function(){
	//OrderPay.jsp获取cookie表单的值
//	$(".USER_NAME").text($.cookie("Order_User_Name"));  //订单联系人
//	$(".CONTACT_NUM").text($.cookie("ORDER_CONTACT_NUM"));	//订单联系人号码
//	$(".IN_DATE").text($.cookie("orderRoomin"));//入住日期
//	$(".OUT_DATE").text($.cookie("orderRoomout"));//退房日期
//	var outday =$.cookie("orderRoomout");
//	var inday = $.cookie("orderRoomin");
//	var allday =parseInt(outday.split("月")[1].split("日")[0]) - parseInt(inday.split("月")[1].split("日")[0]);	
//	$(".ORDER_Allday").text(allday+"天");	//订单总天数
//	$(".ROOM_TYPE").text($.cookie("orderRoomType"));//房间类型	
//	$(".ROOM_NUM").text($.cookie("orderRoomnum"));//房间类型	
//	$(".ORDER_MONEY").text($.cookie("orderprices")+"元");//订单总金额	 
//	$(".ROOM_PRICE").text($.cookie("orderPrice")+"元");//房间单价	
//	$(".ORDER_TIME").text($.cookie("ORDER_Time"));//订单时间
//	$(".ORDER_EMAIL").text($.cookie("Order_User_Email"));//订单邮箱
//	$(".order_yearsindate").text(inday);//年月日 
//	var = 
	$(".USER_NAME>input").attr("value",$.cookie("Order_User_Name"));  //订单联系人
	$(".CONTACT_NUM>input").attr("value",$.cookie("ORDER_CONTACT_NUM"));	//订单联系人号码
	$(".IN_DATE>input").attr("value",$.cookie("orderRoomin"));//入住日期
	$(".OUT_DATE>input").attr("value",$.cookie("orderRoomout"));//退房日期
	var outday =$.cookie("orderRoomout");
	var inday = $.cookie("orderRoomin");
	var allday =parseInt(outday.split("月")[1].split("日")[0]) - parseInt(inday.split("月")[1].split("日")[0]);	
	$(".ORDER_Allday>input").attr("value",allday+"天");	//订单总天数
	$(".ROOM_TYPE>input").attr("value",$.cookie("orderRoomType"));//房间类型	
	$(".ROOM_NUM>input").attr("value",$.cookie("orderRoomnum"));//房间类型	
	$(".ORDER_MONEY>input").attr("value",$.cookie("orderprices")+"元");//订单总金额	 
	$(".ROOM_PRICE>input").attr("value",$.cookie("orderPrice")+"元");//房间单价	
	$(".ORDER_TIME>input").attr("value",$.cookie("ORDER_Time"));//订单时间
	$(".ORDER_EMAIL>input").attr("value",$.cookie("Order_User_Email"));//订单邮箱
	$(".order_yearsindate>input").attr("value",inday);//年月日 
	
	
});
