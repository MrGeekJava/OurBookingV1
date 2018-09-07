package com.king.Booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.king.Booking.dao.impl.LookingRoomDaoInitImpl;
import com.king.Booking.entity.CommentView;
import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.Room;

public class LookingRoomInitServiceImpl {

	public Hotel getHotelMessage(String hotelId) {
		Hotel hotel = new Hotel();
		LookingRoomDaoInitImpl lrid = new LookingRoomDaoInitImpl();
		hotel = lrid.getHotelMessage(hotelId);
		return hotel;
	}
	
	public List<Room> getRoomMessage() {
		List<Room> room = new ArrayList<Room>();
		LookingRoomDaoInitImpl lrid = new LookingRoomDaoInitImpl();
		room = lrid.getRoomMessage();
		return room;
	}
	
	public List<CommentView> getComment(int pageNum,int page){
		List<CommentView> comment = new ArrayList<CommentView>();
		LookingRoomDaoInitImpl lrid = new LookingRoomDaoInitImpl();
		comment = lrid.getCommentView(pageNum,page);
		return comment;
		
	}

}
