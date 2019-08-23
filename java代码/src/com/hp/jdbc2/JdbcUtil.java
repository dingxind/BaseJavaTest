package com.hp.jdbc2;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	private static DataSource dataSource = new ComboPooledDataSource();
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	public static DataSource getDataSource() {
		return dataSource;
	}

	public static Connection getConnection() throws SQLException {
		Connection connection = tl.get();
		if (connection == null) {
			connection = dataSource.getConnection();
		}

		return connection;
	}

	public static void beginTransaction() throws SQLException {
		Connection connection = tl.get();
		if (connection != null) {
			throw new SQLException("已经开启事务，不能重复开启");
		}
		connection = getConnection();
		connection.setAutoCommit(false);
		tl.set(connection);
	}

	public static void commitTransaction() throws SQLException {
		Connection connection = tl.get();
		if (connection == null) {
			throw new SQLException("连接不存在，不能提交事务");
		}
		connection.commit();
		connection.close();
		tl.remove();
	}

	public static void rollbackTransaction() throws SQLException {
		Connection connection = tl.get();
		if (connection == null) {
			throw new SQLException("连接不存在，不能回滚事务");
		}
		connection.rollback();
		connection.close();
		tl.remove();
	}
}
