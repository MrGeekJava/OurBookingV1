package com.king.Booking.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.dao.impl.MapDaoImpl;
import com.king.Booking.entity.HotelView;
import com.king.Booking.service.MapService;

public class MapServiceImpl implements MapService {

	public List<HotelView> queryHotelsToMap(String destination) {
		List<HotelView> hotels = null;
		try {
			hotels = new MapDaoImpl().queryHotelToFrom(destination);
		} catch (SQLException e) {
			System.out.println("数据库出错！！");
			e.printStackTrace();
		}
		return hotels;
	}

}
