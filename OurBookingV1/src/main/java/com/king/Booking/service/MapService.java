package com.king.Booking.service;

import java.util.List;

import com.king.Booking.entity.HotelView;

/**
 * 地图窗口的service接口
 * @author Mr.Z
 *
 */
public interface MapService {
	
	public List<HotelView> queryHotelsToMap(String destination);

}
