package com.king.Booking.entity;

/**
 * 搜索酒店Bean类
 * @author Nier
 *
 */
public class SearchHotel {
	private int hotelId;		//酒店ID（外键） 
	private double roomMin;		//房间最低价
	private int roomRating;		//住宿评级（0无评级、1实惠型、2经济型、3舒适型、4豪华型、5尊贵型）
	private String leisureEntertainment;	//休闲乐活
	private int roomQuantity;	//是否有剩余房量（0否、1是）
	private int discount;		//是否有折扣优惠（0否、1是）
	private int frontDesk;		//是否24小时前台（0否、1是）
	private int cancelPrepay;	//取消和预付（0无、1免费取消、2预付无需信用卡、3无需预付）
	private int mealDinner;		//餐点（1含早餐、2含早餐和晚餐、3不含早餐）
	private int roomType;		//住宿类型（1酒店、2青旅、3民宿、4公寓、5旅馆）
	private int rating;			//评分(9好极了、8非常好、7好、6令人愉悦、0~5无评分)
	private int chainHotels;	//连锁酒店连锁酒店(0无、1如家快捷、2如家精选、3汉庭、4七天、5格林联盟、6格林豪泰、7全季、8锦江之星)
	private int searchHotelId;	//搜索酒店ID（主键）
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public double getRoomMin() {
		return roomMin;
	}
	public void setRoomMin(double roomMin) {
		this.roomMin = roomMin;
	}
	public int getRoomRating() {
		return roomRating;
	}
	public void setRoomRating(int roomRating) {
		this.roomRating = roomRating;
	}
	public String getLeisureEntertainment() {
		return leisureEntertainment;
	}
	public void setLeisureEntertainment(String leisureEntertainment) {
		this.leisureEntertainment = leisureEntertainment;
	}
	public int getRoomQuantity() {
		return roomQuantity;
	}
	public void setRoomQuantity(int roomQuantity) {
		this.roomQuantity = roomQuantity;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getFrontDesk() {
		return frontDesk;
	}
	public void setFrontDesk(int frontDesk) {
		this.frontDesk = frontDesk;
	}
	public int getCancelPrepay() {
		return cancelPrepay;
	}
	public void setCancelPrepay(int cancelPrepay) {
		this.cancelPrepay = cancelPrepay;
	}
	public int getMealDinner() {
		return mealDinner;
	}
	public void setMealDinner(int mealDinner) {
		this.mealDinner = mealDinner;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getChainHotels() {
		return chainHotels;
	}
	public void setChainHotels(int chainHotels) {
		this.chainHotels = chainHotels;
	}
	public int getSearchHotelId() {
		return searchHotelId;
	}
	public void setSearchHotelId(int searchHotelId) {
		this.searchHotelId = searchHotelId;
	}
}
