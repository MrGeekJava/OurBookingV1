package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.Room;
import com.king.Booking.util.DataSourceUtil;

public class LookingRoomDaoInitImpl {

	public Hotel getHotelMessage() {
		Hotel returnHotel = new Hotel();
		QueryRunner runner = new QueryRunner();
		Connection conn;
		try {
			conn = DataSourceUtil.getConnection();
			
			String sql = "select * from HotelList where HotelName = ?";
			Object[] params = {"广州白云宾馆"};
		
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
	
	public List<Room> getRoomMessage() {
		QueryRunner runner = new QueryRunner();
		Connection conn;
		List<Room> roomQuery = new ArrayList<Room>();
		try {
			conn = DataSourceUtil.getConnection();
			
			String sql = "select * from RoomList";
		
		roomQuery = runner.query(conn, sql,new BeanListHandler<Room>(Room.class));
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			return roomQuery;
	}
	
	

}
