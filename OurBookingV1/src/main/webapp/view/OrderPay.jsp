<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="SHORTCUT ICON" href="../resources/res/images/title_logo.icon"/>
    <title>Booking.com：订单预定</title>
    <script src="../resources/js/JQuery/JQuery3.3.1.js"></script>
    <link rel="stylesheet" href="../resources/css/NavBar.css">
    <link rel="stylesheet" href="../resources/css/OrderPay.css">
    <link href="../resources/res/icon/index_icon/iconfont.css" rel="stylesheet">
    <link href="../resources/res/icon/personifm/iconfont.css" rel="stylesheet">
    <script src="../resources/js/index_container.js"></script>
    <script src="../resources/js/NavBar.js"></script>
    <script src="../resources/js/personIfm.js"></script>

    
</head>
<body>
<div  class="tips"></div>
<div id="registertip" class="index_tip"></div>
<div class="tip3"></div>
<!--实现图片移动-->
<div  class="modal">
    <img class="model-content" id="img01" src="../res/images/personIfm/xlhkz.jpg">
</div>

<div class="modal2">
    <img class="model-content" id="img02" src="../res/images/personIfm/xlhkz1.jpg">
</div>
<div class="modal3">
    <img class="model-content" id="img03" src="../res/images/personIfm/xlhkz2.jpg">
</div>
<div class="modal4">
    <img class="model-content" id="img04" src="../res/images/personIfm/xlhkz3.jpg">
</div>
<div class="modal5">
    <img class="model-content" id="img05" src="../res/images/personIfm/xlhkz4.jpg">
</div>

<div id="none_img_id" >
    <img src="../res/images/wechat_img.png" id="none_img_id2" >
</div>

<div class="top">

    <div class="head">
        <img id="Booking_logo" class="logo" src="../res/images/logo.png">
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
                <li class="user-li_5 person_class">
                    <a href="#" class="person_class_a">
                        <img src="../res/images/personIfm/person.png" style="width: 37px;height: 37px" class="personImg_class">
                        <p class=" user_name">用户名</p></a>
                    <div class="showIfm_none">
                        <div class="showIfm_none_tri"></div>
                        <ul class="showIfm_none_ul">
                            <li><a href="PersonalCenter.html">我的个人中心</a></li>
                            <li><a href="#">我的订单</a></li>
                            <li><a href="#">报表</a></li>
                            <li><a href="#">评语</a></li>
                            <li><a href="#">我的收藏</a></li>
                            <li><a href="#">下载app</a></li>
                            <li><a href="#">客服帮助</a></li>
                            <li><a href="#">设置</a></li>
                            <li><a href="#">退出</a></li>
                        </ul>

                    </div>
                </li>

            </ul>
        </div>
    </div>

</div>

<div class="flow">
    <div class="flow_up">
        <div class="flow_up_1 flow_up_left"><i class="iconfont icon-gou"></i></div>
        <div class="flow_up_2 flow_up_left">选择您的客房</div>
        <div class="flow_up_3 flow_up_left">
            <hr>
        </div>
        <div class="flow_up_4 flow_up_left"><i class="iconfont icon-gou"></i></div>
        <div class="flow_up_5 flow_up_left">填写您的信息</div>
        <div class="flow_up_6 flow_up_left">
            <hr>
        </div>
        <div class="flow_up_7 flow_up_left"><i class="iconfont icon-gou"></i></div>
        <div class="flow_up_8 flow_up_left">最终信息</div>
    </div>

    <div class="flow_down">
        <span class="flow_down_userName">用户名</span>
        <span class="flow_down_span">，完成预订！</span>
    </div>
