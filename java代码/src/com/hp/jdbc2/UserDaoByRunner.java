package com.hp.jdbc2;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 * 使用QueryRunner时使用的是c3p0-config.xml配置文件
 * @author HP
 *
 */
public class UserDaoByRunner {
	private QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	
	public User findUser(User user) throws SQLException{
		String sql = "select * from user where username = ? and pwd = ?";
		return qr.query(sql, new BeanHandler<User>(User.class), new Object[]{user.getUserName(),user.getPwd()});
	}
	
	/**
	 * 查询所有的用户
	 * @return
	 * @throws SQLException 
	 */
	public List<User> findAllUsers() throws SQLException{
		String sql = "select * from user";
		return qr.query(sql, new BeanListHandler<User>(User.class), new Object[]{});
	}
	
	public static void main(String[] args) throws SQLException {
		UserDaoByRunner udr = new UserDaoByRunner();
		User user = new User("zhao","789");
		User user2 = udr.findUser(user);
		System.out.println(user2.getUserName());
		
		List<User> userList = udr.findAllUsers();
		System.out.println(userList.size());
	}

}
