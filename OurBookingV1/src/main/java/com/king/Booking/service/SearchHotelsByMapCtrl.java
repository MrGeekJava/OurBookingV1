package com.king.Booking.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过地图查询酒店
 * 1.显示所有已经过第一次筛选的酒店，保存为酒店List对象，动态加载地图页面
 * 2.用户每点击一次左侧筛选栏，获取点击的字段，匹配已保存的视图里的酒店，保存为酒店List对象，动态加载匹配地图页面
 * 3.用户点击中间筛选栏重新排序，获取排序方式，遍历酒店List对象，重新排序显示（异步加载）
 * 4.用户点击地图生成的坐标点，显示对应酒店信息。
 * 5.用户点击一个酒店，跳转到该酒店页面。
 * 6.测试测试
 * @author Mr.Z
 *
 */
public class SearchHotelsByMapCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
