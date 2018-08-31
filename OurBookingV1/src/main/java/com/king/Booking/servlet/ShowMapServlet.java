package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.HotelView;
import com.king.Booking.service.impl.MapServiceImpl;

import net.sf.json.JSONArray;

/**
 * 地图窗口的Servlet
 * @author Mr.Z
 *
 */
public class ShowMapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public ShowMapServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String destination = request.getParameter("destination");
		
		List<HotelView> hotels = null;
		hotels = new MapServiceImpl().queryHotelsToMap(destination);
        
		JSONArray jsonArray=JSONArray.fromObject(hotels);

		out.print(jsonArray);//返回json数组
		out.flush();
		out.close();
		
	}

}
