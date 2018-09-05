<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>searchResult</title>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="../resources/css/NavBar.css">
    <link rel="stylesheet" href="../resources/css/MapStyle.css">
    <link rel="stylesheet" href="../resources/css/searchCard.css">
    <link rel="stylesheet" href="../resources/css/searchResult.css">
    <link href="../resources/res/icon/index_icon/iconfont.css" rel="stylesheet">
    <link href="../resources/res/icon/personifm/iconfont.css" rel="stylesheet">
    
    <script src="../resources/js/Map.js"></script>
    <script src="../resources/js/NavBar.js"></script>
    <script src="../resources/js/index_container.js"></script>
    <script src="../resources/js/searchCard.js"></script>
    <script src="//at.alicdn.com/t/font_788386_e8anycfk24u.js" ></script>
	<script src="../resources/js/searchResult.js"></script>
   
    <!--map-->
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="../resources/res/icon/map/iconfont.css">
    <link rel="stylesheet" type="text/css" href="../resources/css/MapStyle.css">
    <!-- 引用百度地图API文件 -->
    <script type="text/javascript" src="https://api.map.baidu.com/api?v=2.0&ak=1XXZ1hp42Ef2qHx8AheU08zIhhU7Sfe0"></script>

</head>
<body>
<div id="registertip" class="index_tip"></div>
<div id="none_img_id" >
    <img src="../resources/res/images/wechat_img.png" id="none_img_id2" >
