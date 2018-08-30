package com.king.Booking.bean;

import java.sql.Clob;

/**
 * 酒店实体类
 * @author Mr.Z
 *
 */
public class Hotel {
		private int hotelId;			//酒店ID
		private String hotelName;		//酒店名字
		private Clob hotelPer;		//酒店简介
		private String hotelAdress;		//酒店地址
		private String hotelPicture;		//酒店图片
		private String hotelType;		//酒店类型
		private String onlineTime;		//酒店营业时间
		private float roomGrade;		//酒店评级
		private char isBreakfast;		//酒店是否有早餐
		private String hotelFacilities;		//酒店设施
		private String facilitiesPicture;		//酒店设施图片
		private String checkInTime;		//客人入住时间
		private String leaveTime;		//客人离开时间
		private String pet;		//宠物
		private Clob rePolicy;		//预定政策
		private String chileAndBed;		//儿童和加床
		private char bankCard;		//银行卡
		private String hotelProvince;		//所在省
		private String hotelDowntown;		//所在市
		private String hotelArea;		//所在区
		private double longgitude;		//酒店地标经度
		private double Latitude;		//酒店地标纬度
		public int getHotelId() {
			return hotelId;
		}
		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}
		public String getHotelName() {
			return hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public Clob getHotelPer() {
			return hotelPer;
		}
		public void setHotelPer(Clob hotelPer) {
			this.hotelPer = hotelPer;
		}
		public String getHotelAdress() {
			return hotelAdress;
		}
		public void setHotelAdress(String hotelAdress) {
			this.hotelAdress = hotelAdress;
		}
		public String getHotelPicture() {
			return hotelPicture;
		}
		public void setHotelPicture(String hotelPicture) {
			this.hotelPicture = hotelPicture;
		}
		public String getHotelType() {
			return hotelType;
		}
		public void setHotelType(String hotelType) {
			this.hotelType = hotelType;
		}
		public String getOnlineTime() {
			return onlineTime;
		}
		public void setOnlineTime(String onlineTime) {
			this.onlineTime = onlineTime;
		}
		public float getRoomGrade() {
			return roomGrade;
		}
		public void setRoomGrade(float roomGrade) {
			this.roomGrade = roomGrade;
		}
		public char getIsBreakfast() {
			return isBreakfast;
		}
		public void setIsBreakfast(char isBreakfast) {
			this.isBreakfast = isBreakfast;
		}
		public String getHotelFacilities() {
			return hotelFacilities;
		}
		public void setHotelFacilities(String hotelFacilities) {
			this.hotelFacilities = hotelFacilities;
		}
		public String getFacilitiesPicture() {
			return facilitiesPicture;
		}
		public void setFacilitiesPicture(String facilitiesPicture) {
			this.facilitiesPicture = facilitiesPicture;
		}
		public String getCheckInTime() {
			return checkInTime;
		}
		public void setCheckInTime(String checkInTime) {
			this.checkInTime = checkInTime;
		}
		public String getLeaveTime() {
			return leaveTime;
		}
		public void setLeaveTime(String leaveTime) {
			this.leaveTime = leaveTime;
		}
		public String getPet() {
			return pet;
		}
		public void setPet(String pet) {
			this.pet = pet;
		}
		public Clob getRePolicy() {
			return rePolicy;
		}
		public void setRePolicy(Clob rePolicy) {
			this.rePolicy = rePolicy;
		}
		public String getChileAndBed() {
			return chileAndBed;
		}
		public void setChileAndBed(String chileAndBed) {
			this.chileAndBed = chileAndBed;
		}
		public char getBankCard() {
			return bankCard;
		}
		public void setBankCard(char bankCard) {
			this.bankCard = bankCard;
		}
		public String getHotelProvince() {
			return hotelProvince;
		}
		public void setHotelProvince(String hotelProvince) {
			this.hotelProvince = hotelProvince;
		}
		public String getHotelDowntown() {
			return hotelDowntown;
		}
		public void setHotelDowntown(String hotelDowntown) {
			this.hotelDowntown = hotelDowntown;
		}
		public String getHotelArea() {
			return hotelArea;
		}
		public void setHotelArea(String hotelArea) {
			this.hotelArea = hotelArea;
		}
		public double getLonggitude() {
			return longgitude;
		}
		public void setLonggitude(double longgitude) {
			this.longgitude = longgitude;
		}
		public double getLatitude() {
			return Latitude;
		}
		public void setLatitude(double latitude) {
			Latitude = latitude;
		}
}
