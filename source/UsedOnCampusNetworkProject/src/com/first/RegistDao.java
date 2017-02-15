package com.first;

import java.sql.SQLException;

public class RegistDao extends BasicsDao{
	public void regist(Regist regist) {
		String sql = "INSERT INTO Users(UserName, UserPassword, UserEmail) VALUES(?,?,?)";
		conn = connection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, regist.getUsername());
			pstmt.setString(2, regist.getPassword());
			pstmt.setString(3, regist.getEmail());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