</div>
<div class="top">
    <div class="head">
        <img id="Booking_logo" class="logo" src="../resources/res/images/logo.png">
        <div class="user-bar">
            <ul class="user-ul">
                <li class="user-li_1" >
                    <a id="mon_tex" href="javascript:void(0)"  class="user-tex" data-title="选择您使用的货币">元</a>
                    <div class="mon_box" id="mon_id_box">
                        <div class="mon_trigon"></div>
                        <h3>常用货币</h3>
                        <ul class="mon_ul">
                            <li class="mon_li_other"><span>元</span><small>人民币</small></li>
                            <li class="mon_li"><span>€£$</span><small>住宿地使用的货币</small></li>
                            <li class="mon_li"><span>US$</span><small>美元</small></li>
                            <li class="mon_li"><span>€</span><small>欧元</small></li>
                            <li class="mon_li"><span>TWD</span><small>新台币</small></li>
                            <li class="mon_li"><span>HK$</span><small>港币</small></li>
                            <li class="mon_li"><span>£</span><small>英镑</small></li>
                        </ul>

                        <h3>所有货币</h3>
                        <ul class="mon_ul_2">
                            <li class="mon_li"><span>UAH</span><small>乌克兰赫夫米</small></li>
                            <li class="mon_li_other"><span>元</span><small>人民币</small></li>
                            <li class="mon_li"><span>₪</span><small>以色列新谢克尔</small></li>
                            <li class="mon_li"><span>RUB</span><small>俄罗斯卢布</small></li>
                            <li class="mon_li"><span>BGN</span><small>保加利亚新列弗</small></li>
                            <li class="mon_li"><span>CAD</span><small>加元</small></li>
                            <li class="mon_li"><span>HUF</span><small>匈牙利福林</small></li>
                            <li class="mon_li"><span>ZAR</span><small>南非兰特</small></li>
                            <li class="mon_li"><span>QAR</span><small>卡塔尔里亚尔</small></li>
                            <li class="mon_li"><span>Rp</span><small>印尼卢比</small></li>
                            <li class="mon_li"><span>Rs.</span><small>印度卢比</small></li>
                            <li class="mon_li"><span>KZT</span><small>哈萨克斯坦坚戈</small></li>
                            <li class="mon_li"><span>EGP</span><small>埃及镑</small></li>
                            <li class="mon_li"><span>MXN</span><small>墨西哥比索</small></li>
                            <li class="mon_li"><span>BHD</span><small>巴林第纳尔</small></li>
                            <li class="mon_li"><span>R$</span><small>巴西雷阿尔</small></li>
                            <li class="mon_li"><span>NOK</span><small>挪威克朗</small></li>
                            <li class="mon_li"><span>Kč</span><small>捷克克朗</small></li>


                            <li class="mon_li"><span>MDL</span><small>摩尔多瓦列伊</small></li>
                            <li class="mon_li"><span>FJD</span><small>斐济元</small></li>
                            <li class="mon_li"><span>S$</span><small>新元</small></li>
                            <li class="mon_li"><span>TWD</span><small>新台币</small></li>
                            <li class="mon_li"><span>TL</span><small>新土耳其里拉</small></li>
                            <li class="mon_li"><span>NZD</span><small>新西兰元</small></li>
                            <li class="mon_li"><span>¥</span><small>智利比索</small></li>
                            <li class="mon_li"><span>CL$</span><small>墨西哥比索</small></li>
                            <li class="mon_li"><span>GEL</span><small>格鲁吉亚拉里</small></li>
                            <li class="mon_li"><span>€</span><small>欧元</small></li>
                            <li class="mon_li"><span>SAR</span><small>沙特阿拉伯里亚尔</small></li>
                            <li class="mon_li"><span>zł</span><small>波兰兹罗提</small></li>

                            <li class="mon_li"><span>THB</span><small>泰铢</small></li>
                            <li class="mon_li"><span>HK$</span><small>港币</small></li>
                            <li class="mon_li"><span>AUD</span><small>澳元</small></li>
                            <li class="mon_li"><span>SEK</span><small>瑞典克朗</small></li>
                            <li class="mon_li"><span>CHF</span><small>科威特第纳尔</small></li>
                            <li class="mon_li"><span>JOD</span><small>约旦第纳尔</small></li>
                            <li class="mon_li"><span>NAD</span><small>纳米比亚元</small></li>
                            <li class="mon_li"><span>lei</span><small>罗马尼亚新列伊</small></li>
                            <li class="mon_li"><span>US$</span><small>美元</small></li>
                            <li class="mon_li"><span>£</span><small>英镑</small></li>
                            <li class="mon_li"><span>XOF</span><small>西非法郎</small></li>
                            <li class="mon_li"><span>AZN</span><small>阿塞拜疆新马纳特</small></li>

                            <li class="mon_li"><span>OMR</span><small>阿曼里亚尔</small></li>
                            <li class="mon_li"><span>AR$</span><small>阿根廷比索</small></li>
                            <li class="mon_li"><span>AED</span><small>阿联酋迪拉姆</small></li>
                            <li class="mon_li"><span>KRW</span><small>韩元</small></li>
                            <li class="mon_li"><span>MYR</span><small>马来西亚令吉</small></li>
                        </ul>
                    </div>
                </li>
                <li class="user-li_2">
                    <a href="javascript:void(0)" id="lang-i" class="user-tex" data-title="选择您使用的语言" >
                        <i class="iconfont icon-uk lang-i-cla"  ></i>
                    </a>

                    <div class="language_cla" id="language_id">
                        <div class="mon_trigon"></div>
                        <h3>中国的客人最常使用的语言</h3>
                        <ul class="ul_lang">
                            <li class="li_lang"><a href="#"><i class="iconfont icon-jiantizhongwen"></i><span>简体中文</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-fantizhongwen"></i><span>繁体中文</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-Nederland"></i><span>Nederland</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-uk"></i><span>UK</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-US"></i><span>US</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-riben"></i><span>日本语</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-Deutsch-flag"></i><span>Deutsch</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-arrow-left"></i><span>arrow</span></a></li>
                            <li class="li_lang"><a href="#"><i class="iconfont icon-shang"></i><span>Shang</span></a></li>
                        </ul>

                    </div>
                </li>
                <li class="user-li_3">
                    <i class="iconfont icon-weixin " id="wechat-i" ></i>
                </li>
                <li class="user-li_4">
                    <a href="#" onclick="" class="user-btn-2">上线我的住宿</a>
                </li>
                <li class="user-li_5">
                    <a id="reg-btn" href="#" class="user-btn" data-title="成为会员，享受专属隐藏优惠">注册</a>
                </li>
                <li class="user-li_6">
                    <a id="log-btn" href="#" class="user-btn" data-title="使用已存信息，预订更快捷">登录</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="top_deown">
    <div class="head_dowm">
        <ul class="nav_ul">
            <li class="nav_li_1"><a href="#">住宿</a></li>
            <li class="nav_li_2"><a href="#">机票</a></li>
            <li class="nav_li_2"><a href="#">租车</a></li>
            <li class="nav_li_3"><a href="#">机场出租车</a></li>

        </ul>
    </div>
