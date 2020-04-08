<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Stock</title>
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
<hr>
<h2>
 <form:form  name="searchMedicine" method="POST"
		action="/searchbymedicineName" modelAttribute="medicozPojo">
             <table>
			<tr>
				<td><form:label path="medicinename" >Search by Medicine Name :</form:label></td>
				<td><form:input path="medicinename" placeholder="search for drug" /></td>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
        </form:form>Available Stock</h2>
	
 <table class="tab">  
       
		<tr >		    
		    <th>Serial Number</th>        
			<th>Drug Name</th>
            <th>Price</th>
            <th>Type</th>
            <th>Quantity</th>
			<th>Expiry Date</th>
			<th>Action</th>           
		</tr>
		<c:forEach items="${medicozPojoListObj}" var="medicoztable">
        <tr>
				<td>${medicoztable.serialnumber}</td>             
				<td>${medicoztable.medicinename}</td> 
				<td>${medicoztable.price}</td>            
				<td>${medicoztable.type}</td>    
				<td>${medicoztable.quantity}</td> 
				<td>${medicoztable.expdate}</td>          
			    <td>            
	<a href="/showEdit?serialnumber=${medicoztable.serialnumber}">Update drug </a>
              &nbsp;&nbsp;&nbsp;                 
    <a href="/deletedrug?serialnumber=${medicoztable.serialnumber}">Delete drug</a>             
				</td>         
			</tr>
        </c:forEach>

 </table>
 <footer>
<h6>© Copyright 2020-2021 www.medicoz.com. All rights reserved.
	Developed by Cognizant Training Fresher Team.</h6>
</footer>

</body>
</html>