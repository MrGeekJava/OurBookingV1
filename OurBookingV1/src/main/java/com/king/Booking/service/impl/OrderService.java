package com.king.Booking.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.king.Booking.dao.impl.OrderDaoImpl;
import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.Order;
import com.king.Booking.util.DataSourceUtil;

public class OrderService {

	//调用Dao层的：根据用户ID和是否支付获取订单信息
	public List<Order> getOrderIfmbyUserIdandPay(int UserId,int OrderIsPay){
		OrderDaoImpl orderDao = new OrderDaoImpl();
		List<Order> orders = null;
		try {
			orders = orderDao.queryAllOrderbyOrderIdandPay(UserId,OrderIsPay); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSourceUtil.close();
		}
		return orders;
	}
	
	//调用Dao层的：根据用户ID获取订单信息
		public List<Order> getOrderIfmbyUserId(int UserId){
			OrderDaoImpl orderDao = new OrderDaoImpl();
			List<Order> orders = null;
			try {
				orders = orderDao.queryAllOrderbyOrderId(UserId); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DataSourceUtil.close();
			}
			return orders;
		}
	
	
	
	//调用Dao层的订单插入到数据库的方法
	public void OrderInsertOrderList(Order order) {
		OrderDaoImpl orderInsert = new OrderDaoImpl();
		try {
			orderInsert.orderInsert(order);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSourceUtil.close();

		}
	}
	
	//调用Dao层的酒店信息，根据酒店ID查询
	public Hotel grtHotelByHotelId(int HotelId){
		OrderDaoImpl orderDao = new OrderDaoImpl();
		Hotel hotel = new Hotel();
		try {
			hotel = orderDao.queryAllHotelbyhotelId(HotelId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hotel;
	}
	
	//修改订单状态的方法
	public void updateOrder(int orderId) {
		OrderDaoImpl orderDao = new OrderDaoImpl();
		try {
			orderDao.orderUpdate(orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSourceUtil.close();
		}
	}
	
}