</div>
</div>

    <!--luozhiyuan-->
    <div class="body_container">
        <div class="nav_bar">
            <ul class="nav_bar_ul">
                <li><a href="#">首页</a></li>
                <li>&#8250;</li>
                <li><a href="#">中国</a></li>
                <li>&#8250;</li>
                <li><a href="#">云南</a></li>
                <li>&#8250;</li>
                <li><a href="#">澄江县</a></li>
                <li>&#8250;</li>
                <li><a id="searchResult">搜索结果</a></li>
            </ul>
        </div>
        <div class="clear"></div>
        <div class="leftBox">
            <div class="clear"></div>
            <div class="special_search">
                <div class="leftcontainer">
			        <div class="three">
			            <div class="header">特价搜不停</div>
			            <span class="span1">目的地/住宿名称:</span>
			            <input type="text" class="text1"  placeholder="广州">
			            <span class="span2">入住日期:</span>
			
			            <div class="indate">
			                <svg class="icon icon-rili" aria-hidden="true">
			                    <use xlink:href="#icon-rili"></use>
			                </svg>
			                <input class="datein" type="text"  placeholder="入住日期">
			                <svg class="icon icon-iconfonticonfonti2" aria-hidden="true">
			                    <use xlink:href="#icon-iconfonticonfonti2"></use>
			                </svg>
			            </div>
			            <!--选入住的日期-->
			            <div class="calenderin">
			                <div class="header">入住日期
			                    <svg class="icon icon-cha2" aria-hidden="true">
			                        <use xlink:href="#icon-cha2"></use>
			                    </svg>
			                </div>
			                <div class="cut"></div>
			                <div class="bodyleft">
			                    <h3></h3>
			                    <div class="pre"><</div>
			                    <ul>
			                        <li>周日</li><li>周一</li><li>周二</li><li>周三</li><li>周四</li><li>周五</li><li>周六</li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                    </ul>
			                </div>
			                <div class="bodyright">
			                    <h3></h3>
			                    <div class="next">></div>
			                    <ul>
			                        <li>周日</li><li>周一</li><li>周二</li><li>周三</li><li>周四</li><li>周五</li><li>周六</li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                    </ul>
			                </div>
			            </div>
			
			            <span class="span3">退房日期:</span>
			            <div class="outdate">
			                <svg class="icon icon-rili" aria-hidden="true">
			                    <use xlink:href="#icon-rili"></use>
			                </svg>
			                <input class="dateout" type="text"  placeholder="退房日期">
			                <svg class="icon icon-iconfonticonfonti2" aria-hidden="true">
			                    <use xlink:href="#icon-iconfonticonfonti2"></use>
			                </svg>
			            </div>
			
			            <div class="calenderout">
			                <div class="header">退房日期
			                    <svg class="icon icon-cha2" aria-hidden="true">
			                        <use xlink:href="#icon-cha2"></use>
			                    </svg>
			                </div>
			                <div class="cut"></div>
			                <div class="bodyleft">
			                    <h3></h3>
			                    <div class="pre"><</div>
			                    <ul>
			                        <li>周日</li><li>周一</li><li>周二</li><li>周三</li><li>周四</li><li>周五</li><li>周六</li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                    </ul>
			                </div>
			                <div class="bodyright">
			                    <h3></h3>
			                    <div class="next">></div>
			                    <ul>
			                        <li>周日</li><li>周一</li><li>周二</li><li>周三</li><li>周四</li><li>周五</li><li>周六</li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                        <li></li><li></li><li></li><li></li><li></li><li></li><li></li>
			                    </ul>
			                </div>
			            </div>
			
			            <div class="adultnum">
			                <span>2位成人</span>
			                <svg class="icon icon-iconfonticonfonti2" aria-hidden="true">
			                    <use xlink:href="#icon-iconfonticonfonti2"></use>
			                </svg>
			            </div>
			
			            <div class="adultnumchoose">
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			            </div>
			
			            <div class="childnum">
			                <span>两位儿童</span>
			                <svg class="icon icon-iconfonticonfonti2" aria-hidden="true">
			                    <use xlink:href="#icon-iconfonticonfonti2"></use>
			                </svg>
			            </div>
			            <div class="childnumchoose">
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			            </div>
			
			            <div class="roomnum">
			                <span>两间房</span>
			                <svg class="icon icon-iconfonticonfonti2" aria-hidden="true">
			                    <use xlink:href="#icon-iconfonticonfonti2"></use>
			                </svg>
			            </div>
			
			            <div class="roomnumchoose">
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			                <li></li><li></li><li></li><li></li><li></li><li></li>
			            </div>
			
			            <input type="checkbox" class="checkbox1"/>
			            <span class="span4">我是出差</span>
			            <svg class="icon icon-wenhao-fill" aria-hidden="true">
			                <use xlink:href="#icon-wenhao-fill"></use>
			            </svg>
			            <button>搜特价</button>
			        </div>
			    </div>
            </div>
            <div class="select1">
                <div class="nar-search-top">缩小搜索范围</div>

                <ul>
                    住宿评级 <!-- 固定 -->
                    <!--<li><label><input type="checkbox" name=""> <span class="cb_text">实惠型</span><span class="yellow_point">&#9679;</span><span>1</span></label></li>-->
                    <!--<li><label><input type="checkbox" name=""> <span class="cb_text">实惠型</span><span class="yellow_point">&#9679;</span><span>1</span></label></li>-->
                    <li><label><input type="checkbox" name=""> 实惠型<span>1</span></label></li>
                    <li><label><input type="checkbox" name=""> 实惠型<span>1</span></label></li>

                    <li><label><input type="checkbox" name=""> 实惠型<span>1</span></label></li>
                    <li><label><input type="checkbox" name=""> 实惠型<span>1</span></label></li>
                    <li><label><input type="checkbox" name=""> 实惠型<span>1</span></label></li>
                    <li><label><input type="checkbox" name=""> 实惠型<span>1</span></label></li>
                </ul>

                <ul>
                    热门筛选
                    <li><label><input type="checkbox" name="">免费无线网络连接<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">免费无线网络连接<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">免费无线网络连接<span>18</span></label></li>

                </ul>

                <ul>
                    休闲乐活
                    <li><label><input type="checkbox" name="">水上运动设施（酒店内部）<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">水上运动设施（酒店内部）<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">水上运动设施（酒店内部）<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">水上运动设施（酒店内部）<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">水上运动设施（酒店内部）<span>18</span></label></li>

                </ul>

                <ul>
                    24小时前台
                    <li><label><input type="checkbox" name="">7天24小时前台<span>18</span></label></li>

                </ul>
                <ul>
                    海滩
                    <li><label><input type="checkbox" name="">靠近海滩<span>18</span></label></li>

                </ul>
                <ul>
                    住宿类型
                    <li><label><input type="checkbox" name="">酒店<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">旅馆<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">度假村<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">别墅缩小搜索范围缩小搜索范围缩小搜索范围缩小搜索范围<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">酒店<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">旅馆<span>18</span></label></li>
                    <li><label><input type="checkbox" name="">度假村<span>18</span></label></li>
                </ul>
            </div>
            <div class="map_search">
                <svg class="icon icon-dizhi" aria-hidden="true">
                    <use xlink:href="#icon-dizhi"></use>
                </svg>
                <button>显示地图</button>


            </div>
        </div>
        <div class="rightBox">
            <div class="rightBox_top">
                <p class="address">澄江县：共19家住宿</p>
                <div class="rightBox_mapSearch">
                    <svg class="icon icon-dizhi" aria-hidden="true">
                        <use xlink:href="#icon-dizhi"></use>
                    </svg>
                    <p>地图浏览</p>
                </div>
            </div>
            <div class="rightBox_navBar">
                <ul>
                    <li id="rB_li1">热门推荐</li>
                    <li>价格从低到高</li>
                    <li>住宿等级</li>
                    <li>距离市中心</li>
                    <li>高点评分数及数量</li>
                    <li id="rB_li6">点评数量从高到低</li>
                </ul>
            </div>
            <div class="rightBox_containers">
            	
           
            
            
  
				
                <div class="rb_containers_bottom">
                    <div class="rb_containers_bottom_left">
                        <div class="rbcbl_words">在澄江县搜索出20家住宿.</div>
                    </div>
                    <div class="rb_containers_bottom_right">
                        <div class="rbcbr_words">未找到理想的酒店？</div>
                        <a>返回搜索页面。</a>
                    </div>
                    <div class="clear"></div>
                    <div class="rb_containers_bottom_buttom">
                        <span class="first">&#8249;</span>
                        <span class="second">1</span>
                        <span class="third">&#8250;</span>
                        <span class="forth">显示1-15</span>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <div class="clear"></div>
    <div class="buttom">
        <div class="buttom_top1_bg">
            <div class="buttom_top1">
            <div class="temp"></div>
            <div class="buttom_top1_content">

                <div class="buttom_top1_content_left">
                    <img src="../resources/res/images/searchResult/phone.png">
                    <h3>24小时客服助您安心出行</h3>
                    <p class="p1">订单有问题？我们来帮您！</p>
                    <div class="chinese">
                        <p class="p2">中文客服热线</p>
                        <p class="p3">常见问题</p>
                    </div>
                    <div class="clear"></div>
                    <div class="hits">
                        <a class="a1">点击了解更多客户帮忙</a>
                        <p class="p4">去<a class="a2">帮助中心</a>看看</p>
                    </div>
                </div>
                <div class="buttom_top1_content_right">
                    <h2 class="bar1">方便又省钱！</h2>
                    <div class="bar2">立即注册，即可获取优惠好价！</div>
                    <div class="emailandbtn">
                        <input type="email" class="to" placeholder="您的邮箱地址">
                        <button class="subscription">订阅！</button>
                    </div>
                    <label class="label1">
                        <input type="checkbox" class="get_address">
                        <p class="label_p">请同时给我发送Booking.com免费App下载链接</p>
                    </label>
                </div>
            </div>

        </div>
        </div>

        <div class="buttom_top2_bg">
            <div class="buttom_top2">
            <div class="buttom_top2_relbar"></div>
            <div class="online">上线我的住宿</div>
            <hr class="hrline" />
            <ul class="ul_mol">
                <li><a>平板电脑视图</a></li>
                <li><a>手机版视图</a></li>
                <li><a>您的账户</a></li>
                <li><a>在线修改订单</a></li>
                <li><a>联系客服</a></li>
                <li><a>成为分销合作伙伴</a></li>
                <li><a>Booking.com商旅服务</a></li>
                <li><a>关注Booking.com官方微信</a><img src="../resources/res/images/searchResult/wechat.png" class="wechat_logo"></li>
            </ul>
        </div>
        </div>
        <div class="buttom_top3">
            <ul>
                <li><a class="li_a_text">国家/地区</a></li>
                <li><a class="li_a_text">区域</a></li>
                <li><a class="li_a_text">城市</a></li>
                <li><a class="li_a_text">区</a></li>
                <li><a class="li_a_text">机场</a></li>
                <li><a class="li_a_text">酒店</a></li>
                <li><a class="li_a_text">周边地标/景点</a></li>

            </ul>

            <ul>
                <li><a class="li_a_text">度假屋</a></li>
                <li><a class="li_a_text">公寓</a></li>
                <li><a class="li_a_text">度假村</a></li>
                <li><a class="li_a_text">别墅</a></li>
                <li><a class="li_a_text">青旅</a></li>
                <li><a class="li_a_text">住宿加早餐旅馆</a></li>
                <li><a class="li_a_text">旅馆</a></li>

            </ul>

            <ul>
                <li><a class="li_a_text">全球独特住宿</a></li>
                <li><a class="li_a_text">客人点评</a></li>
                <li><a class="li_a_text">游记攻略</a></li>

            </ul>

            <ul>
                <li><a class="li_a_text">租车服务</a></li>
                <li><a class="li_a_text">订机票</a></li>
                <li><a class="li_a_text">订餐订位</a></li>
                <li><a class="li_a_text">Booking.com旅游代理机构中心</a></li>

            </ul>
            <ul>
                <li><a class="li_a_text">关于Booking.com</a></li>
                <li><a class="li_a_text">提供网站</a></li>
                <li><a class="li_a_text">客服帮助</a></li>
                <li><a class="li_a_text">酒店自助平台</a></li>
                <li><a class="li_a_text">Careers</a></li>
                <li><a class="li_a_text">新闻中心</a></li>
                <li><a class="li_a_text">投资者关系</a></li>
                <li><a class="li_a_text">相关条款</a></li>
                <li><a class="li_a_text">隐私和Cookie声明</a></li>
                <li><a class="li_a_text">其他问题查询</a></li>
                <li><a class="li_a_text">价格更放心</a></li>


            </ul>
        </div>

        <div class="buttom_top4">
            <p>Booking.com公司以荷兰阿姆斯特丹为总部，并由全球 <a class="li_a_text">70个国家及地区</a> 的 <a class="li_a_text">198个办公室</a> 提供支持。</p>
        </div>

        <div class="buttom_top5">
            <p class="login_background">登录后台</p>
        </div>

        <div class="buttom_top6">版权 © 1996–2018 Booking.com™. 版权所有.</div>

        <p class="buttom_top7">Booking.com隶属于Booking Holdings Inc.，该集团是全球领先的在线旅行及周边服务供应商。</p>


        <ul class="buttom_top8">
            <li><img src="../resources/res/images/searchResult/bookingcom.png"></li>
            <li><img src="../resources/res/images/searchResult/priceline.png"></li>
            <li><img src="../resources/res/images/searchResult/kayak.png"></li>
            <li><img src="../resources/res/images/searchResult/agodacom.png"></li>
            <li><img src="../resources/res/images/searchResult/rentilcors.png"></li>
            <li><img src="../resources/res/images/searchResult/opentable.png"></li>



        </ul>

        <div class="most_buttom"></div>
    </div>

    <!--zongxin-->

