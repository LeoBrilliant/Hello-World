<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>测试测试测试</title>
</head>
<body>
${user.userName }, Welcome back.
<h1>Page Hello!</h1>
<br />
<%out.println( new java.util.Date()); %>

<%
Class.forName("com.mysql.jdbc.Driver");

Connection conn = DriverManager.getConnection( 
		"jdbc:mysql://localhost:3306/mysql", "root", "111111");

Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery("select host, user, password from user");

%>

<table bgcolor="#9999dd" border="1" width="300">
<% while( rs.next())
{
%>
	<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
	</tr>
<%}
%>
</table>
</body>
</html>