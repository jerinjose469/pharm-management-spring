<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit drug</title>
<link rel="stylesheet" type="text/css" href="/mycss/bestyle.css"/>
</head>
<body>
<header class="topnav">
  <a  href="/dashboard">Home</a>
  <a class="active" href="availablestock">Stock</a>
  <a  href="showaddmedicinepage">Add Drug</a>
  <a href="availablestock">Search</a>
  <a href="/">Logout</a>
</header>
<h1><img src="medicos.jpg" width=250px height=100px><b> Pharmacy Management System</b></h1>
<hr><br>

<h2>Edit Drug Details</h2>
<form:form method="POST" action="/editdrug"
		modelAttribute="medicozPojo">
             <table class="tab" >
<tr>
				<td><form:label path="serialnumber">Serial Number</form:label></td>
                <form:hidden path="serialnumber"/>
				<td> ${medicozPojo.serialnumber} </td>
			</tr>
 <tr>
            <th>Drug Name</th>
            <th>Price</th>
            <th>Type</th>
            <th>Quantity</th>
			<th>Expiry Date</th> 
          </tr>
            <tr>
                <td><form:input path="medicinename"/></td> 
                <td><form:input path="price"/></td> 
                <td><form:input path="type"/></td> 
                <td><form:input path="quantity"/></td> 
                <td><form:input path="expdate" /></td>
            </tr>
            <tr>
				<td><input type="submit" value="Register New Drug" /></td>
			</tr>
    </table>
        </form:form>
<footer>
<h6>© Copyright 2020-2021 www.medicoz.com. All rights reserved.
	Developed by Cognizant Training Fresher Team.</h6>
</footer>
</body>
</html>