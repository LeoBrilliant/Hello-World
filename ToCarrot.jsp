<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="jQuery/jquery.mobile-1.3.1.min.css"></link>
<script src="jQuery/jquery-2.0.1.js"></script>
<script src="jQuery/jquery.mobile-1.3.1.min.js"></script>
<title>Dear Carrot</title>
</head>
<body>
${user.userName }, Welcome.
<div data-role="page">
	<div data-role="header" data-theme="b">
		<h1>To Carrot</h1>
	</div> <!-- header -->
	
	<div data-role="content">
		<div data-role="collapsible-set" data-theme="c" data-content-theme="d" data-collapsed-icon="arrow-r" data-expanded-icon="arrow-d">
		    <div data-role="collapsible">
		        <h3>Icon set on the set</h3>
		        <p>Specify the open and close icons on the set to apply it to all the collapsibles within.</p>
			</div>
			<div data-role="collapsible">
			        <h3>Icon set on the set</h3>
			        <p>This collapsible also gets the icon from the set.</p>
			</div>
			<div data-role="collapsible" data-collapsed-icon="gear" data-expanded-icon="delete">
			        <h3>Icon set on this collapsible</h3>
			        <p>The icons here are applied to this collapsible specifically, thus overriding the set icons.</p>
			 </div>
		</div> <!-- collapsible-set -->		
	</div><!-- content -->
	
	<div data-role="footer" data-position="fixed" data-theme="b">
		<h4>LeoBrilliant</h4>
	</div>
</div> <!-- page -->


</body>
</html>