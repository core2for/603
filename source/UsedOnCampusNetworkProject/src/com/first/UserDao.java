package com.first;

import java.sql.SQLException;

public class UserDao extends BasicsDao{
	public User2 login(User2 user) {
		//�û���¼����¼�ɹ������û����󣬷��򷵻�null
		String sql = "SELECT UserName, UserPassword FROM Users WHERE UserName=? AND UserPassword=?";
		conn = connection();
		//����PreparedStatement����
		
		try {
			pstmt=conn.prepareStatement(sql);
			//���ò���
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			//ִ�в�ѯ
			
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
