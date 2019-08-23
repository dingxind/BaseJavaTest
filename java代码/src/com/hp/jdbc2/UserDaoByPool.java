package com.hp.jdbc2;

public class UserDaoByPool {

	private DBUtil db = new DBUtil();
	
	public User findUser(User user) throws Exception{
		String sql = "select * from user where username = ? and pwd = ?";
		/**
		 * 用于获取一个对象
		 * 1.从数据库中封装的类
		 * 2.要执行的sql语句
		 * 3.要传入的参数。如果没有参数，可以传一个空的Object类型的数组
		 * 返回值是Object类型，由大到小需强制转换
		 * 
		 * 在使用DBUtil工具类的时候，实体类成员变量要和字段名称完全一致，包括大小写，否则差不出数据
		 */
		return (User) db.getObject(User.class, sql, new Object[]{user.getUserName(),user.getPwd()});
	}
	public static void main(String[] args) throws Exception {
		UserDaoByPool udp = new UserDaoByPool();
		User user = new User("zhao","789");
		User user2 = udp.findUser(user);
		System.out.println(user2.getUserName());
	}

}
