/**
 * Created by Mr.Z on 2018/8/11.
 */

// *********************************************************
// 滑动第二个筛选栏
$(document).ready(function () {
    var mapWidth = $(".Map-Container").outerWidth() - $("#select1").outerWidth() - $("#select2").outerWidth() - 21;
    $("#container").css("width", mapWidth);

    $("#slide-btn").click(function () {
        if ($("#select2").css("display") == 'none') {
            mapWidth = $(".Map-Container").outerWidth() - $("#select1").outerWidth() - $("#select2").outerWidth() - 21;
            $("#container").animate({width: mapWidth}, 350);
            $("#select2").animate({width: 'toggle'}, 350);
            $("#slide-btn").html('<div class="iconfont icon-sanjiao-copy"></div>');
        } else {
            mapWidth = $(".Map-Container").outerWidth() - $("#select1").outerWidth() - 21;
            $("#select2").animate({width: 'toggle'}, 350);
            $("#container").animate({width: mapWidth}, 350);
            $("#slide-btn").html('<div class="iconfont icon-sanjiao-copy-copy"></div>');
        }
    })
})

//选取第一个筛选栏信息
$(document).ready(function () {
    $(".nar-search>ul>li").click(function () {
        var cbx = $(this).find("input[type='checkbox']");
        if (cbx.is(":checked")) {
            $(this).css({"background-color": "#077812", "color": "white"});
        } else {
            $(this).css({"background-color": "#F9F9F9", "color": "#0077CC"});
        }
    });
})

// 下拉筛选条件
$(document).ready(function () {
    $("#select3").click(function () {
        $(this).css({"box-shadow": "0px 0px 6px #0077CC"});
        $(".dropdown-select").toggle();
    });
});
// 点击下拉菜单意外区域隐藏
window.onclick = function (event) {
    if (!event.target.matches('#select3')) {
        document.getElementById("hotel-sort").style.display = "none";
        document.getElementById("select3").style.boxShadow = "none";
    }
};
// 选择筛选条件
$(document).ready(function () {
    $(".dropdown-select a").click(function () {
        $("#selected-info").html($(".dropdown-select a").html());
    });
    $(".dropdown-select a:nth-child(2)").click(function () {
        $("#selected-info").html($(".dropdown-select a:nth-child(2)").html());
    });
    $(".dropdown-select a:nth-child(3)").click(function () {
        $("#selected-info").html($(".dropdown-select a:nth-child(3)").html());
    });
    $(".dropdown-select a:nth-child(4)").click(function () {
        $("#selected-info").html($(".dropdown-select a:nth-child(4)").html());
    });
});

// 关闭按钮
$(document).ready(function () {
    $(".close").click(function () {
        $(".Map-Background").hide();
    });
})

// 动态筛选酒店信息
$(document).ready(function () {
    // 数据处理（多个数据用for循环，传进来一个数组）
    var src = "../res/images/map/卓美亚喜马拉雅酒店.jpg";
    var hotelName = "卓美亚喜马拉雅酒店";
    var zans = '<div class="iconfont icon-start zan"></div>';
    for (var i = 0; i < 2; i++) {
        zans += '<div class="iconfont icon-start zan"></div>';
    }
    var grade = 7.5;
    if (grade > 9.0) {
        grade = grade.toString() + " 好极了";
    } else if (grade > 8.0) {
        grade = grade.toString() + " 非常好";
    } else if (grade > 7.0) {
        grade = grade.toString() + " 好";
    } else if (grade > 6.0) {
        grade = grade.toString() + " 评分";
    } else {
        grade = "暂无评分";
    }
    var evaluate = 30;
    var price = 2200;
    if (price >= 1000) {
        price = parseInt(price / 1000) + ',' + (price - (parseInt(price / 1000)));
    }

    // 动态添加
    $("#select2").append(
        '<a href="javascript:void(0)"><div class="hotel">' +
        '<div class="hotel-img">' +
        '<img src="' + src + '">' +
        '</div>' +
        '<div class="hotel-info">' +
        '<h3>' + hotelName + '</h3>' +
        '<div>' +
        zans +
        '<div class="iconfont icon-zan zan zan_1"></div>' +
        '</div>' +
        '<div class="grade">' + grade + '</div>' +
        '<div class="grade-num">' + evaluate + '条住客点评</div>' +
        '<div class="iconfont icon-rentouliangrense price"> ' + price + '元</div>' +
        '</div>' +
        '<div class="hotel-nar">' +
        '<div class="iconfont icon-sanjiao-copy-copy"></div>' +
        '</div>' +
        '</div></a>');
})

// 筛选栏里的hotel的hover事件
$(document).ready(function () {
    $(".hotel").hover(function () {
        $(this).children("div.hotel-info").find("h3").css({"color": "#FEBB02"});
        $(this).css({"background-color": "#F3F9FD"});
    })
    $(".hotel").mouseleave(function () {
        $(".hotel-info h3").css({"color": "#0077CC"});
        $(this).css({"background-color": "white"});
    })
})