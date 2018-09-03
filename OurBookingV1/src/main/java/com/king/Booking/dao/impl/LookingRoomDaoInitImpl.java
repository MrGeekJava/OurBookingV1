package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.entity.CommentView;
import com.king.Booking.entity.Hotel;
import com.king.Booking.util.DataSourceUtil;

public class LookingRoomDaoInitImpl {

	public Hotel getHotelMessage() {
		Hotel returnHotel = new Hotel();
		QueryRunner runner = new QueryRunner();
		Connection conn;
		try {
			conn = DataSourceUtil.getConnection();
			
			String sql = "select * from HotelList where HotelName = ?";
			Object[] params = {"¹ãÖÝ°×ÔÆ±ö¹Ý"};
		
			List<Hotel> hotelQuery = runner.query(conn, sql,new BeanListHandler<Hotel>(Hotel.class),params);
			
			
			for(Hotel hotel: hotelQuery) {
				
					returnHotel=hotel;
					System.out.println(returnHotel.getHotelFacilities());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			return returnHotel;
	}

}
