package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.entity.HotelView;
import com.king.Booking.entity.User;
import com.king.Booking.util.DataSourceUtil;

public class RegisterDaoImpl{
	
	public User  register(User user) {
		String userEmail =user.getUserEmail();
		String userPassword = user.getUserPassword();
		User user2 = null;
		
		QueryRunner runner = new QueryRunner();
		Connection conn;
		try {
			conn = DataSourceUtil.getConnection();
			
			String sql = "select * from UserList where UserEmail =?";
			Object[] params = {userEmail};
			List<HotelView> mapHotels = null;
		
			List<User> userQuery = runner.query(conn, sql,new BeanListHandler<User>(User.class), params);

			for(User user1:userQuery) {
				String name = user1.getUserName();
				user2= user1;
			}
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return user2;
	}
}
