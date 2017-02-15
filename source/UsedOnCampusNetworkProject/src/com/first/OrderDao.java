package com.first;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao extends BasicsDao{
	public List<Orders> getGoodsByPage(int page,int pageSize){
	String sql="SELECT orderId, OrderCustomer, OrderPhone,OrderAddress,OrderDate, OrderStatus FROM Orders LIMIT ?, ?";
	conn = connection();
	
		try {
			pstmt=conn.prepareStatement(sql);
			//设置参数
			pstmt.setInt(1, (page-1)*pageSize);
			pstmt.setInt(2, pageSize);
			//执行查询
			rs=pstmt.executeQuery();
		List<Orders> orders=new ArrayList<Orders>();
		
			while(rs.next()){
				Orders order=new Orders();
				order.setOrderId(rs.getString("OrderId"));
				order.setOrderCustomer(rs.getString("OrderCustomer"));
				order.setOrderPhone(rs.getString("OrderPhone"));
				order.setOrderAddress(rs.getString("OrderAddress"));
				order.setOrderDate(rs.getString("OrderDate"));
				order.setOrderStatus(Integer.parseInt(rs.getString("OrderStatus")));
				orders.add(order);
			}
			rs.close();
			pstmt.close();
			conn.close();
			return orders;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
}
	public int getPages(int pageSize){
			String sql="SELECT COUNT(1) FROM goods";
			conn=connection();
			try {
				pstmt=conn.prepareStatement(sql);
				//执行查询
				rs=pstmt.executeQuery();
				rs.next();
				int count=rs.getInt(1);
				int pages=count/pageSize;
				if(count%pageSize!=0){
					pages++;
				}
				rs.close();
				pstmt.close();
				conn.close();
				return pages;
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return 0;
				}
		}
}
