<%@ page language="java" import="java.util.*, com.first.*"  pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("utf-8");
String password = request.getParameter("userpassword");
String username =request.getParameter("username");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/styles.css">

  </head>
  
  <body>
 
<div id="container">
  	<div id="header">
  		<img src="images/logo.gif"/>
  		<hr/>
  	</div>
  	<div id="order">
  		<table>
  			<tr>
	  			<th>订单编号</th>
	  			<th>顾客名称</th>
	  			<th>联系电话</th>
	  			<th>送货地址</th>
	  			<th>下单日期</th>
	  			<th>订单状态</th>
  			</tr>
  			<%
	  			 int currentPage=1;
	  		  	String pageString=request.getParameter("page");
	  		 	 if(pageString!=null){
	  		  		currentPage=Integer.parseInt(pageString);
	  		 	 }
	  			 OrderDao gdao=new OrderDao();
	  		 	 List<Orders> orders=gdao.getGoodsByPage(currentPage, 6);
	  		 	 int pages=gdao.getPages(6);
  			%>
  			<% for(int i=0;i<6;i++) { %>
	  			<tr>
	  				<td><%=orders.get(i).getOrderId() %></td>
	  				<td><%=orders.get(i).getOrderCustomer() %></td>
	  				<td><%=orders.get(i).getOrderPhone() %></td>
	  				<td><%=orders.get(i).getOrderAddress() %></td>
	  				<td><%=orders.get(i).getOrderDate() %></td>
	  				<td><%=orders.get(i).getOrderStatus() %></td>
	  			</tr>
  			<%} %>
  		</table>
  		<% 
		    for(int i=1;i<=pages;i++){
		    	if(i!=currentPage){
		    		out.print("<a href='order.jsp?page="+i+"'>"+ i+"</a>&nbsp;");
		    	}else{
		    		out.print(i+"&nbsp;");
		    	}
		    }
   	 	%>
  	</div>
  	<div id="footer">
  		校园二手街 &copy; 版权所有
  	</div>
 </div>
  </body>
</html>
