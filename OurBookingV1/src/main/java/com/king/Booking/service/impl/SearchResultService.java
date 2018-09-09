package com.king.Booking.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.king.Booking.dao.impl.SearchResultDaoImpl;
import com.king.Booking.entity.AutoComplete;
import com.king.Booking.entity.HotelEva;
import com.king.Booking.entity.HotelSearchHotelView;
import com.king.Booking.util.DataSourceUtil;

public class SearchResultService {
	
		////通过地址（省，市调用dao等的相关方法
		public List<HotelSearchHotelView> searchRult(String province,String downtown,int currentPage,int pageSize){
			System.out.println("SearchResultService");
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<HotelSearchHotelView> searchRult = null;
			try {
				searchRult = srdImpl.HotelSearchByAdress(province, downtown,currentPage,pageSize);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DataSourceUtil.close();
			}
			return searchRult;
			
		}
		
		//通过点击价格从低到高执行此方法
		public List<HotelSearchHotelView> searchPrice(String province,String downtown,int currentPage,int pageSize){
			System.out.println("SearchResultService");
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<HotelSearchHotelView> searchRult = null;
			try {
				
				searchRult = srdImpl.HotelSortByPrice(province, downtown,currentPage,pageSize);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DataSourceUtil.close();
			}
			return searchRult;
		}
		
		//通过酒店Id来查询用户评论
		public List<HotelEva> searchEva(int hotelId){
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<HotelEva> hotelEva = null;
			try {
				hotelEva = srdImpl.HotelEvaByHotelId(hotelId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DataSourceUtil.close();
			}
			return hotelEva;
			
		}
		//通过地址查询酒店的总记录数
		public int getCountService(String province, String downtown) {
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			int sum = 0;
			try {
				sum = srdImpl.getHotelCount(province,downtown);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DataSourceUtil.close();
			}
			return sum;
			
		}
		
		//通过部分地址模糊查询
		//把dao层查询的所有的地址拼接为一个字符串
		public String getAutoCompleteService(String address){
			SearchResultDaoImpl srdImpl = new SearchResultDaoImpl();
			List<AutoComplete> autoCompleteList = null;
			try {
				autoCompleteList = srdImpl.getAutoComplete(address);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DataSourceUtil.close();
			}
			String res = "";
			for(int i = 0;i < autoCompleteList.size();i ++) {
				if(i > 0) {
					res += "#"+autoCompleteList.get(i).getAutoAddress();
				}else {
					res += autoCompleteList.get(i).getAutoAddress();
				}
			}
			return res;
			
		}
}
