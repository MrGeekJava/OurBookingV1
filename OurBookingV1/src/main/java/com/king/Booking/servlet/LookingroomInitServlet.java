package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.Hotel;
import com.king.Booking.service.impl.LookingRoomInitServiceImpl;

public class LookingroomInitServlet  extends HttpServlet{

	    public LookingroomInitServlet() {
	    	
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
			
			}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			Hotel hotel = new Hotel();
			System.out.println("ok");
			LookingRoomInitServiceImpl lris = new LookingRoomInitServiceImpl();
			hotel = lris.getHotelMessage();
			
			
			
			Cookie c1 = new Cookie("nowHotel","guang_zhou_bai_yun");
			response.addCookie(c1);
		
			
		}


}
