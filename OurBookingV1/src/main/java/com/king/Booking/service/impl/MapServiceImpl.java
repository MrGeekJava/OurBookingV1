package com.king.Booking.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.dao.impl.MapDaoImpl;
import com.king.Booking.entity.HotelView;
import com.king.Booking.entity.SearchHotel;
import com.king.Booking.service.MapService;
import com.king.Booking.util.DataSourceUtil;

public class MapServiceImpl implements MapService {

	public List<HotelView> queryHotelsToMap(String destination) {
		List<HotelView> hotels = null;
		try {
			hotels = new MapDaoImpl().queryHotelToFrom(destination);
		} catch (SQLException e) {
			System.out.println("数据库查询所有结果出错！！");
			e.printStackTrace();
		} finally {
			DataSourceUtil.close();
		}
		return hotels;
	}

	public List<HotelView> queryHotelSecond(SearchHotel condictions, String destination) {
		List<HotelView> hotels = null;
		try {
			hotels = new MapDaoImpl().queryHotelSecond(condictions, destination);
		} catch (SQLException e) {
			System.out.println("数据库条件查询结果出错！！");
			e.printStackTrace();
		} finally {
			DataSourceUtil.close();
		}
		return hotels;
	}

}
