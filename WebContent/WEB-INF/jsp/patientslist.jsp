<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patients List</title>
</head>
<body>
	<h1> Patients List</h1>
	Id       |     First Name		|		Last Name | <br/>
	----------------------------------------------------<br/>
	
	<c:forEach var="patient" items="${patientsList}">
		${patient.id}	|	${patient.fname}	|	${patient.lname} </br>
	</c:forEach>
	
<br/>
Above should display the list of patients in the system...

<form action="newspringpatient.jsp" method="get">
	<input type="submit" value="Add a new Spring Patient">
</form>

</body>
</html>