</div>
<div class="container">
    <div class="container_order_ifm_box">
        <div class="container_order_ifm">
            <div class="container_order_ifm_left">
                <div class="container_order_ifm_img" >
                </div>
                <div class="container_order_ifm_r_img">
                    <ul class="order_ifm_r_ul">
                        <li class="order_ifm_r_img1 order_ifm_li">
                            <img src="../res/images/personIfm/xlhkz1.jpg" style="height: 100%;width: 100% ">
                        </li>
                        <li class="order_ifm_r_img2 order_ifm_li">
                            <img src="../res/images/personIfm/xlhkz2.jpg" style="height: 100%;width: 100% ">
                        </li>
                        <li class="order_ifm_r_img3 order_ifm_li">
                            <img src="../res/images/personIfm/xlhkz3.jpg" style="height: 100%;width: 100% ">
                        </li>
                        <li class="order_ifm_r_img4 order_ifm_li">
                            <img src="../res/images/personIfm/xlhkz4.jpg" style="height: 100%;width: 100% ">
                        </li>
                    </ul>
                </div>
            </div>
            <div class="container_order_ifm_right">
                <h1 class="order_ifm_h1">心灵海客栈（海口海甸店）</h1>

                <p class="order_ifm_p1" data-title="预定后，您可以在预订确认信和您的账户中找到该住宿的详细信息（包括电话和地址）"><i class="iconfont icon-weizhi" style="color: #58B8FF; padding-right: 5px;"></i>海口, 美兰, 海甸六西路万美街万美花园 ，近万恒城市花园</p>

                <p class="order_ifm_p2">海口最热门住宿之一</p>

                <p class="order_ifm_p3">2018年8月12日下午6:00前可免费取消</p>
            </div>
        </div>

        <div class="container_ensure">
            <i class="iconfont icon-iconfontright2" ></i>
            <p class="container_ensure_p1">担保此项预订无需任何费用。</p>

            <p class="container_ensure_p2">您将于入住期间付款。</p>
        </div>

        <div class="container_ensure2">
            <i class="iconfont icon-gou2"></i>

            <p class="container_ensure2_p1">运气真不错！</p>

            <p class="container_ensure2_p2">你已锁定心灵海客栈（海口海甸店）最便宜的房型。好价不错过，</p>

            <p class="container_ensure2_p3">立即支付吧！</p>
        </div>
        <p class="input_user_ifm">您的订单信息 &nbsp;&nbsp;&nbsp;Confirm your order information</p>
            <div class="order_ifm">
                    <div class="order_user_list">
                    <div class="order_user_ifm">用户名</div>
                    <div class="order_user_ifms USER_NAME"></div>
                    <div class="order_user_ifm">订单联系电话</div>
                    <div class="order_user_ifms CONTACT_NUM"></div>
                    <div class="order_user_ifm">房间数量</div>
                    <div class="order_user_ifms ROOM_NUM"></div>
                    <div class="order_user_ifm">房间类型</div>
                    <div class="order_user_ifms ROOM_TYPE"></div>
                    <div class="order_user_ifm">房间大小</div>
                    <div class="order_user_ifms ROOM_SIZE"></div></div>

                <div class="order_hotel_list">
                    <div class="order_hotel_ifm">酒店名字</div>
                    <div class="order_hotel_ifms HOTEL_NAME"></div>
                    <div class="order_hotel_ifm">酒店地址</div>
                    <div class="order_hotel_ifms HOTEL_ADRESS"></div>
                    <div class="order_hotel_ifm">酒店类型</div>
                    <div class="order_hotel_ifms HOTEL_TYPE"></div>
                    <div class="order_hotel_ifm">酒店等级</div>
                    <div class="order_hotel_ifms ROOM_GRADE"></div>
                    <div class="order_hotel_ifm">酒店电话</div>
                    <div class="order_hotel_ifms HOTEL_PHONE_NUM"></div>
                </div>

                <div class="order_list">
                    <div class="order_list_ifm">订单号</div>
                    <div class="order_list_ifms ORDER_ID"></div>
                    <div class="order_list_ifm">订单时间</div>
                    <div class="order_list_ifms ORDER_TIME"></div>
                    <div class="order_list_ifm">入住时间</div>
                    <div class="order_list_ifms IN_DATE"></div>
                    <div class="order_list_ifm">退房时间</div>
                    <div class="order_list_ifms OUT_DATE"></div>
                    <div class="order_list_ifm">订单总金额</div>
                    <div class="order_list_ifms ORDER_MONEY"></div>
                </div>


            </div>

        <div class="order_information_next_box">
            <div class="order_information_next">
                <div class="order_information_next1">
                    <div class="order_information_next1_tri"></div>

                    <p class="order_information_next1_p" data-title="低廉的价格-不收取预订手续费-别处找到了更便宜的价格？差价核实后将予以补偿"><a href="#"> <i class="iconfont icon-gou2" style="color: #003580;background: white; border-radius: 50%;"></i> 价格更放心</a></p>
                </div>
                <div class="order_information_next2">
                    <a href="#">去支付&#10095;</a>
                </div>

            </div>

        </div>



    </div>
</div>
<div class="footer">
    <div class="footer_up">
        <h2 class="footer_up_h2">大家喜爱Booking.com的理由</h2>
        <ul class="footer_lover_ul">
            <li class="footer_lover_li1"></li>
            <li class="footer_lover_li2"></li>
            <li class="footer_lover_li3"></li>
            <li class="footer_lover_li4"></li>
        </ul>
    </div>

    <div class="footer_middle">
        <div class="footer_middle_tex">上个月，超过<b>一百万</b>名用户说他们愿意向亲朋好友推荐<small style="font-size: 15px">Booking.com</small>。</div>
    </div>

    <div class="footer_down">
        <div class="footer_idea">
            <ul class="footer_idea_ul">
                <li class="footer_idea_li1"><a href="">关于Booking.com</a></li>
                <li class="footer_idea_li2"><a href="">客户服务</a></li>
                <li class="footer_idea_li2" style="margin-left: 5px"><a href="">相关条款</a></li>
                <li class="footer_idea_li3"><a href="">隐私和Cookie声明</a></li>
            </ul>
        </div>

        <div class="footer_copyright">版权 © 1996–2018 Booking.com. 版权所有.</div>

    </div>


</div>

</body>

</html>