package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.User;

public class ShowOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowOrderServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我的订单进来了！！");
		PrintWriter out = response.getWriter();
		//获取用户ID和是否完成支付
		User user =(User)request.getSession().getAttribute("loginUser");
		 int userId =user.getUserId(); 
		 int orderIsPay = Integer.parseInt(request.getParameter("orderIsPay"));
		
		 System.out.println("userId:"+userId+";orderIsPay:"+orderIsPay);
		

	}

}
