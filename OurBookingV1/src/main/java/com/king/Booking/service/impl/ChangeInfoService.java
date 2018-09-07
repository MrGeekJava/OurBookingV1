package com.king.Booking.service.impl;

import java.sql.SQLException;

import com.king.Booking.dao.impl.ChangeInfoDao;
import com.king.Booking.util.DataSourceUtil;

public class ChangeInfoService {

	public boolean ChangeUserInfo(String changeName, String changeValue, int userId) {
		boolean isChanged = false;
		try {
			isChanged = new ChangeInfoDao().ChangeUserInfo(changeName, changeValue, userId);
		} catch (SQLException e) {
			isChanged = false;
		} finally {
			DataSourceUtil.close();
		}
		return isChanged;
	};

}
