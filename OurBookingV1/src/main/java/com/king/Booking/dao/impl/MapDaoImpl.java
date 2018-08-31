package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.dao.MapDao;
import com.king.Booking.entity.HotelView;
import com.king.Booking.util.DataSourceUtil;

/**
 * Map查询窗口的Dao层实现类
 * @author Mr.Z
 *
 */
public class MapDaoImpl implements MapDao {

	public List<HotelView> queryHotelToFrom(String destination) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection conn = DataSourceUtil.getConnection();
		String sql = "select * from hotel_eva_view where HotelDowntown=?";
		Object[] params = {destination};
		List<HotelView> mapHotels = null;
		mapHotels = runner.query(conn, sql, new BeanListHandler<HotelView>(HotelView.class), params);
		return mapHotels;
	}

}
