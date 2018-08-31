package com.king.Booking.service.impl;

import com.king.Booking.dao.impl.RegisterDaoImpl;
import com.king.Booking.entity.User;

public class RegisterServiceImpl {

		
		public User Register(User user) {
			RegisterDaoImpl register = new RegisterDaoImpl();
			User user2 = register.register(user);
			return user2;
		}
}
