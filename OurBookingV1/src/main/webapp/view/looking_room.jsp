<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <link href="../resources/css/looking_room.css" rel="stylesheet" type="text/css">
    <script src="//at.alicdn.com/t/font_788386_2i6kkukzw5q.js" ></script>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
  
    <script type="text/javascript" src="../resources/js/jquery.cookie.js"></script>
    
    <script src="../resources/js/NavBar.js"></script>
    <link rel="stylesheet" href="../resources/css/NavBar.css">
    <link href="../resources/res/icon/index_icon/iconfont.css" rel="stylesheet">
    <link rel="SHORTCUT ICON" href="../resources/res/images/title_logo.icon"/>

    <script src="../resources/js/looking_room.js"></script>
    <meta charset="UTF-8">
    <title></title>
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
                    <a href="javascript:void(0)" onclick="" class="user-btn-2">上线我的住宿</a>
                </li>
                <li class="user-li_5">
                    <a id="reg-btn" href="javascript:void(0)" class="user-btn" data-title="成为会员，享受专属隐藏优惠">注册</a>
                </li>
                <li class="user-li_6">
                    <a id="log-btn" href="javascript:void(0)" class="user-btn" data-title="使用已存信息，预订更快捷">登录</a>
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

<div class="container">
    <ul class="list">
        <li><a href="">首页</a>
            <svg class="icon icon-youjiantou" aria-hidden="true">
                <use xlink:href="#icon-youjiantou"></use>
            </svg>
        </li>
        <li><a href="#">中国</a>
            <svg class="icon icon-youjiantou" aria-hidden="true">
                <use xlink:href="#icon-youjiantou"></use>
            </svg></li>
            <%
            	
      
            %>
        <li><a href="#"><% 
        String hotelProvice=null;
    	Cookie[] cookies = request.getCookies();
    	for(Cookie cookie:cookies){
    	
    	 if (cookie.getName().equals("hotelProvice")) {
             //使用URLDecode.decode()解码,防止中文乱码
             hotelProvice = URLDecoder.decode(cookie.getValue(), "utf-8");
      
         }    
        }
         	out.print(hotelProvice);
         %></a>
            <svg class="icon icon-youjiantou" aria-hidden="true">
                <use xlink:href="#icon-youjiantou"></use>
            </svg></li>
        <li><a href="#"><% 
        String hotelDowntown=null;
    	for(Cookie cookie:cookies){
    	
    	 if (cookie.getName().equals("hotelDowntown")) {
             //使用URLDecode.decode()解码,防止中文乱码
            hotelDowntown = URLDecoder.decode(cookie.getValue(), "utf-8");
      
         }    
        }
         	out.print(hotelDowntown);
         %></a>
            <svg class="icon icon-youjiantou" aria-hidden="true">
                <use xlink:href="#icon-youjiantou"></use>
            </svg></li>
        <li><% 
        String hotelArea=null;
    	for(Cookie cookie:cookies){
    	
    	 if (cookie.getName().equals("hotelArea")) {
             //使用URLDecode.decode()解码,防止中文乱码
           hotelArea = URLDecoder.decode(cookie.getValue(), "utf-8");
      
         }    
        }
         	out.print(hotelArea);
         %></li></ul>
    <div class="leftcontainer">
        <div class="one">
            <button class="onebutton1">现在就预定</button>
            <button class="onebutton2">保存至心愿单列表</button>
            <p>已被保存至5434份清单</p>
        </div>

        <div class="two">
            价格更放心
        </div>
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
                <span>2位儿童</span>
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
                <span>2间房</span>
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
        <div class="four">
            <svg class="icon icon-yanjing" aria-hidden="true">
                <use xlink:href="#icon-yanjing"></use>
            </svg>
            <span>666人正在搜索广州的住宿</span>
        </div>
        <div class="five">
            <svg class="icon icon-dizhi" aria-hidden="true">
                <use xlink:href="#icon-dizhi"></use>
            </svg>
            <button>搜索周边</button>
        </div>

        <div class="six">
            <div class="text">从广州白云国际机场前往广州白云宾馆</div>
            <div class="search">
                <svg class="icon icon-chuzuche" aria-hidden="true">
                    <use xlink:href="#icon-chuzuche"></use>
                </svg>
                <span>出租车</span>
                <div class="time">40分钟</div>
            </div>
            <div class="search1">
                <svg class="icon icon-tingchechang1" aria-hidden="true">
                    <use xlink:href="#icon-tingchechang1"></use>
                </svg>
                <span>停车场</span>

            </div>

        </div>

        <div class="seven">
            <span>有一点动心，但是不太确定？</span>
            <button>查看类似住宿</button>
        </div>

        <div class="nearplace">
            <li>附近地标</li>
            <li><span>立柏广场</span> <a>0.1km</a></li>
            <li><span>广州友谊商店</span> <a>0.1km</a></li>
            <li><span>环市路酒吧街</span> <a>0.3km</a></li>
            <li><span>华侨新城</span> <a>0.3km</a></li>
        </div>

    </div>
    <div class="midd">
        <a class="a1">客户信息&价格</a>
        <a  class="a2">设施</a>
        <a  class="a3">订前必读</a>
        <a  class="a4">预定须知</a>
        <a  class="a5">22131用户点评</a>

        <div class="header">
            <span class="span1">广州白云宾馆</span>
            <span class="span2"><% 
        String hotelType=null;
    	for(Cookie cookie:cookies){
    	
    	 if (cookie.getName().equals("hotelType")) {
             //使用URLDecode.decode()解码,防止中文乱码
            hotelType = URLDecoder.decode(cookie.getValue(), "utf-8");
      
         }    
        }
         	out.print(hotelType);
         %></span>
            <div class="pointer">
                <li></li><li></li><li></li><li></li><li></li>
            </div>
            <svg class="icon icon-zan" aria-hidden="true">
                <use xlink:href="#icon-zan"></use>
            </svg>
            <div class="double">
                <svg class="icon icon-renshu" aria-hidden="true">
                    <use xlink:href="#icon-renshu"></use>
                </svg>
                <span>推荐双人入住</span>
            </div>
            <div class="bus">
                <svg class="icon icon-chuansuojichangbanche" aria-hidden="true">
                    <use xlink:href="#icon-chuansuojichangbanche"></use>
                </svg>
                <span>机场班车</span>
            </div>
            <div class="nothing">
                <svg class="icon icon-wuzhangaisheshi" aria-hidden="true">
                    <use xlink:href="#icon-wuzhangaisheshi"></use>
                </svg>
                <span>无障碍</span>
            </div>
            <button>现在就预定</button>
            <div class="love">
                <svg class="icon icon-aixin" aria-hidden="true">
                    <use xlink:href="#icon-aixin"></use>
                </svg>
            </div>
            <div class="share">
                <svg class="icon icon-fenxiang" aria-hidden="true">
                    <use xlink:href="#icon-fenxiang"></use>
                </svg>
            </div>
            <div class="foot">
                <svg class="icon icon-dizhi" aria-hidden="true">
                    <use xlink:href="#icon-dizhi"></use>
                </svg>
                <span><% 
        String hotelAdress=null;
    	for(Cookie cookie:cookies){
    	
    	 if (cookie.getName().equals("hotelAdress")) {
             //使用URLDecode.decode()解码,防止中文乱码
            hotelAdress = URLDecoder.decode(cookie.getValue(), "utf-8");
      
         }    
        }
         	out.print(hotelAdress);
         %></span>
                <a>位置很赞-显示地图</a>
                <svg class="icon icon-duihaocheckmark17" aria-hidden="true">
                    <use xlink:href="#icon-duihaocheckmark17"></use>
                </svg>
                <h6 class="span1">价格更放心</h6>
            </div>
        </div>
        <div class="slide">
            <div class="img1" ><img src="" alt=""/></div>
            <div class="pre" > <svg class="icon icon-zuojiantou" aria-hidden="true">
                <use xlink:href="#icon-zuojiantou"></use>
            </svg></div>
            <div class="next" > <svg class="icon icon-zuojiantou-copy" aria-hidden="true">
                <use xlink:href="#icon-zuojiantou-copy"></use>
            </svg></div>

        </div>
        <div class="manyimg">
            <li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li>
             <li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li><li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li> <li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li>
            <li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li><li><img src="" alt=""/></li> <li><img src="" alt=""/></li>
        </div>
        <div class="speciality">
            <img src="../resources/res/images/GZBYBG/two.PNG" alt=""/>
            <button>现在就预定</button>
            <button>保存至心愿清单列表</button>
        </div>
        <div class="text">
            <h3>广州精选推荐之一</h3>
            <span class="hotelPer" style="color:black;letter-spacing:2px; font-size: 18px"> <%=session.getValue("hotelPer")%></span>
                 
                    </div>

        <div class="tip">
            <li>小</li>
            <li>粉</li>
            <li>拳</li>
            <li>锤</li>
            <li>爆</li>
            <li>你</li>
            <li>头</li>
            <div class="renxin">我要下订单啦啦
                <svg class="icon icon-guilian" aria-hidden="true">
                    <use xlink:href="#icon-guilian"></use>
                </svg>
            </div>
        </div>
        
        
              <div class="order"><table border="1" bordercolor="#4a98d7" width="1058px" >
            <tr style="background-color: #e8eff9">
                <th>房间类型</th><th>剩余房间数</th><th>单价</th><th>总价</th><th>预定客房数量</th><th>入住日期</th><th>离开日期</th><th>入住人数</th><th>预定选择</th>
            </tr>
            <tr  style="background-color: #EFFFFF">
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td style="background-color: #0AB21B;cursor: pointer" >     
                  <button style="background-color: #0AB21B;border: none;"><a class="yuding"  
                   href="personInfor.jsp" 
                  style="	position: relative;background-color: #0AB21B;text-decoration: none;color: black;padding: 0px"
                  >预定</a></button></td>
            </tr>
            <tr style="background-color: #EFFFFF">
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td style="background-color: #0AB21B;cursor: pointer">   
                   <button style="background-color: #0AB21B;border: none;"><a class="yuding"  
                    href="personInfor.jsp"
                     style="position: relative;background-color: #0AB21B;text-decoration: none;color: black;padding: 0px">预定</a></button></td>
            </tr>
            <tr style="background-color: #EFFFFF">
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td style="background-color: #0AB21B;cursor: pointer">  
                    <button style="background-color: #0AB21B;border: none;"><a  class="yuding" 
                     href="personInfor.jsp" 
                     style="	position: relative;background-color: #0AB21B;text-decoration: none;color: black;padding: 0px"
                    >预定</a></button></td>
            </tr>
            <tr style="background-color: #EFFFFF">
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td style="background-color: #0AB21B;cursor: pointer">  
                    <button style="background-color: #0AB21B;border: none;"><a class="yuding"  
                    href="personInfor.jsp"
                     style="	position: relative;background-color: #0AB21B;text-decoration: none;color: black;padding: 0px"
                     >预定</a></button></td>
            </tr>
            <tr style="background-color: #EFFFFF">
                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td style="background-color: #0AB21B;cursor: pointer">  
                <button style="background-color: #0AB21B;border: none;"><a class="yuding" 
                 href="personInfor.jsp"
                  style="position: relative;background-color: #0AB21B;text-decoration: none;color: black;padding: 0px"
                  >预定</a></button></td>
            </tr>
        </table></div>
        
        
        

        <div class="connectfoot">
            <h3>还没有找到合适的住宿?</h3>
            <div class="searchother">继续搜索</div>
        </div>
        
            <div class="CommentFoot">
         	   <div class="fineComment">精彩评论</div>
            <div class="nickName">昵称：</div>
            <div class="comment">评语：</div>
            <span class="span1">小玲</span>
            <span class="span2">广州白云宾馆的4家餐厅提供美味的中国菜肴和意大利美食。大堂酒吧供应
各种饮料和咖啡。</span>
        </div>
        
            <div class="CommentFootCopy">
         	   <div class="fineComment">精彩评论</div>
            <div class="nickName">昵称：</div>
            <div class="comment">评语：</div>
            <span class="span1">小玲</span>
            <span class="span2">广州白云宾馆的4家餐厅提供美味的中国菜肴和意大利美食。大堂酒吧供应
各种饮料和咖啡。</span>
        </div>
        
        
        
    </div>
    

</div>

</body>
</html>