/**
 * 
 */
/**
 * 
 */

function validateLoginForm() {

	var username = document.forms["LoginForm"]["username"].value;
	var password = document.forms["LoginForm"]["password"].value;
	var formSubmittionStatus = true;
	if(password.length<8||username=="")
	{
		formSubmittionStatus = false;
	}
	else
		{
		
		}
	if (!formSubmittionStatus ) {
		alert("Enter a valid username and password"+"\n"+"Password should be atleast 8 characters long");
	} else {
		
		
		alert("You have successfully LOGGED IN.....");
		
	}

	return formSubmittionStatus;
	
	
	
	}