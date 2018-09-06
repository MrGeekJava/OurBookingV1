package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.dao.interfaces.OrderDao;
import com.king.Booking.entity.Order;
import com.king.Booking.entity.OrderView;
import com.king.Booking.util.DataSourceUtil;

public class OrderDaoImpl implements OrderDao{
	
//	查询所有该用户的订单根据用户ID来查询
	public List<Order> queryAllOrderbyOrderId(String UserId) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection conn = DataSourceUtil.getConnection();
		String sql = "select * from OrderList where UserId=?"; 
		Object[] params = {UserId};
		List<Order> Orders = new ArrayList<Order>();
		Orders = runner.query(conn, sql, new BeanListHandler<Order>(Order.class), params);
		
		//查询到多条OrderList的记录
		for(Order order:Orders) {
			//通过遍历拿到每一条记录
			//动态生成一个表格。
			/**
			 * 用三个盒子来装三个表格
			 * 默认显示一个用户ID的所有订单信息（一个盒子）
			 * 第二个用if(orderIsPay==1)来显示支付的表格，隐藏起来
			 * 第三个用if(orderIsPay==0)来显示未支付的表格，（多了，删除，去支付的按钮）隐藏起来。
			 * 我的订单信息中，选择option来调用盒子显示和隐藏
			 * 
			 */
			System.out.println(order);
		}
		
		return Orders;
		
		
		
	}
	
	
	//生成的订单存储到订单表中
	//用户ID，酒店ID可以相同，只要保证订单号不相同就行
	public void orderInsert(Order order) {
		QueryRunner runner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByXML());
		String insertSql = "insert into OrderList(UserId,OrderId,HotelId,OrderTime,OrderMoney,OrderIsPay,IsChargeback,InDate,OrderDay,OutDate,RoomNum,PeopleNum,ContactNum"
				+ ",OrderEmail,HotelName,HotelType,RoomGrade,HotelAdress,OrderUserName) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {order.getUserId(),order.getOrderId(),order.getHotelId(),order.getOrderTime(),order.getOrderMoney(),order.getOrderIsPay(),order.getIsChargeback(),order.getInDate(),order.getOrderDay(),
				order.getOutDate(),order.getRoomNum(),order.getPeopleNum(),order.getContactNum(),order.getOrderEmail(),order.getHotelName(),order.getHotelType(),
				order.getRoomGrade(),order.getHotelAdress(),order.getOrderUserName()};
	
		try {
			int count = runner.update(insertSql,params);
			System.out.println("成功增加"+count+"条订单！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
}
