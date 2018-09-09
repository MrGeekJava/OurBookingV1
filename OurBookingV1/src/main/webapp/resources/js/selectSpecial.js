$(document).ready(function(){
	$("#selectSpecialBtn").click(function(){
		var city = $("#destinaction").val();
		var inTime = $(".datein").val();
		var leaveTime = $(".dateout").val();
		var adultNum = $("#adults").text();
		var childNum = $("#children").text();
		var roomNum = $("#rooms").text();
		alert(city+","+inTime+","+leaveTime+","+adultNum+","+childNum+","+roomNum);
	});
});