<%@page import="com.sun.webkit.ContextMenu.ShowContext, javax.swing.*" %>
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
			String username2 = request.getParameter("user");
  			String password2 = request.getParameter("password");
  			String comfirmPassword = request.getParameter("confirmPassword");
  	          	String email = request.getParameter("email");
  	/* 		if(password2.length() < 7 ) {
  				JOptionPane.showMessageDialog(null, "密码不能小于八位", "警告", JOptionPane.ERROR_MESSAGE);
  				//response.sendRedirect("register.jsp");
  			}
  			else if (!password2.equals(comfirmPassword)) {
  				Object[] options = { "OK", "CANCEL" }; 
  				JOptionPane.showOptionDialog(null, "两次密码不一致", "警告", 
  				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, 
  				null, options, options[0]); 
 			
  				response.sendRedirect("register.jsp");
  	        }else{  
     		Regist regist = new Regist(username2, password2, email);
     			RegistDao dao2 = new RegistDao();
     			dao2.regist(regist);		//调用regist插入用户数据
     			response.sendRedirect("index.jsp");
  			} */
  			
%>
<%
String message = "";
boolean flag1 = false;
boolean flag2 = false;
boolean flag3 = true;
	for (int i = 0; i < email.length(); i++) {
		if (email.charAt(i) == '@') {
			flag1 = true;
		}		
		if (email.charAt(i) == '.') {
			flag2 = true;
		}
	}
	if (!(flag1 && flag2)) {
		message = "邮箱地址格式不正确！";
		flag3 = false;
	}
%>
<%
boolean flag = true;
if (!password2.equals(comfirmPassword)) {
	message = "两次密码不一致";
	flag = false;
}else if(password2.length() / 7 == 0) {
	 message = "密码至少八位";
	 flag = false;
}
%>
<script type="text/javascript">
alert("<%=message%>");                                            // 弹出错误信息
</script>
<% 
if (flag && flag3) {
	Regist regist = new Regist(username2, password2, email);
	RegistDao dao2 = new RegistDao();
	dao2.regist(regist);		//调用regist插入用户数据
	response.sendRedirect("index.jsp");
} else {
	response.setHeader("Refresh", "0, URL=register.jsp");
}
%>

</body>
</html>