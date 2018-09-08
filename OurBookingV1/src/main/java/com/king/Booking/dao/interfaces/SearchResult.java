package com.king.Booking.dao.interfaces;

import java.util.List;

import com.king.Booking.entity.AutoComplete;
import com.king.Booking.entity.HotelEva;
import com.king.Booking.entity.HotelSearchHotelView;

public interface SearchResult {
		//通过地址查询酒店的抽象方法
		public abstract List<HotelSearchHotelView> HotelSearchByAdress (String province, String downtown,int currentPage,int pageSize);
		//通过酒店Id查询评论
		public abstract List<HotelEva> HotelEvaByHotelId(int hotelId);
		//统计通过地址查询记录的总记录数
		public abstract int getHotelCount(String province, String downtown);
		//首页的自动补全和模糊搜索的抽象方法
		public abstract List<AutoComplete> getAutoComplete(String address);
}
