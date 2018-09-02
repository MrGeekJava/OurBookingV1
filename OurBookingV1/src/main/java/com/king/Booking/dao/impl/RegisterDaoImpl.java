package com.king.Booking.dao.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.king.Booking.entity.User;
import com.king.Booking.util.DataSourceUtil;

public class RegisterDaoImpl{
	
	//用户登录
	public User userLogin(User user) {
		String userEmail =user.getUserEmail();
		String userPassword = user.getUserPassword();
		User user2 = null;
		
		QueryRunner runner = new QueryRunner();
		Connection conn;
		try {
			conn = DataSourceUtil.getConnection();
			/**
			 * 判断是手机号还是邮箱
			 */
			String sql = "";
			List<User> userQuery=null ;
			boolean result = checkPhone(userEmail);
			if(result==true) {
				sql = "select * from UserList where UserPhoneNumber =?";
				Object[] params = {userEmail};
				userQuery = runner.query(conn, sql,new BeanListHandler<User>(User.class), params);

			}else {
				sql = "select * from UserList where UserEmail =?";
				Object[] params = {userEmail};
				 userQuery = runner.query(conn, sql,new BeanListHandler<User>(User.class), params);
			}
	

			for(User user1:userQuery) {
				String name = user1.getUserName();
				user2= user1;
			}
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return user2;
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public boolean UserRegister(User user) throws SQLException {
		String userEmail =user.getUserEmail();//拿到的是输入框架的用户名
		String userPassword = user.getUserPassword();
		boolean registerRes = false;//用来判断是否可以注册
		int num = (int)(Math.random() * 1000000);
		QueryRunner runner = new QueryRunner();
		Connection conn;	
			conn = DataSourceUtil.getConnection();
			/**
			 * 判断是手机号还是邮箱
			 */
			String sql = "";
			List<User> userQuery=null ;
			boolean Phoneresult = checkPhone(userEmail);
			boolean Emailresult = checkEmail(userEmail);
			if(Phoneresult==true) {			
				System.out.println("Dao注册的用户是手机号！");
				sql = "select * from UserList where UserPhoneNumber =?";
				Object[] params = {userEmail};
				userQuery = runner.query(conn, sql,new BeanListHandler<User>(User.class), params);
				if(userQuery==null) {
					//代表有记录
					//不能注册
					registerRes = false;
				}else {				
					//用用户输入的手机号码注册
					runner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByXML());
					String inSql = "insert into UserList(UserId,UserPassword,UserPhoneNumber) values(?,?,?)";

					Object[] result = {num,userPassword,userEmail};
					
					int  count = runner.update(inSql,result);
					System.out.println("插入"+count+"条数据成功！");
					registerRes = true;
				}
				
			} 
			if(Emailresult==true){
				System.out.println("Dao注册的用户是邮箱号！");
				sql = "select * from UserList where UserEmail =?";
				Object[] params = {userEmail};
				 userQuery = runner.query(conn, sql,new BeanListHandler<User>(User.class), params);
				 if(userQuery==null) {
						//代表有记录
						//不能注册
					 System.out.println("数据库有记录不能注册");
						registerRes = false;

					}else {		
						//用用户输入的邮箱号码注册
						String inSql = "insert into UserList(UserId,UserPassword,UserEmail) values(?,?,?)";
						runner = new QueryRunner(DataSourceUtil.getDataSourceWithC3P0ByXML());
							
						Object[] result = {num,userPassword,userEmail};
						int  count = runner.update(inSql,result);
						System.out.println("插入"+count+"条数据成功！");				
						registerRes = true;
					}
			}

			if(registerRes==false) {
				System.out.println("注册失败!");
			}

		
		
		return registerRes;
	}
	
	
	
	
	/**
	 * 验证手机号码
	 */
	public  boolean checkPhone(String str) {
	    Pattern p = null;
	    Matcher m = null;
	    boolean b = false;
	    p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); 
	    // 验证手机号
	    m = p.matcher(str);
	    b = m.matches();
	    return b;
	}
	/***
	 * 验证邮箱
	 */
	public  boolean checkEmail(String email){
	    Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
	    Matcher matcher = pattern.matcher(email);
	    return matcher.matches();
	}

	
	
}
