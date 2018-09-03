package com.king.Booking.dao;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.entity.HotelView;
import com.king.Booking.entity.SearchHotel;

/**
 * 地图窗口的Dao层接口类
 * @author Mr.Z
 *
 */
public interface MapDao {
	
//	首次点击地图，通过城市名查询酒店
	public List<HotelView> queryHotelToFrom(String destination) throws SQLException;
	
//	在地图的筛选栏筛选酒店
	public List<HotelView> queryHotelSecond(SearchHotel condictions, String destination) throws SQLException; 
}
