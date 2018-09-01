package com.king.Booking.service.impl;

import java.util.List;

import com.king.Booking.dao.impl.SearchResultDaoImpl;
import com.king.Booking.entity.HotelSearchHotelView;

public class SearchResultService {
	
		////通过地址（省，市调用dao等的相关方法
		public List<HotelSearchHotelView> searchRult(String province,String downtown){
			
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<HotelSearchHotelView> searchRult = srdImpl.HotelSearchByAdress(province, downtown);
			return searchRult;
			
		}
}
