
//点击右上角地图就浮现地图搜索模块
$(document).ready(function () {
    $(".rightBox_mapSearch").click(function () {
        $(".Map-Background").show();
        loadMap();
    });
})

//点击左下角地图就浮现地图搜索模块
$(document).ready(function () {
    $(".map_search").click(function () {
        $(".Map-Background").show();
    });
})

//点击显示在地图上的链接就浮现地图模块

$(document).ready(function () {
    $(".map_a").click(function () {
        $(".Map-Background").show();
    });
})

$(document).ready(function(){
	
	 var strCookie = document.cookie;
	 var serchAdress = null;
     var arrCookie = strCookie.split("; ");
     for(var i = 0; i < arrCookie.length; i++){
         var arr = arrCookie[i].split("=");
         if("inputAdress" == arr[0]){
//             alert( arr[1]);
             searchAdress = arr[1];
         }
     }

     
//     alert(searchAdress);
		$.post('../SearchResultServlet',
				{searchadress:searchAdress},
				function(result){
					
					

					var jsonObj = $.parseJSON(result)
//					alert("llllllooo");
					for (var i in jsonObj) {
						var src = "../resources/res/images/searchResult/serchResult1.jpg";
						var hotelId = Number( jsonObj[i].hotelId);
						var hotelName = jsonObj[i].hotelName;
						var hotelType = jsonObj[i].hotelType;
						var hotelAdress = jsonObj[i].hotelAdress;
						var hotelPer = (jsonObj[i].hotelPer).substring(0,80);
						var roomMin = Number(jsonObj[i].roomMin);
						var evaSum = Number(jsonObj[i].evaSum);
						var sumScore = Number(jsonObj[i].sumScore);
						var userName = jsonObj[i].userName;
						var userCountry = jsonObj[i].userCountry;
						var commentWord = (jsonObj[i].commentWord).substring(0,40);
						var hotelArea = jsonObj[i].hotelArea;
						var hotelDowntown = jsonObj[i].hotelDowntown;
						var spanIcon = "";
						var point = "";
						var mapa = "";
						var remark = "";
						if(userName != ""){
							spanIcon = new String("&#9787;");
							point = new String(",");
						}
						if(hotelPer != ""){
							hotelPer += "..."
						}
						
						if(commentWord != ""){
							commentWord = '"'+commentWord+'"'+'...';
							
						}else{
							commentWord = "该酒店暂无评论！"
						}
						var hotelTypePoint = new String();;
						//酒店类型
						if("尊贵型" == hotelType){
							hotelTypePoint = "&#9679;&#9679;&#9679;&#9679;&#9679;";
							
						}else if("豪华型" == hotelType){
							hotelTypePoint = "&#9679;&#9679;&#9679;&#9679;";
						}else if("舒适型" == hotelType){
							hotelTypePoint = "&#9679;&#9679;&#9679;";
						}else if("经济型" == hotelType){
							hotelTypePoint = "&#9679;&#9679;";
						}else if("普通型" == hotelType){
							hotelTypePoint = "&#9679;";
						}
						
						mapa = hotelArea+","+hotelDowntown;
						
						if(sumScore >= 8.6){
							remark = "极好";
						}else if(sumScore >= 8.0 && sumScore < 8.6){
							remark = "很好";
						}else if(sumScore >= 7 && sumScore < 8){
							remark = "可以";
						}else{
							remark = "一般";
						}
						
						//动态加载
						$(".rightBox_containers").prepend(
								
								'<div class="search_hotel">'+
								'<img src=" '+src+' " class="search_hotel_pic">'+
								'<div class="search_hotel_message">'+
								' <div class="shm_left">'+
								'<p class="hotel_name">'+hotelName+'<span class="hotel_type">'+hotelType+'</span><span class="hotel_type_point">'+hotelTypePoint+'</span></span></p>'+
								'<p class="look_map"><span class="look_map_icon">&#9829;</span><a href="#" class="map_a">'+mapa+'-显示在地图上</a><span class="distance_icon">&#9808;</span><span class="distance">(离中心地区11km)</span></p>'+
								'<div class="hotel_desc">'+hotelPer+'</div>'+
								'</div>'+
								' <div class="shm_right">'+
								' <span class="shm_right_text">'+remark+'</span>'+
								' <span class="shm_right_subtext">'+evaSum+'条住客点评</span>'+
								'<span class="score">'+sumScore+'</span>'+
								' <span class="shm_right_scoresubtext">住客至爱</span>'+
								' <button class="show_price ">'+roomMin+'</button>'+
								'</div>'+
								'<div class="clear"></div>'+
								'  <div class="shm_buttom">'+
								'<p class="shm_buttom_text"><a href="#">'+commentWord+'</a></p>'+
								'<p class="shm_buttom_submsg"><span class="shm_buttom_submsg_icon">'+spanIcon+'</span><i>'+userName+'</i><span class="county">'+point+' '+userCountry+'</span></p>'+
								'</div>'+
								'</div>'+
								' </div>'
						)

					}
//					alert(typeof arr);
//					console.log(arr);
				}
				
		);
})


