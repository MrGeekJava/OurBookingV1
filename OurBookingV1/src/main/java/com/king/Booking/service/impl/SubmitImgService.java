package com.king.Booking.service.impl;

import java.sql.SQLException;

import com.king.Booking.dao.impl.SubmitImgDaoImpl;
import com.king.Booking.util.DataSourceUtil;

public class SubmitImgService {
	
	public boolean SaveHead(String imgURL, int userId) {
		
		boolean isSaved;
		try {
			isSaved = new SubmitImgDaoImpl().saveHead(imgURL, userId);
		} catch (SQLException e) {
			isSaved = false;
		} finally {
			DataSourceUtil.close();
		}
		return isSaved;
	}

}
