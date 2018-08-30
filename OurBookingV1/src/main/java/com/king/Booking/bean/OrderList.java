package com.king.Booking.bean;
/**
 * 订单表的Bean
 * @author Nier
 *
 */
public class OrderList {
	private int userId;		//用户ID
	private int orderId;	//订单ID
	private int hotelId;	//酒店ID
	private String orderTime;	//订单时间
	private double orderMoney;	//订单总金额
	private int orderIsPay;		//订单是否支付
	private int isChargeback;	//订单是否可以退单
	private String inDate;		//入住日期
	private String outDate;		//退房日期
	private int roomNum;		//订单房间数量
	private String contactNum;	//订房联系人号码
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public double getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(double orderMoney) {
		this.orderMoney = orderMoney;
	}
	public int getOrderIsPay() {
		return orderIsPay;
	}
	public void setOrderIsPay(int orderIsPay) {
		this.orderIsPay = orderIsPay;
	}
	public int getIsChargeback() {
		return isChargeback;
	}
	public void setIsChargeback(int isChargeback) {
		this.isChargeback = isChargeback;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	
	
	
	
	
}
