package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.king.Booking.entity.User;
import com.king.Booking.service.impl.ChangeInfoService;

public class ChangeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession();
		User user = (User)hs.getAttribute("loginUser");
		
		PrintWriter out = response.getWriter();
		
		boolean isChanged = false;
		String changeValue = null;
		
		if(request.getParameter("userNickName") != null) {
			changeValue = request.getParameter("userNickName");
			isChanged = new ChangeInfoService().ChangeUserInfo("UserNickName", changeValue, user.getUserId());
		}
		if(request.getParameter("userBirthday") != null) {
			changeValue = request.getParameter("userBirthday");
			isChanged = new ChangeInfoService().ChangeUserInfo("Userbirthday", changeValue, user.getUserId());
		}
		System.out.println(isChanged);
		out.print(isChanged);
		out.flush();
		out.close();		
	}
}
