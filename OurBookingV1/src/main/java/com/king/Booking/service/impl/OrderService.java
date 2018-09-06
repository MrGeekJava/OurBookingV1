package com.king.Booking.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.dao.impl.OrderDaoImpl;
import com.king.Booking.entity.Order;
import com.king.Booking.entity.OrderView;

public class OrderService {

	//调用Dao层的：根据用户ID获取订单信息
	public List<Order> getOrderIfmbyUserId(String UserId){
		OrderDaoImpl orderDao = new OrderDaoImpl();
		List<Order> orders = null;
		try {
			orders = orderDao.queryAllOrderbyOrderId(UserId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orders;
	}
	
	//调用Dao层的订单插入到数据库的方法
	public void OrderInsertOrderList(Order order) {
		OrderDaoImpl orderInsert = new OrderDaoImpl();
		orderInsert.orderInsert(order);
	}
	
	
}
