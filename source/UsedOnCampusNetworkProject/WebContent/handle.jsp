<%@ page language="java" contentType="text/html; charset=utf-8" import="com.first.*"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String password = request.getParameter("userpassword");
String username =request.getParameter("username");
UserDao dao = new UserDao();
User2 user = new User2(username, password);
User2 loginUser = dao.login(user);
%>
<%
String message = "没有此用户";
boolean flag = false, flag2= false;
if (username == "") {
	message = "用户名不能为空！";
}else if(password == "") {
	 message = "密码不能为空！";
} else {
	flag = true;
}
%>
<script type="text/javascript">
alert("<%=message%>");                                            // 弹出错误信息
</script>
<% 
		if (loginUser != null) {
			  response.sendRedirect("order.jsp");
		}
	response.setHeader("Refresh", "0, URL=index.jsp");	//在有响应的页面合适
%>
</body>
</html>