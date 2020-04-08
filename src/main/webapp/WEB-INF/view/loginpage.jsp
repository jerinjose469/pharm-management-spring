<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>

<link rel="stylesheet" type="text/css" href="/mycss/bestyle.css">
<!-- <script src="/js/script.js"></script> -->
</head>
<body class="loginpage">
<header class="topnav">
  <a  href="/" >MEDICOS</a>
  <a class="active" href="loginpage" >ADMIN-LOGIN</a>
</header>
<img src="medicos.jpg"  width="300" height="100" style="padding-left:140px;">
<h4 style="padding-left:200px;"><img src="adminpic.jpg"  width="150" height="90""></h4>
            
    <form:form name="loginpage"
			onsubmit="return validateLoginForm()"
			method="POST" action="/registeradmin"
         modelAttribute="medicozLoginPojo" target="_blank">
             <table class="loginpage_table">
            <tr>
     
                <td><form:label path="username"><font size=6px><b>UserName</b></font></form:label></td>
                <td><form:input path="username" id="uname"/></td>
            </tr>
            <tr>
                <td><form:label path="password"><font size=6px><b>Password</b></font></form:label></td>
                <td><form:input type="password" path="password" required="required" id="pwd" /></td>
            </tr>
          </table><br>   
               <input type="image" src="login.jpg"  width="150" height="60" style="padding-left:100px;">
            
       
        </form:form>
<footer>
<h6>© Copyright 2020-2021 www.medicoz.com. All rights reserved.
	Developed by Cognizant Training Fresher Team.</h6>
	</footer>
</body>
</html>