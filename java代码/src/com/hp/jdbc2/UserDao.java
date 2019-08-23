package com.hp.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {

	/**
	 * @param user 包含用户名和密码
	 * @return
	 * @throws SQLException
	 */
	public User findUser(User user) throws SQLException{
		/**
		 * 1.加载驱动（DBUtilDIY中已经加载）
		 * 2.获取数据库连接--通过工具类获取
		 * 3.构造sql语句
		 * 4.创建执行对象
		 * 5.获取结果集
		 * 6.关闭资源
		 */
		Connection conn = DBUtilDIY.getConnection();
		String sql = "select * from user where username = ? and pwd =?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPwd());
		//executeQuery--执行对象执行查询语句
		ResultSet rs = pstmt.executeQuery();
		User user2 = null;
		/**
		 * 把数据库表中的记录转换成java对象--查询
		 * 把Java对象转换成数据库表中的记录--增删改
		 */
		while(rs.next()){
			//如果进入循环，表示有查询结果
			user2 = new User();
			//Java里的字符串是String类型，存储在数据库表中的字符串是varchar类型
			user2.setUserName(rs.getString("username"));
			user2.setPwd(rs.getString("pwd"));
			//如果是登录，用户名是唯一的，即可退出循环
			break;
		}
		DBUtilDIY.closeConnection(rs, pstmt, conn);
		return user2;
	}
	
	public User findUserByState(User user) throws SQLException{
		Connection conn = DBUtilDIY.getConnection();
		String sql = "SELECT * FROM user where username ='" + user.getUserName() +"' and pwd = '" + user.getPwd()+"'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		User user2 = null;
		while(rs.next()){
			user2 = new User();
			user2.setUserName(rs.getString("username"));
			user2.setPwd(rs.getString("pwd"));
			break;
		}
		DBUtilDIY.closeConnection(rs, st, conn);
		return user2;
	}
	
	/**
	 * 往数据库表中添加一条记录
	 * @param user
	 * @throws SQLException 
	 */
	public void addUser(User user) throws SQLException{
		Connection conn = DBUtilDIY.getConnection();
		String sql = "insert into user values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPwd());
		//增加，更新，删除都用这个方法
		pstmt.executeUpdate();
		DBUtilDIY.closeConnection(null, pstmt, conn);
	}
	
	public static void main(String[] args) throws SQLException {
//		User user = new User("yang","123");
//		UserDao ud = new UserDao();
//		User user2 = ud.findUser(user);
//		System.out.println(user2.getUserName());
//		
//		User user3 = new User("zhao","789");
//		ud.addUser(user3);
		
		User user = new User("wang","' or '1' = '1");
		UserDao ud = new UserDao();
//		User user2 = ud.findUserByState(user);
//		System.out.println(user2);
		User user2 = ud.findUser(user);
		System.out.println(user2);
	}

}
