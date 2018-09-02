package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.king.Booking.entity.User;
import com.king.Booking.service.impl.RegisterServiceImpl;

import net.sf.json.JSONObject; 
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
		String verrifyCode = request.getParameter("Verify"); //用户输入的验证码
		String EmailOrPhone = request.getParameter("EmailOrPhone");
		String userPsw = request.getParameter("password");
		System.out.println("用户输入的验证码："+verrifyCode);
		String tureVerify = (String) request.getSession().getAttribute("Vtext"); //验证码文本
			
		//将数据打包到User
		User user = new User();
		user.setUserPassword(userPsw);
		user.setUserEmail(EmailOrPhone);
		
		JSONObject json = null;
	
//		System.out.println(userReturn.getUserEmail()+" "+userReturn.getUserPassword());
		/**
		 * 验证码JSON
		 */
//		HttpSession hs = request.getSession();
//		if(verrifyCode.equalsIgnoreCase(tureVerify)) {
//			System.out.println("验证码正确");
//		}else {
//			hs.setAttribute("registerMsg", "验证码不正确！");
//			json= new JSONObject();
//			json.put("verrifyCode", "验证码不正确！");//给JS判断是否要显示和隐藏
//			out.print(json);		
//		}
		
		if(verrifyCode.equalsIgnoreCase(tureVerify)) {
			RegisterServiceImpl rs = new RegisterServiceImpl();
			boolean registerReturn = rs.userRegister(user);
			if(registerReturn==true) {			
			/**
			 * 注册成功
			 */
			System.out.println("注册成功");
			json= new JSONObject();
			json.put("user", registerReturn);//给JS判断是否要显示和隐藏
			out.print(json);
		}else {
			//清空输入框
			System.out.println("注册失败");		
		}
			
		}else {
			System.out.println("注册失败");
			json= new JSONObject();
//			json.put("user", registerReturn);//给JS判断是否要显示和隐藏
			out.print(json);
		}
	
	
				
	}

}
