//点击右上角地图就浮现地图搜索模块
$(document).ready(function () {
    $(".rightBox_mapSearch").click(function () {
        $(".Map-Background").show();
        selectHotels(0);
    });
})

//点击左下角地图就浮现地图搜索模块
$(document).ready(function () {
    $(".map_search").click(function () {
        $(".Map-Background").show();
        selectHotels(0);
    });
})

//点击显示在地图上的链接就浮现地图模块

$(document).ready(function () {
    $(".map_a").click(function () {
        $(".Map-Background").show();
    });
})

$(document).ready(function(){
	$(".search_container_four").click(function(){
		var searchAdress = $(".search_container_one_input").val();
		
		
		//用JSON传输数据,中国,广东省,广州市
		$.getJSON('SearchResultServlet',
				{searchadress:searchAdress},
				function(result){
					//在这里传回到前端页面：index.jsp
					
//					JSONObject json = new JSONObject();
//					json.put("hotelSearchReturn", hotelReturn);
//					out.print(json);
//					
//					var hotelSearch = new Array();
					
					
//					List集合转换成json代码 List list = new ArrayList(); list.add( "first" ); list.add( "second" ); 
//					JSONArray jsonArray2 = JSONArray.fromObject( list );
					
//					var hotelSearch = eval(result.hotelSearchRerturn);
					var jsonjs = JSON.parse(result);
					alert("进入这里");
//					alert(typeof result.hotelSearchRerturn);
					alert(typeof jsonjs);
				}
		);
	});
	
	
	
//	*******************
//	$(".subRegister").unbind('click').click(function(){
//    	var userEmail = $("#emailInput2").val();
//    	var userPassword = $("#pwdInput2").val();
//		 $.getJSON('RegisterServlet',
//				 {Email:userEmail,password:userPassword},
//				 function(result){
//					 var user = eval(result.user);
//					 alert("恭喜"+user.userName+"登录成功");
//					 alert("进入这里");
//					 $("#LARid").css({
//						 "display":"none"
//					 });
//					 $(".user-li_5").css({
//							 "display":"none"
//					 		});
//					 
//					 $(".user-li_6").css({
//						 "display":"none"
//				 		});
//					 
//				 });
//	
//	});

})