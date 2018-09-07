package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.king.Booking.dao.interfaces.SearchResult;
import com.king.Booking.entity.HotelEva;
import com.king.Booking.entity.HotelSearchHotelView;
import com.king.Booking.util.DataSourceUtil;


public class SearchResultDaoImpl implements SearchResult {
	
	//通过地址（省，市在数据库查询酒店表酒店）
	public List<HotelSearchHotelView> HotelSearchByAdress(String province, String downtown,int currentPage,int pageSize) {
		// TODO Auto-generated method stub
		System.out.println("SearchResultDaoImpl");
		QueryRunner runner = new QueryRunner();
		
		Connection conn = null;
		List<HotelSearchHotelView> hotelSearchList = null;
		try {
			conn = DataSourceUtil.getConnection();
		
			
			//查询数据库sql语句
			
			String sql = "select * from hotel_searchhotel_view where HotelProvince = ? and HotelDowntown = ? limit ?,?";
			Object[] params = {province,downtown,(currentPage-1)*pageSize,pageSize};
			//返回的数据被封装成List<JavaBean>
			hotelSearchList = runner.query(conn, sql,new BeanListHandler<HotelSearchHotelView>(HotelSearchHotelView.class),params);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hotelSearchList;
	}
	
	
	public List<HotelEva> HotelEvaByHotelId(int hotelId){
		
		QueryRunner runner = new QueryRunner();
		Connection conn = null;
		List<HotelEva> hotelEvaList = null;
		
		try {
			conn = DataSourceUtil.getConnection();
			//查询数据库sql语句
			String sql = "select * from hotel_eva_user_view where HotelId = ?";
			Object[] params = {hotelId};
			
			//返回的数据被封装成List<JavaBean>
			hotelEvaList = runner.query(conn, sql,new BeanListHandler<HotelEva>(HotelEva.class),params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hotelEvaList;
		
	}

	//统计通过地址查询记录的总记录数
	public int getHotelCount(String province, String downtown) {
		// TODO Auto-generated method stub

		QueryRunner runner = new QueryRunner();
		Connection conn = null;
		Object hotelCount = 0;
		try {
			conn = DataSourceUtil.getConnection();
			String sql = "select count(*) from hotel_searchhotel_view where HotelProvince = ? and HotelDowntown = ? ";
			Object[] params = {province,downtown};
			hotelCount = runner.query(conn,sql,new ScalarHandler<Object>(),params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int value = 0;
		System.out.println("酒店数量");
		System.out.println(hotelCount);
		if(hotelCount instanceof Long)
		    value = Integer.parseInt(String.valueOf(hotelCount));
		return value;
	}

}
