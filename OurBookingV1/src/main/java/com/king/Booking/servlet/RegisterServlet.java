package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.User;
import com.king.Booking.service.impl.RegisterServiceImpl;

import net.sf.json.JSONObject;

public class RegisterServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("ok");
		
		String userEmail = request.getParameter("Email");
		String userPassword = request.getParameter("password");
		
		User user = new User();
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		
		RegisterServiceImpl rs = new RegisterServiceImpl();
		User userReturn = rs.Register(user);
		
				
			JSONObject json = new JSONObject();
			json.put("user", userReturn);
			out.print(json);
	
	}
	
}