<!--<div class="map_bg">-->


<div class="Map-Background">
    <div class="Map-Container">
        <!-- 第一个筛选栏 -->
        <div id="select1">
            <div class="nar-search">
            <form onsubmit="return false" id="searchForm" action="#" method="post">
                <div class="nar-search-top">
                    缩小搜索范围
                    <button type="button" id="searchBtn">搜索酒店</button>
                </div>
                <ul>
                    您的预算 <!-- 固定 -->
                    <li><label><input type="checkbox" name="budget" value="B:0:390"/> 0元 - 390元（每晚）<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="budget" value="B:390:790"/> 390元 - 790元（每晚）<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="budget" value="B:790:1100"/> 790元 - 1,100元（每晚）<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="budget" value="B:1100:1500"/> 1,100元 - 1,500元（每晚）<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="budget" value="B:1500"/> 1,500元 +（每晚）<span>1234</span></label></li>
                </ul>
                <ul>
                    住宿评级 <!-- 固定 -->
                    <li><label><input type="checkbox" name="lavel" value="L:实惠型"> 实惠型
                        <i class="iconfont icon-start zan_2"></i>
                        <span>1234</span></label>
                    </li>
                    <li><label><input type="checkbox" name="lavel" value="L:经济型"> 经济型
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <span>1234</span></label>
                    </li>
                    <li><label><input type="checkbox" name="lavel" value="L:舒适型"> 舒适型
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <span>1234</span></label>
                    </li>
                    <li><label><input type="checkbox" name="lavel" value="L:豪华型"> 豪华型
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <span>1234</span></label>
                    </li>
                    <li><label><input type="checkbox" name="lavel" value="L:尊贵型"> 尊贵型
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <i class="iconfont icon-start zan_2"></i>
                        <span>1234</span></label>
                    </li>
                    <li><label><input type="checkbox" name="lavel" value="L:无评级"> 无评级<span>1234</span></label></li>
                </ul>
                <ul>
                    休闲乐活 <!-- 动态：按地区显示 -->
                    <li><label><input type="checkbox" name="relax" value="R:健身"> 健身中心<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="relax" value="R:按摩"> 按摩<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="relax" value="R:自行车"> 自行车租赁（额外收费）<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="relax" value="R:徒步活动"> 徒步活动<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="relax" value="R:游泳池"> 室内游泳池<span>1234</span></label></li>
                </ul>
                <ul>
                    住宿房量
                    <li><label><input type="checkbox" name="lastRoom" value="A:可预订"> 只显示可预定住宿</label></li>
                </ul>
                <ul>
                    折扣优惠
                    <li><label><input type="checkbox" name="discount" value="I:超值"> 今日超值好价<span>1234</span></label></li>
                </ul>
                <ul>
                    24小时前台
                    <li><label><input type="checkbox" name="desk" value="E:24小时前台"> 7天24小时前台<span>1234</span></label></li>
                </ul>
                <ul>
                    免费取消及更多
                    <li><label><input type="checkbox" name="free" value="F:免费取消"> 免费取消<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="free" value="F:预定无需信用卡"> 预定无需信用卡<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="free" value="F:无需预付"> 无需预付<span>1234</span></label></li>
                </ul>
                <ul>
                    餐点
                    <li><label><input type="checkbox" name="cook" value="C:含早餐"> 含早餐<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="cook" value="C:含早晚"> 包含早餐和晚餐<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="cook" value="C:不含早"> 不含早餐<span>1234</span></label></li>
                </ul>
                <ul>
                    住处类型
                    <li><label><input type="checkbox" name="type" value="T:酒店"> 酒店<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="type" value="T:青旅"> 青旅<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="type" value="T:民宿"> 民宿<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="type" value="T:公寓"> 公寓<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="type" value="T:旅馆"> 旅馆<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="type" value="T:别墅"> 别墅<span>1234</span></label></li>
