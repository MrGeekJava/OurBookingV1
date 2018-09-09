package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String verifyCode = request.getParameter("VC");
		String tureVerify = (String) request.getSession().getAttribute("Vtext"); //验证码文本
		String isTrue;
		
		if(verifyCode.equals(tureVerify)) {
			isTrue = "√";
		} else {
			isTrue = "×";
		}
		
		out.print(isTrue);
		out.flush();
		out.close();
		
	}

}
