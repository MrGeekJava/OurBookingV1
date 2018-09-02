package com.king.Booking.service.impl;

import java.sql.SQLException;

import com.king.Booking.dao.impl.RegisterDaoImpl;
import com.king.Booking.entity.User;
import com.king.Booking.util.DataSourceUtil;

public class RegisterServiceImpl {

		//Dao层用户登录函数
		public User UserLogin(User user) {
			RegisterDaoImpl register = new RegisterDaoImpl();
			User user2 = register.userLogin(user);
			return user2;
		}
		//Dao层用户注册的函数
		public boolean userRegister(User user) throws SQLException {
			RegisterDaoImpl register = new RegisterDaoImpl();
			boolean result = register.UserRegister(user);		
			return result;
		}
		
		//判断是否为手机号
		public boolean isphone(String str) {
			RegisterDaoImpl register = new RegisterDaoImpl();
			boolean b = register.checkPhone(str);
			return b;
		}
		
		//判断是否为邮箱
		public boolean isemail(String str) {
			RegisterDaoImpl register = new RegisterDaoImpl();
			boolean b = register.checkEmail(str);
			return b;
		}
}