$(document).ready(function(){
	$(".search_container_four").click(function(){
		var searchAdress = $(".search_container_one_input").val();
		
		
		//用JSON传输数据,中国,广东省,广州市
		$.post('SearchResultServlet',
				{searchadress:searchAdress},
				function(result){
					
					window.location.href="/OurBookingV1/view/searchResult.jsp";

					var jsonObj = $.parseJSON(result)

					for (var i in jsonObj) {
						var src = "../resources/res/images/searchResult/serchResult1.jpg";
						var hotelName = jsonObj[i].hotelName;
						var hotelType = jsonObj[i].hotelType;
						var hotelAdress = jsonObj[i].hotelAdress;
						var hotelPer = (jsonObj[i].hotelPer).substring(0,30);
						var roomMin = Number(jsonObj[i].roomMin);
						var evaSum = Number(jsonObj[i].evaSum);
						var sumScore = Number(jsonObj[i].sumScore);
						alert(sumScore);

						//动态加载
						$(".rightBox_containers").append(
								
								'<div class="search_hotel">'+
								'<img src=" '+src+' " class="search_hotel_pic">'+
								'<div class="search_hotel_message">'+
								' <div class="shm_left">'+
								'<p class="hotel_name">'+hotelName+'<span class="hotel_type">'+hotelType+'</span><span class="hotel_type_point">&#9679;&#9679;&#9679;&#9679;&#9679;</span></span></p>'+
								'<p class="look_map"><span class="look_map_icon">&#9829;</span><a href="#" class="map_a">澄江县-显示在地图上</a><span class="distance_icon">&#9808;</span><span class="distance">(离中心地区11km)</span></p>'+
								'<div class="hotel_desc">'+hotelPer+'</div>'+
								'</div>'+
								' <div class="shm_right">'+
								' <span class="shm_right_text">很棒</span>'+
								' <span class="shm_right_subtext">'+evaSum+'条住客点评</span>'+
								'<span class="score">'+sumScore+'</span>'+
								' <span class="shm_right_scoresubtext">住客至爱</span>'+
								' <button class="show_price ">'+roomMin+'</button>'+
								'</div>'+
								'<div class="clear"></div>'+
								'  <div class="shm_buttom">'+
								'<p class="shm_buttom_text"><a href="#">"地理位置不错，位于万科打造的国际度假村区内，紧靠湖边，位于万科打造的国际度假村区内，紧靠湖边..."</a></p>'+
								'<p class="shm_buttom_submsg"><span class="shm_buttom_submsg_icon">&#9787;</span><i>束韦</i><span class="county">，中国</span></p>'+
								'</div>'+
								'</div>'+
								' </div>'
						)

					}
					alert(typeof arr);
//					console.log(arr);
				}
				
		);
	});
	
	
//	$.function(result){
//		
//	}


})