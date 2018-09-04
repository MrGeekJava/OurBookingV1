package com.king.Booking.dao.interfaces;

import java.util.List;

import com.king.Booking.entity.HotelEva;
import com.king.Booking.entity.HotelSearchHotelView;

public interface SearchResult {
		//通过地址查询酒店的抽象方法
		public abstract List<HotelSearchHotelView> HotelSearchByAdress (String province,String Downtown);
		//通过酒店Id查询评论
		public abstract List<HotelEva> HotelEvaByHotelId(int hotelId);
}
