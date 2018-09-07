package com.king.Booking.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.util.PaymentUtil;


public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				 String  p0_Cmd = "Buy"; //业务类型   固定值“Buy” 
		         String  p1_MerId = "10001126856";//商户编号 
		         String  p2_Order = "123456";// 商户订单号(从订单表中获取)
//		         String p3 = request.getParameter("ORDER_MONEY").split("元")[0];
		         String  p3_Amt = "0.01";// 支付金额
		         String  p4_Cur = "CNY"; // 固定值 ”CNY” 
		         String  p5_Pid = ""; // 商品名称(酒店名)(从订单表中获取)
		         String  p6_Pcat = ""; // 商品种类(从订单表中获取)
		         String  p7_Pdesc = ""; // 商品描述(从订单表中获取)
		         String  p8_Url = "view/resultPay.jsp"; // 商户接收支付成功数据的地址(应该跳转到修改订单表的Servlet，把是否支付的字段改成已支付)
		         String  p9_SAF = ""; // 送货地址   为“1”: 需要用户将送货地址留在易宝支付系统;为“0”: 不需要，默认为 ”0”.
		         String  pa_MP = ""; // 商户扩展信息(从订单表中获取)
		         String  pd_FrpId = "ABC-NET-B2C";//农业银行支付,支付通道编码
		         String  pr_NeedResponse = "1"; //固定值为“1”: 需要应答机制; 收到易宝支付服务器点对点支付成功通知，必须回写以”success”（无关大小写）开头的字符串，即使您收到成功通知时发现该订单已经处理过，也要正确回写”success”，否则易宝支付将认为您的系统没有收到通知，启动重发机制，直到收到”success”为止。 
		 		 String keyValue = "69cl522AV6q613Ii4W6u8K6XuW8vM1N6bFgyv769220IuYe9u37N4y7rI4Pl";//密钥
		 		 String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, keyValue);
//		 		 System.out.println(request.getParameter("USER_NAME"));

		         /**
		          * 把组织好的数据重定向到正式请求地址：https://www.yeepay.com/app-merchant-proxy/node 
		             商户：把交易信息明文加密--->密文    然后把明文和密文都交给发送给第三方易宝
		                   第三方易宝拿到数据后,把传过来的明文和传过来密文比较,
		                    如果数据相同，则说明没有被篡改 (易宝与商家加密时都用的商户注册时给的相同key)    
		          */
		         response.sendRedirect("https://www.yeepay.com/app-merchant-proxy/node?" +
		                 "p0_Cmd="+p0_Cmd+"&p1_MerId="+p1_MerId+"&p2_Order="+p2_Order+"&p3_Amt="+p3_Amt+"&p4_Cur="+p4_Cur+
		                 "&p5_Pid="+p5_Pid+"&p6_Pcat="+p6_Pcat+"&p7_Pdesc="+p7_Pdesc+"&p8_Url="+p8_Url+"&p9_SAF="+p9_SAF+
		                 "&pa_MP="+pa_MP+"&pd_FrpId="+pd_FrpId+"&pr_NeedResponse="+pr_NeedResponse+"&hmac="+hmac);
		
		
		
//		         response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getCookies());
		doGet(request, response);
	}

}
