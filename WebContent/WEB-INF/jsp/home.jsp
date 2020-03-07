<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
Hello, <b> <i>${user} </i></b>.... Reading value from ModelAndView. <br/>
Hello, <b> <i><%= session.getAttribute("user") %> </i></b>.... Reading value from Http Session. <br/>
To check Success page <a href="./showregistration"> click here</a>
</body>
</html>