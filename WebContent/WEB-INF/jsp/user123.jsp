<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.tocarrot.domain.News" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>User123</title>
</head>
<body>

<div data-role="page">
	<div data-role="header" data-theme="b">
		<h1>Dear Carrot</h1>
	</div> <!-- header -->
	
	<div data-role="content">
		<div data-role="collapsible-set" data-theme="c" data-content-theme="d" data-collapsed-icon="arrow-r" data-expanded-icon="arrow-d">
		    <%
		    	List news = (List)(request.getSession().getAttribute("news"));
		    	for( Iterator it = news.iterator(); it.hasNext(); )
		    	{
		    		News row = (News)it.next();
		    %>
		    	<div data-role="collapsible">
		    		<h3><%=row.getId() + row.getTitle() %></h3>
		    		<p><%=row.getContent() %></p>
		    	</div>
		    <%
		    	}
		    %>
		</div> <!-- collapsible-set -->		
	</div><!-- content -->
	
	<div data-role="footer" data-position="fixed" data-theme="b">
		<h4>LeoBrilliant</h4>
	</div>
</div> <!-- page -->
<%
/*	List news = (List)(request.getSession().getAttribute("news"));
	
	for( Iterator it = news.iterator(); it.hasNext(); )
	{
		News row = (News)it.next();
		System.out.println( row.getId() + "\t" + row.getTitle() + "\t" + row.getContent() );
		out.println( row.getId() + "\t" + row.getTitle() + "\t" + row.getContent() );
	}
*/

%>

<table bgcolor="#9999dd" border="1" width="300">
</table>
</body>
</html>