<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="jQuery/jquery-2.0.1.js"></script>
<link rel="stylesheet" href="jQuery/jquery.mobile-1.3.1.min.css"></link>
<script src="jQuery/jquery.mobile-1.3.1.min.js"></script>
<title>ToCarrot</title>
</head>
<body>
<div data-role="page">
	<div data-role="header" data-theme="b">
		<h1>To Carrot</h1>
	</div> <!-- header -->
	
	<div data-role="content">
		<c:if test="${!empty error }">
			<font color="red"><c:out value="${error }" /></font>
		</c:if>
		<form action="loginCheck.html" method="post">
			UserName:
			<input type="text" name="userName">
			<br>
			Password:
			<input type="password" name="password">
			<br>
			<!-- 
			<input type="submit" value="Login" />
			<input type="reset" value="Reset" />
			 -->
			 <a href="#" data-role="button" data-inline="true">Login</a>
			 <!-- 
			 <a href="#" data-role="button" data-inline="true">Reset</a>
			  -->
			 <input type="submit" value="Submit" data-inline="true" data-theme="b">
		</form>
	</div><!-- content -->
	
	<div data-role="footer" data-position="fixed" data-theme="b">
		<h4>LeoBrilliant</h4>
	</div>
</div> <!-- page -->
</body>
</html>