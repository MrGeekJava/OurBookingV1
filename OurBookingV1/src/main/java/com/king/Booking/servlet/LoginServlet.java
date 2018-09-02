package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.User;
import com.king.Booking.service.impl.RegisterServiceImpl;

import net.sf.json.JSONObject;

/**
 * Session来保存用户登录状态，如果有登录信息，则显示头像那个div，不然就显示注册和登录的盒子
 * @author Nier 
 *
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("ok");
		
		String userEmail = request.getParameter("Email");
		String userPassword = request.getParameter("password");
//		System.out.println("userEmail:"+userEmail+",userPassword:"+userPassword);
		User user = new User();
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		JSONObject json = null;
		RegisterServiceImpl rs = new RegisterServiceImpl();
		User userReturn = rs.UserLogin(user);
//		System.out.println(userReturn.getUserEmail()+" "+userReturn.getUserPassword());
		/**
		 * 正则表达式判断输入进来的是手机号还是邮箱
		 */
		boolean result = rs.isemail(userEmail);
		if(result==true) {
			if(userEmail.equals(userReturn.getUserEmail()) &&userPassword.equals(userReturn.getUserPassword())) {
				//登录成功
				json= new JSONObject();
				json.put("user", userReturn);
				out.print(json);
			}else {
				try {
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}else {			
			if(userEmail.equals(userReturn.getUserPhoneNumber()) &&userPassword.equals(userReturn.getUserPassword())) {
				//登录成功
				json= new JSONObject();
				json.put("user", userReturn);
				out.print(json);
			}else {
				try {
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
	
		}
		
		
				
	}

}
