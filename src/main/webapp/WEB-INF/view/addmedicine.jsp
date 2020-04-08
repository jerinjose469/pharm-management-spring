<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Medicine</title>
<link rel="stylesheet" type="text/css" href="/mycss/bestyle.css"/>
</head>
<body>
<header class="topnav">
  <a  href="/dashboard">Home</a>
  <a href="availablestock">Stock</a>
  <a class="active" href="showaddmedicinepage">Add Drug</a>
  <a href="availablestock">Search</a>
  <a href="/">Logout</a>
</header>
<h1><img src="medicos.jpg" width=250px height=100px><b> Pharmacy Management System</b></h1><hr>
<br>
    <h2>Add New Drug</h2>
<form:form method="POST" action="/addmedicine"
 modelAttribute="medicozPojo" target="_blank">
        
             <table class="tab" border="2" cellpadding="10">
          <tr >
            <th>Drug Name</th>
            <th>Price</th>
            <th>Type</th>
            <th>Quantity</th>
			<th>Expiry Date</th> 
          </tr>
            <tr>
                <td><form:input path="medicinename" required="true"/></td> 
                <td><form:input path="price"  required="true"/></td> 
                <td><form:input path="type" required="true"/></td> 
                <td><form:input path="quantity" type="number" required="true"/></td> 
                <td><form:input path="expdate"  required="true" /></td>
            </tr>
        </table>
        
        <input type="submit" value="ADD NEW MEDICINE" />
        </form:form>
<footer>
<h6>© Copyright 2020-2021 www.medicoz.com. All rights reserved.
	Developed by Cognizant Training Fresher Team.</h6>
</footer>
</body>
</html>