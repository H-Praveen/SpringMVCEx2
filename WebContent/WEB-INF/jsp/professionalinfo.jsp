<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professional Info</title>
</head>
<body>
<label>${name }</label><br/>
<label>${dob}</label>
<form action="./professionalinfo" method="post">
<input type="text" name="nm" value="${name }" hidden="true"/>
<input type="text" name="dob" value="${dob }" hidden="true"/>
	<table>
	
	<tr><td>Company name</td><td> <input type="text" id="cmp" name="cmp"/></tr>
	<tr><td>Designation</td><td> <input type="text" id="desg" name="desg"/></tr>
	<tr><td colspan="2"> <button>submit</button></td></tr>
	</table>
</form>
</body>
</html>