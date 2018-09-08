package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.User;
import com.king.Booking.service.impl.RegisterServiceImpl;
import com.king.Booking.util.VerifyUtil; 
/**
 * 注册：验证码跟输入的是否一致
 * 	  判断用户名是否手机号或者邮箱号码
 * 	 判断这个用户名是否存在
 * 	如果不存在则直接登录，提示注册成功
 * 	不然就清空输入框，提示用户存在
 * @author Nier
 *
 */
public class RegisterServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		VerifyUtil verifyUtil = new VerifyUtil();
		String EmailOrPhone = request.getParameter("EmailOrPhone");
		String userPsw = request.getParameter("password");
		boolean registerReturn;

		//将数据打包到User
		User user = new User();
		if(verifyUtil.checkPhone(EmailOrPhone)) {
			user.setUserPhoneNumber(EmailOrPhone);
		} else if(verifyUtil.checkEmail(EmailOrPhone)) {
			user.setUserEmail(EmailOrPhone);
		} else {
			registerReturn = false;
		}
		user.setUserPassword(userPsw);
		registerReturn = new RegisterServiceImpl().userRegister(user);
		
		out.print(registerReturn);//给JS判断是否要显示和隐藏
		out.flush();
		out.close();
	}
}
