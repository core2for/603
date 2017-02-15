package com.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BasicsDao {
	static protected Connection conn = null;
	ResultSet rs;
	PreparedStatement pstmt;
	public static Connection connection() {
		String url = "jdbc:mysql://localhost/shopping?user=root&password=&characterEncoding=utf-8";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return conn;
	}
}
