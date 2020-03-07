<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h5>  It's Success Page</h5><br/>
Hello, <b> <i>${user} </i></b>.... Reading value from ModelAndView. <br/>
Hello, <b> <i><%= session.getAttribute("user") %> </i></b>.... Reading value from Http Session.  <br/>
</body>
</html>