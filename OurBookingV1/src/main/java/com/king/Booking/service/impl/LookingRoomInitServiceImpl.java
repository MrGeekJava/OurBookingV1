package com.king.Booking.service.impl;

import com.king.Booking.dao.impl.LookingRoomDaoInitImpl;
import com.king.Booking.entity.Hotel;

public class LookingRoomInitServiceImpl {

	public Hotel getHotelMessage() {
		Hotel hotel = new Hotel();
		LookingRoomDaoInitImpl lrid = new LookingRoomDaoInitImpl();
		hotel = lrid.getHotelMessage();
		return hotel;
	}

}
