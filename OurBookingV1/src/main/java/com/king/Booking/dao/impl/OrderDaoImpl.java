package com.king.Booking.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.king.Booking.dao.interfaces.OrderDao;
import com.king.Booking.entity.OrderView;
import com.king.Booking.util.DataSourceUtil;

public class OrderDaoImpl implements OrderDao{
	
//	查询所有该用户的订单根据订单号来查询
	public List<OrderView> queryAllOrderbyOrderId(String OrderId) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection conn = DataSourceUtil.getConnection();
		String sql = "select * from order_view where OrderId=?";
		Object[] params = {OrderId};
		List<OrderView> mapOrders = new ArrayList<OrderView>();
		mapOrders = runner.query(conn, sql, new BeanListHandler<OrderView>(OrderView.class), params);
		return mapOrders;
	}
	
	
	
}
