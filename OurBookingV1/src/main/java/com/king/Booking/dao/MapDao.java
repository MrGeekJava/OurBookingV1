package com.king.Booking.dao;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.entity.HotelView;

/**
 * 地图窗口的Dao层接口类
 * @author Mr.Z
 *
 */
public interface MapDao {
	public List<HotelView> queryHotelToFrom(String destination) throws SQLException; 
}
