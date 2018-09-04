package com.king.Booking.service.impl;

import java.util.List;

import com.king.Booking.dao.impl.SearchResultDaoImpl;
import com.king.Booking.entity.HotelEva;
import com.king.Booking.entity.HotelSearchHotelView;

public class SearchResultService {
	
		////通过地址（省，市调用dao等的相关方法
		public List<HotelSearchHotelView> searchRult(String province,String downtown){
			
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<HotelSearchHotelView> searchRult = srdImpl.HotelSearchByAdress(province, downtown);
			return searchRult;
			
		}
		//通过酒店Id来查询用户评论
		public List<HotelEva> searchEva(int hotelId){
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<HotelEva> hotelEva = srdImpl.HotelEvaByHotelId(hotelId);
			return hotelEva;
			
		}
}
