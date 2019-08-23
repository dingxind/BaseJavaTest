package com.hp.jdbc;

import java.sql.SQLException;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class UserDao2 {
	QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	//转驼峰式
	BeanProcessor bean = new GenerousBeanProcessor();
	RowProcessor processor = new BasicRowProcessor(bean);
	public Course findCourseById(int id) throws Exception{
		String sql = "select * from course where course_id = ?";
		Object[] params = {id};
		Course course = null;
		try {
			course = (Course) qr.query(sql, new BeanHandler<Course>(Course.class,processor), params);
		} catch (SQLException e) {
		}
		return course;
	}
	public static void main(String[] args) throws Exception {
		UserDao2 ud = new UserDao2();
		Course c = ud.findCourseById(1);
		System.out.println(c.getCourseName());
	}
}
