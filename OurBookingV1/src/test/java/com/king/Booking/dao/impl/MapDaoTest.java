package com.king.Booking.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.HotelView;

public class MapDaoTest {

	@Test
	public void test() {
		MapDaoImpl mapDaoImpl = new MapDaoImpl();
		try {
			List<HotelView> hotels = mapDaoImpl.queryHotelToFrom("广州市");
			for(HotelView hotel:hotels) {
				System.out.println(hotel.getHotelId()+hotel.getHotelName());
			}
		} catch (SQLException e) {
			System.out.println("失败");
		}
	}

}
