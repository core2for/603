<%@ page language="java" import="java.util.*, com.first.*" pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("utf-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
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
  	<div id="register">
  		<h1>欢迎注册校园二手街</h1>
  		<div id="regInfo">
  			<p>1.填写注册信息</p>
  			<p>2.注册成功</p>
  		</div>
  		<form method="post" action="handle2.jsp">
  		<table>
  			<tr>
  				<td width="20%"><label for="user">用户名：</label></td>
  				<td width="40%"><input type="text" name="user"></td>
  				<td width="40%"></td>
  			</tr>
  			<tr>
  				<td><label for="password">密码：</label></td>
  				<td><input type="password" id="password" name="password"></td>
  				<td style="font-size:3px; text-align: left; color:#700000">密码至少八位</td>
  			</tr>
  			<tr>
  				<td><label for="confirmPassword">确认密码：</label></td>
  				<td><input type="password"  id="confirmPassword" name="confirmPassword"></td>
  				<td></td>
  			</tr>
  			<tr>
  				<td><label for="email">邮箱：</label></td>
  				<td><input type="text" id="email" name="email"></td>
  				<td style="font-size:3px; text-align: left;">请输入正确的邮箱地址（xxx@xx.xx）</td>
  			</tr>
   			<tr>
  				<td colspan="2" ><input id="button_sub" name="imgbtn" type="image" src="images/button_register.gif" width="143" height="26" border="0"  onclick="tishi()"></td>
  				
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
