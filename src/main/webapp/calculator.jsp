<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator Page</title>
</head>
<body>
	<form action="calc" method="post">
	
		<h1>Basic Calc</h1>
	
		First Number : <input type="number" name="tbFn"/>
		<br/>
	    Second Number : <input type="number" name="tbSn"/>
		<br/>
	   <input type="submit" name="btnAdd" value="add"/>
	   <input type="submit" name="btnSub" value="sub"/>
	   <input type="submit" name="btnMulti" value="multi"/>
	   <input type="submit" name="btnDiv" value="div"/>
	</form>
</body>
</html>