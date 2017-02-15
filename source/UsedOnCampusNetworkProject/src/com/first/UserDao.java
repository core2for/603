package com.first;

import java.sql.SQLException;

public class UserDao extends BasicsDao{
	public User2 login(User2 user) {
		//用户登录，登录成功返回用户对象，否则返回null
		String sql = "SELECT UserName, UserPassword FROM Users WHERE UserName=? AND UserPassword=?";
		conn = connection();
		//创建PreparedStatement对象
		
		try {
			pstmt=conn.prepareStatement(sql);
			//设置参数
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			//执行查询
			
			rs = pstmt.executeQuery();
			User2 loginUser2 = null;
			if (rs.next()) {
				loginUser2 = new User2();
				loginUser2.setUsername(rs.getString("userName"));
				loginUser2.setPassword(rs.getString("userPassword"));
				//loginUser2.setEmail(rs.getString("email"));
				
			}
			rs.close();
			pstmt.close();
			conn.close();
			return loginUser2;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
