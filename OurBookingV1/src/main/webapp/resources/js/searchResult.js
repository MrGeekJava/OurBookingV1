//点击右上角地图就浮现地图搜索模块
$(document).ready(function () {
    $(".rightBox_mapSearch").click(function () {
        $(".Map-Background").show();
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