package com.hp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 让Java程序知道要连接哪个数据库
 * 连接数据库需要的三个条件：地址：用户名，密码
 * @author HP
 *
 */
public class DBUtilDIY {
	private static final String URL = "jdbc:mysql://localhost:3306/bd4";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	//可以使用静态块加载驱动，当加载这个类的时候会执行静态块
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
		}
		return conn;
	}
	
	public static void closeConnection(ResultSet rs,Statement pstmt, Connection conn){
//		if(rs != null){
//			try {
//				rs.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		if(pstmt != null){
//			try {
//				pstmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		if(conn != null){
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		try{
			if(rs != null)
				rs.close();
			if(pstmt != null)
				pstmt.close();
			if(conn != null)
				conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
