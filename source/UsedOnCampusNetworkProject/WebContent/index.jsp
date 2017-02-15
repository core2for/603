<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>校园二手街</title>
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
  	<div id="login">
  		<h1>用户登录</h1>
  		<hr/>
  		<form method="post" action="handle.jsp">
  			<table>
  				<tr>
  					<td width="20%" ><label for="user">用户名：</label></td>
  					<td width="40%"><input type="text" id="user" name="username"/></td>
  					<td width="40%"></td>
  				</tr>
  				<tr>
  					<td><label for="password">密码：</label></td>
  					<td><input type="password" id="password" name="userpassword"/></td>
  					<td></td>
  				</tr>
  				<tr>
  					<td colspan="2">
  						<input type="image" src="images/button_login.gif"/>&nbsp;
  						<a href="register.jsp"><img src="images/button_register.gif"/></a>
  					</td>
  				</tr>
  			</table>
  		</form>
  			
  	</div>
  	<div id="footer">
  		校园二手街 &copy; 版权所有
  	</div>
  	
  </div>
  </body>
</html>
