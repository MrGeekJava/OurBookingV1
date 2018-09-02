package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.HotelSearchHotelView;
import com.king.Booking.entity.User;
import com.king.Booking.service.impl.RegisterServiceImpl;
import com.king.Booking.service.impl.SearchResultService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class searchResult
 */
public class SearchResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置字符串为utf-8
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		System.out.println("luozhyaun");
		
		PrintWriter out = response.getWriter();
		
		//获取地址详细详细信息，用,分割成字符数组
		String searchAdress = request.getParameter("searchadress");
		String[] searchAdressArray = searchAdress.split(",");
		//searchAdressArray的三个字符串元素有市i，省，国家组成，按照这三个字段去搜索酒店
		Hotel hotel = new Hotel();
		hotel.setHotelProvince(searchAdressArray[1]);
		hotel.setHotelDowntown(searchAdressArray[0]);
		
		//调用service层的
		SearchResultService srService = new SearchResultService();
		List<HotelSearchHotelView> hotelReturn = srService.searchRult(searchAdressArray[1], searchAdressArray[0]);
		
		System.out.println(hotelReturn.size());
		
	
//		System.out.println(hotelReturn.size());
		//将结果返回到前端页面jsp
		
//		List集合转换成json代码 List list = new ArrayList(); list.add( "first" ); list.add( "second" ); 
//		JSONArray jsonArray2 = JSONArray.fromObject( list );
		JSONArray json = JSONArray.fromObject(hotelReturn);
		
		
//		JSONObject json = new JSONObject();
//		json.put("hotelSearchReturn", hotelReturn);
		out.print(json);
		
		System.out.println("最后结果");
//		for(int i = 0;i < hotelReturn.size();i ++) {
//			json.put("hotelSearchReturn", hotelReturn);
//			out.print(json);
//			System.out.println("传入前端页面");
//		}
//		
		
		
		
		
				
//		String userEmail = request.getParameter("Email");
//		String userPassword = request.getParameter("password");
//		
//		User user = new User();
//		user.setUserEmail(userEmail);
//		user.setUserPassword(userPassword);
//		
//		RegisterServiceImpl rs = new RegisterServiceImpl();
//		User userReturn = rs.Register(user);
//		
//				
//			JSONObject json = new JSONObject();
//			json.put("user", userReturn);
//			out.print(json);
		
		
		
		
	}

}
