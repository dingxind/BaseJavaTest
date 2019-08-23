package com.hp.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserDao {
	DBUtil db = new DBUtil();
	/**
	 * 使用PrepareStatment查询，防止sql注入
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	public User findUserByPreInfo(User user) throws Exception{
		String sql = "SELECT * FROM user where username =? and pwd = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPwd());
		ResultSet rs = pstmt.executeQuery();
		User user2 = null;
		while(rs.next()){
			user2 = new User();
			user2.setUserName(rs.getString("username"));
			user2.setPwd(rs.getString("pwd"));
			break;
		}
		return user2;
	}
	
	public User findUserByPreInfo2(User user) throws Exception{
		String sql = "SELECT * FROM user where username =? and pwd = ?";
		User user2 = (User) db.getObject(User.class, sql, new Object[]{user.getUserName(),user.getPwd()});
		return user2;
	}
	
	public User findUserByStaInfo(User user) throws Exception{
		String sql = "SELECT * FROM user where username ='" + user.getUserName() +"' and pwd = '" + user.getPwd()+"'";
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		User user2 = null;
		while(rs.next()){
			user2 = new User();
			user2.setUserName(rs.getString("username"));
			user2.setPwd(rs.getString("pwd"));
			break;
		}
		return user2;
	}
	
	public Course findCourseById(int id) throws Exception{
		String sql = "select * from course where courseId = ?";
		Course c = (Course) db.getObject(Course.class, sql, new Object[]{id});
		return c;
	}
	
	public static void main(String[] args) throws Exception {
//		User user = new User("zhao","' or '1' = '1");
		User user = new User("yang","123");
		UserDao ud = new UserDao();
//		User PreResult = ud.findUserByPreInfo(user);
//		User StResult = ud.findUserByStaInfo(user);
//		System.out.println("PreResult:"+PreResult);
//		System.out.println("StResult:"+StResult);
//		
//		User tool = ud.findUserByPreInfo2(user);
//		System.out.println("tool:"+tool);
		
		Course c = ud.findCourseById(1);
		System.out.println(c.getCourseName());
	}
}
