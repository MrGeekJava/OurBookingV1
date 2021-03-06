package com.king.Booking.entity;

/**
 * 用户表的Bean类
 * @author Nier
 *
 */
public class User {
	private int userId;     		//用户ID
	private String userSurnme;		//用户姓氏
	private String userName;		//用户名字
	private String userPassword;	//用户密码
	private String userEmail;		//用户邮箱
	private String userPhoneNumber;	//用户电话号码
	private String userCountry;		//用户国家
	private String userPicture;		//用户头像
	private String userNickName;	//用户昵称
	private String userBirthday;	//用户生日
	private String userSex;			//用户性别
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserSurnme() {
		return userSurnme;
	}
	public void setUserSurnme(String userSurnme) {
		this.userSurnme = userSurnme;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserPicture() {
		return userPicture;
	}
	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
}
