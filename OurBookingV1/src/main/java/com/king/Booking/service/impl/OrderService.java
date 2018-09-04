package com.king.Booking.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.dao.impl.OrderDaoImpl;
import com.king.Booking.entity.OrderView;

public class OrderService {

	//调用Dao层的：根据用户ID获取订单信息
	public List<OrderView> getOrderIfmbyUserId(String OrderId){
		OrderDaoImpl orderDao = new OrderDaoImpl();
		List<OrderView> orders = null;
		try {
			orders = orderDao.queryAllOrderbyOrderId(OrderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orders;
	}
}
