package com.king.Booking.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.User;

/**
 * personInfor2页面超链接跳转过来处理数据
 *获取保存到cookie中的数据，保存到Order表
 *Service层调用Dao层的插入方法 ，插入数据到订单表（字段相对应）
	重定向跳转到OrderPay页面，
	在OrderPay页面用JS获取Cookie的数据。
 * @author Nier
 *
 */
public class OrderPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public OrderPayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		  		response.setCharacterEncoding("UTF-8");
		        response.setContentType("text/html;charset=utf-8");
		        
//		       PrintWriter out = response.getWriter();
//		       Cookie[] cookies = request.getCookies();          //从请求中获取客户端发来的Cookie
//		       for(Cookie i:cookies) {
//		    	   System.out.println(i.getName());
//		            if("orderRoomin".equals(i.getName())) {  
////		            	OrderUserEmail = URLEncoder.encode((i.getValue()),"utf-8");    
//		            	System.out.println("orderRoomin:"+i.getValue());
//		            }
//		        }
		       
		       
		       User user =(User)request.getSession().getAttribute("loginUser");
		       System.out.println("用户ID:"+user.getUserId());  //可以获取用户ID
		       
		       
		/*
		
		// 收件人的电子邮件 ID
	      String to = "632755825@qq.com";
	 
	      // 发件人的电子邮件 ID
	      String from = "17875512076@163.com";
	 
	      // 假设您是从本地主机发送电子邮件
	      String host = "localhost";
	 
	      // 获取系统的属性
	      Properties properties = System.getProperties();
	 
	      // 设置邮件服务器
	      properties.setProperty("mail.smtp.host", "smtp.163.com");
	      properties.setProperty("mail.smtp.auth","true");
	 
	      // 获取默认的 Session 对象
	      Session session = Session.getDefaultInstance(properties);
	      
	      // 设置响应内容类型
	      response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();

	      try{
	         // 创建一个默认的 MimeMessage 对象
	         MimeMessage message = new MimeMessage(session);
	         // 设置 From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	         // 设置 To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	         // 设置 Subject: header field
	         message.setSubject("This is the Subject Line!");
	         // 现在设置实际消息
	         message.setText("欢迎您订购本酒店");
	         // 发送消息
	         Transport.send(message);
	         String title = "发送电子邮件";
	         String res = "成功发送消息...";
	         String docType = "<!DOCTYPE html> \n";
	         out.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n" +
	         "<body bgcolor=\"#f0f0f0\">\n" +
	         "<h1 align=\"center\">" + title + "</h1>\n" +
	         "<p align=\"center\">" + res + "</p>\n" +
	         "</body></html>");
	         System.out.println("已经发送过去！");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	      */
		    
		       Random random = new Random();
		       String result="";
		       for (int i=0;i<6;i++)
		       {
		       	result+=random.nextInt(10);
		       }
			
		    request.getSession().setAttribute("OrderId", result);
		       
			response.sendRedirect("view/OrderPay.jsp");

	   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 订单信息插入数据库模块
		 */
		this.doGet(request, response);

	}

}
