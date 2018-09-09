package com.king.Booking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.Booking.entity.Hotel;
import com.king.Booking.entity.HotelEva;
import com.king.Booking.entity.HotelSearchHotelView;
import com.king.Booking.entity.HotelSet;
import com.king.Booking.entity.Page;
import com.king.Booking.entity.User;
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
		doPost(request,response);
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
		int currentPage = Integer.parseInt(request.getParameter("currentpage"));
		//行为
		String behavior = request.getParameter("behavior");

		System.out.println("服务器"+behavior);
		String[] searchAdressArray = searchAdress.split("#");
		//searchAdressArray的三个字符串元素有市i，省，国家组成，按照这三个字段去搜索酒店
		Hotel hotel = new Hotel();
		hotel.setHotelProvince(searchAdressArray[1]);
		hotel.setHotelDowntown(searchAdressArray[0]);
		Page page = new Page();
		page.setPageSize(7);
		
		
		//调用service层的
		SearchResultService srService = new SearchResultService();
		//酒店的总记录数
		int hotelCount = srService.getCountService(searchAdressArray[1], searchAdressArray[0]);
				
		page.setTotalCount(hotelCount);
		//用cookie保存酒店page对象
		//创建cookie

		Cookie cookiePage=new Cookie("hotelcount", hotelCount+"");
		Cookie cookieHehavior = new Cookie("behavior",behavior);
		//将创建的cookie写到浏览器中

		response.addCookie(cookiePage);
		response.addCookie(cookieHehavior);
		List<HotelSearchHotelView> hotelReturn = null;
		if("热门推荐".equals(behavior)) {
			
			System.out.println("在热门推荐里面");
			hotelReturn = srService.searchRult(searchAdressArray[1], searchAdressArray[0],(currentPage),7);
		}else if("价格从低到高".equals(behavior)) {
			System.out.println("在价格从低到高里面");
			hotelReturn = srService.searchPrice(searchAdressArray[1], searchAdressArray[0],(currentPage),7);
		}
	
		
		
		List<HotelSet> hotelSetReturn = new ArrayList<HotelSet>();
		HotelSet hotelSet = null;

		
		for(int i = 0;i < hotelReturn.size();i ++) {

			hotelSet = new HotelSet();
			hotelSet.setHotelId(hotelReturn.get(i).getHotelId());
			hotelSet.setHotelPicture(hotelReturn.get(i).getHotelPicture());
			hotelSet.setHotelName(hotelReturn.get(i).getHotelName());
			hotelSet.setHotelType(hotelReturn.get(i).getHotelType());
			hotelSet.setHotelAdress(hotelReturn.get(i).getHotelAdress());
			hotelSet.setHotelPer(hotelReturn.get(i).getHotelPer());
			hotelSet.setHotelProvince(hotelReturn.get(i).getHotelProvince());
			hotelSet.setHotelDowntown(hotelReturn.get(i).getHotelDowntown());
			hotelSet.setHotelArea(hotelReturn.get(i).getHotelArea());
			hotelSet.setRoomMin(hotelReturn.get(i).getRoomMin());
			hotelSet.setSumScore(hotelReturn.get(i).getSumScore());
			hotelSet.setEvaSum(hotelReturn.get(i).getEvaSum());
			int hotelId = hotelReturn.get(i).getHotelId();
			
			List<HotelEva> hotelEvaReturn = srService.searchEva(hotelId);
				if(hotelEvaReturn.size() != 0) {
					hotelSet.setEvalutionId(hotelEvaReturn.get(0).getEvalutionId());
					hotelSet.setCommentWord(hotelEvaReturn.get(0).getCommentWord());
					hotelSet.setUserId(hotelEvaReturn.get(0).getUserId());
					hotelSet.setUserName(hotelEvaReturn.get(0).getUserName());
					hotelSet.setUserCountry(hotelEvaReturn.get(0).getUserCountry());
				}else {
					hotelSet.setEvalutionId(0);
					hotelSet.setCommentWord("");
					hotelSet.setUserId(0);
					hotelSet.setUserName("");
					hotelSet.setUserCountry("");
				}
			
		
			hotelSetReturn.add(hotelSet);
		}
		JSONArray jsonArray = JSONArray.fromObject(hotelSetReturn);
		
		request.getSession(true).setAttribute("Downtown", searchAdressArray[0]);

		out.print(jsonArray);//返回json数组
		out.flush();
		out.close();
		
	}

}