<!--                      <a href="javascript:void(0)">显示所有12项</a>				-->
                </ul>
                <ul>
                    评分
                    <li><label><input type="checkbox" name="rating" value="G:9"> 好极了： 9分以上<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="rating" value="G:8"> 非常好： 8分以上<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="rating" value="G:7"> 好： 7分以上<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="rating" value="G:6"> 令人愉悦： 6分以上<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="rating" value="G:5"> 尚无评分<span>1234</span></label></li>
                </ul>
                <ul>
                    连锁酒店 
       <!--         <li><label><input type="checkbox"> 全季酒店<span>1234</span></label></li>			-->
                    <li><label><input type="checkbox" name="chain" value="H:如家快捷"> 如家快捷酒店<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="chain" value="H:如家精选"> 如家精选酒店<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="chain" value="H:格林联盟"> 格林联盟<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="chain" value="H:格林豪泰"> 格林豪泰酒店<span>1234</span></label></li>
                    <li><label><input type="checkbox" name="chain" value="H:汉庭连锁"> 汉庭连锁酒店<span>1234</span></label></li>
       <!--         <li><label><input type="checkbox"> 海友酒店<span>1234</span></label></li>			
                    <li><label><input type="checkbox"> 莫泰酒店<span>1234</span></label></li>		-->
                    <li><label><input type="checkbox" name="chain" value="H:7天连锁"> 铂涛集团7天连锁酒店<span>1234</span></label></li>
       <!--         <li><label><input type="checkbox"> 锦江之星<span>1234</span></label></li>		-->
                </ul>
            </form>
            </div>
        </div>
        <!-- 第二个筛选栏 -->
        <div id="select2">
            <div class="sort-order">
                <div class="select-way">排序方式</div>
                <div id="select3">
                    <div id="selected-info" class="sort-order-content">热门推荐</div>
                    <div class="iconfont icon-B-shangxiasanjiaojiantou"></div>
                </div>
            </div>
            <div id="hotel-sort" class="dropdown-select">
                <a href="javascript:void(0)" onclick=selectHotels(0)>热门推荐</a>
                <a href="javascript:void(0)" onclick=selectHotels(1)>价格从低到高</a>
                <a href="javascript:void(0)" onclick=selectHotels(2)>评分从高到低</a>
            </div>

            <!-- 酒店信息 -->

        </div>
        <!-- 关闭地图的按钮 -->
        <div class="close">
            <a href="javascript:void(0)">关闭地图 ×</a>
        </div>
        <!-- 地图、第二个筛选栏的滑入滑出按钮 -->
        <div class="showMap">
            <div id="container"></div>
            <a id="slide-btn" href="javascript:void(0)" class="slide">
                <div class="iconfont icon-sanjiao-copy"></div>
            </a>
        </div>
    </div>
