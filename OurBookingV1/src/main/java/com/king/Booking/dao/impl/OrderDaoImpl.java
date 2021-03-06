package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.dao.interfaces.OrderDao;
import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.Order;
import com.king.Booking.util.DataSourceUtil;

public class OrderDaoImpl implements OrderDao{
	
//	查询所有该用户的订单根据用户ID和是否支付来查询
	public List<Order> queryAllOrderbyOrderIdandPay(int UserId,int OrderIsPay) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection conn = DataSourceUtil.getConnection();
		String sql = "select * from OrderList where UserId=? and OrderIsPay = ?"; 
		Object[] params = {UserId,OrderIsPay};
		List<Order> Orders = new ArrayList<Order>();
		Orders = runner.query(conn, sql, new BeanListHandler<Order>(Order.class), params);

		return Orders;
	}
	
//	查询所有该用户的订单根据用户ID来查询
	public List<Order> queryAllOrderbyOrderId(int UserId) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection conn = DataSourceUtil.getConnection();
		String sql = "select * from OrderList where UserId=?"; 
		Object[] params = {UserId};
		List<Order> Orders = new ArrayList<Order>();
		Orders = runner.query(conn, sql, new BeanListHandler<Order>(Order.class), params);
		
		return Orders;
	}
	
	//根据酒店ID查询酒店相关信息
	public Hotel queryAllHotelbyhotelId(int hotelId) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection conn = DataSourceUtil.getConnection();
		String sql = "select * from HotelList where hotelId=?"; 
		Object[] params = {hotelId};
		Hotel hotel = new Hotel();
		hotel = runner.query(conn, sql, new BeanHandler<Hotel>(Hotel.class),params);
		
		return hotel ;
	}
	
	//生成的订单存储到订单表中
	//用户ID，酒店ID可以相同，只要保证订单号不相同就行
	public void orderInsert(Order order) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByXML());
		String insertSql = "insert into OrderList(UserId,OrderId,HotelId,OrderTime,OrderMoney,OrderIsPay,IsChargeback,InDate,OrderDay,OutDate,RoomNum,PeopleNum,ContactNum"
				+ ",OrderEmail,HotelName,HotelType,RoomGrade,HotelAdress,OrderUserName) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {order.getUserId(),order.getOrderId(),order.getHotelId(),order.getOrderTime(),order.getOrderMoney(),order.getOrderIsPay(),order.getIsChargeback(),order.getInDate(),order.getOrderDay(),
				order.getOutDate(),order.getRoomNum(),order.getPeopleNum(),order.getContactNum(),order.getOrderEmail(),order.getHotelName(),order.getHotelType(),
				order.getRoomGrade(),order.getHotelAdress(),order.getOrderUserName()};
			
			int count = runner.update(insertSql,params);
			System.out.println("成功增加"+count+"条订单！");
			
			String updateSql = "update RoomList set RoomNumber=RoomNumber-1 where RoomId="+order.getHotelId();
			int updatecount = runner.update(updateSql);
			System.out.println("成功修改"+updatecount+"条数据！");

	
	}
	
	
	//修改订单支付状态未支付改为支付
	public void orderUpdate(int orderId) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByXML());
		String updateSql = "update OrderList set OrderIsPay=1 where OrderId=?";
		Object [] params = {orderId};
			int count = runner.update(updateSql,params);
			System.out.println("成功修改"+count+"条数据！");		
	}
	
	
	
}
