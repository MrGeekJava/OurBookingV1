package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.Room;
import com.king.Booking.service.impl.LookingRoomInitServiceImpl;

public class LookingroomInitServlet  extends HttpServlet{

	    public LookingroomInitServlet() {
	    
	        super();
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
			
			}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			Hotel hotel = new Hotel();
			LookingRoomInitServiceImpl lris = new LookingRoomInitServiceImpl();
			hotel = lris.getHotelMessage();
			
			request.getSession().setAttribute("hotelPer", hotel.getHotelPer());
			
			String hotelProvice = URLEncoder.encode(hotel.getHotelProvince(),"utf-8");
			String hotelDowntown = URLEncoder.encode(hotel.getHotelDowntown(),"utf-8");
			String hotelArea = URLEncoder.encode(hotel.getHotelArea(),"utf-8");
			String hotelType = URLEncoder.encode(hotel.getHotelType(),"utf-8");
			String hotelAdress = URLEncoder.encode(hotel.getHotelAdress(),"utf-8");
			//String hotelPer = URLEncoder.encode(hotel.getHotelPer(),"utf-8");
	
			Cookie c1 = new Cookie("hotelProvice",hotelProvice);
			Cookie c2 = new Cookie("hotelDowntown",hotelDowntown);
			Cookie c3 = new Cookie("hotelArea",hotelArea);
			Cookie c4 = new Cookie("hotelType",hotelType);
			Cookie c5 = new Cookie("hotelAdress",hotelAdress);
			//Cookie c6 = new Cookie("hotelPer",hotelPer);
			
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);
			response.addCookie(c4);
			response.addCookie(c5);
			//response.addCookie(c6);
			
			
			//获取房间信息
			List<Room> rooms = new ArrayList<Room>();
			rooms = lris.getRoomMessage();
			int n = 0;
		
			for(Room room: rooms) {
				String roomType = URLEncoder.encode(room.getRoomType(),"utf-8");				
				String surplusRoomNumber = URLEncoder.encode(String.valueOf(room.getSurplusRoomNumber()),"utf-8");
				String roomPrice = URLEncoder.encode(String.valueOf(room.getRoomPrice()),"utf-8");

				n++;
				if(n == 1){
					c1 = new Cookie("roomType1",roomType);
					c2 = new Cookie("surplusRoomNumber1",surplusRoomNumber);
					c3 = new Cookie("roomPrice1",roomPrice);
				}
			
				if(n == 2){
					c1 = new Cookie("roomType2",roomType);
					c2 = new Cookie("surplusRoomNumber2",surplusRoomNumber);
					c3 = new Cookie("roomPrice2",roomPrice);
				}
			
				if(n == 3){
					c1 = new Cookie("roomType3",roomType);
					c2 = new Cookie("surplusRoomNumber3",surplusRoomNumber);
					c3 = new Cookie("roomPrice3",roomPrice);
				}
				
				if(n == 4){
					c1 = new Cookie("roomType4",roomType);
					c2 = new Cookie("surplusRoomNumber4",surplusRoomNumber);
					c3 = new Cookie("roomPrice4",roomPrice);
				}
				
				
				if(n == 5){
					c1 = new Cookie("roomType5",roomType);
					c2 = new Cookie("surplusRoomNumber5",surplusRoomNumber);
					c3 = new Cookie("roomPrice5",roomPrice);
				}
		
				response.addCookie(c1);
				response.addCookie(c2);
				response.addCookie(c3);				
				
			}
			
			response.sendRedirect("view/looking_room.jsp");
			
		}


}