</div>
<div id="LARid" class="LAR-Background">
    <div class="LAR-Container">
        <ul class="LAR-ul">
            <a href="javascript:void(0)">
                <li id="loginLi" class="LAR-li">登录</li>
                <li id="registerLi" class="LAR-li">注册</li>
            </a>
        </ul>
        <div id="closebtn" class="closeButton"><a href="#" title="关闭"><img src="../resources/res/images/close.png" class="closeImg"></a></div>
        <div id="LAR-login">
            <div class="LAR-contant">
                <form name="loginForm" action="" onsubmit="" method="POST" class="LAR_form">
                    <span class="login_span">电子邮箱/手机号</span>
                    <input id="emailInput" type="text" name="emailOrphone"><br>
                    <span class="login_span">Booking.com密码</span>
                    <input id="pwdInput" type="password" name="pwd"><br>
                    <a href="#" class="lar_a">想不起密码？</a><br>
                    <a href="javascript:void(0)" class="sub-btn " >登录</a><br>
                </form>
					<span class="span-line">
						&nbsp;———————————&nbsp;&nbsp;或一键登录&nbsp;&nbsp;————————————
					</span>
                <a href="javascript:void(0)" class="weicharLogin"><img src="../resources/res/images/weichar.png" class="login_login">微信登录</a>
            </div>
            <hr>
            <span class="span-tip">输入<a href="" class="font_a">订单确认号和PIN码</a>即可管理订单</span>
            <span class="span-tip2">登录帐户即代表您同意本公司的<a href="#" class="font_a">相关条款</a>以及<a href="#" class="font_a">隐私声明</a></span>
        </div>

        <div id="LAR-register">
            <div class="LAR-contant">
                <form name="registerForm" action="" onsubmit="" method="POST" class="LAR_form">
                    <span class="login_span">电子邮箱/手机号</span>
                    <input id="emailInput2" type="text" name="emailOrphone"><br>
                    <span class="login_span">创建密码</span>
                    <input id="pwdInput2" type="password" name="pwd"><br>
                    <br>
                    <a href="javascript:void(0)" class="sub-btn ">注册账号</a><br>
                </form>
					<span class="span-line">
						——————————————&nbsp;&nbsp;或&nbsp;&nbsp;——————————————
					</span>
                <a href="javascript:void(0)" class="weicharLogin"><img src="../resources/res/images/weichar.png" class="login_login">微信登录</a>
            </div>
            <hr>
				<span class="span-tip">
						还没试过<a href="#" class="font_a">Booking.com商旅服务？</a><br>
						输入<a href="#" class="font_a">订单确认号和PIN码</a>即可管理订单
				</span>
            <span class="span-tip2">登录帐户即代表您同意本公司的<a href="#" class="font_a">相关条款</a>以及<a href="#" class="font_a">隐私声明</a></span>
            <br>
            <hr>
				<span class="span-tip">
						在Booking.com出租你的住宿 <a href="#" class="font_a">上线我的住宿</a>
				</span>
        </div>
    </div>
</div>


<%
	String adress = request.getParameter("searchAdress");
 %>
</body>
<script type="text/javascript" src="../resources/js/Map.js"></script>
</html>