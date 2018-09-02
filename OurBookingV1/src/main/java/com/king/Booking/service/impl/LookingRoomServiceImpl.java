package com.king.Booking.service.impl;

import com.king.Booking.dao.impl.LookingRoomDaoImpl;
import com.king.Booking.entity.CommentView;

public class LookingRoomServiceImpl {
		public CommentView footComment(int n) {
			CommentView cv = new CommentView();
			LookingRoomDaoImpl lrd = new LookingRoomDaoImpl();
			cv = lrd.footComment(n);
			return cv;
		}
}
