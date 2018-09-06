package com.king.Booking.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 订单信息插入数据库模块
		 */
		
		response.sendRedirect("view/OrderPay.jsp");

	}

}
