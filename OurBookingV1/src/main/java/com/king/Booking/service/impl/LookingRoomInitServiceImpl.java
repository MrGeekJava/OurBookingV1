package com.king.Booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.king.Booking.dao.impl.LookingRoomDaoInitImpl;
import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.Room;

public class LookingRoomInitServiceImpl {

	public Hotel getHotelMessage() {
		Hotel hotel = new Hotel();
		LookingRoomDaoInitImpl lrid = new LookingRoomDaoInitImpl();
		hotel = lrid.getHotelMessage();
		return hotel;
	}
	
	public List<Room> getRoomMessage() {
		List<Room> room = new ArrayList<Room>();
		LookingRoomDaoInitImpl lrid = new LookingRoomDaoInitImpl();
		room = lrid.getRoomMessage();
		return room;
	}

}
