<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2> ${greetingsFine} </h2>
	
<form action="patientslist.jsp" method="GET">
	<input type="submit" value="Get Patients List "/>
</form>

<form action="newspringpatient.jsp" method="get">
	<input type="submit" value="Add a new Spring Patient">
</form>

<a href="index.jsp"> Thanks a lot </a>
</body>
</html>