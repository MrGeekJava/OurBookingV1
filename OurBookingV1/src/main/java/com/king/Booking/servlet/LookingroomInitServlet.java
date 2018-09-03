package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.net.URLEncoder;

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
			
			String hotelProvice = URLEncoder.encode(hotel.getHotelProvince(),"utf-8");
			String hotelDowntown = URLEncoder.encode(hotel.getHotelDowntown(),"utf-8");
			String hotelArea = URLEncoder.encode(hotel.getHotelArea(),"utf-8");
			String hotelType = URLEncoder.encode(hotel.getHotelType(),"utf-8");
			String hotelAdress = URLEncoder.encode(hotel.getHotelAdress(),"utf-8");
			String hotelPer = URLEncoder.encode(hotel.getHotelPer(),"utf-8");
	
			Cookie c1 = new Cookie("hotelProvice",hotelProvice);
			Cookie c2 = new Cookie("hotelDowntown",hotelDowntown);
			Cookie c3 = new Cookie("hotelArea",hotelArea);
			Cookie c4 = new Cookie("hotelType",hotelType);
			Cookie c5 = new Cookie("hotelAdress",hotelAdress);
			Cookie c6 = new Cookie("hotelPer",hotelPer);
			
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);
			response.addCookie(c4);
			response.addCookie(c5);
			response.addCookie(c6);
			
			response.sendRedirect("view/looking_room.jsp");
		
			
		}


}
