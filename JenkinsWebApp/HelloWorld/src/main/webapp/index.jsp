<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!--  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DevOps Demo</title>
<style>
body {
	background-color: #F0F0F0;
}
* {
    box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
    float: left;
    width: 50%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
    
}

</style>
</head>
<body id = "bd">
	<form action = "hello" method = "GET">
	<h3>DevOps Demo</h3>
	<h4>Please enter the following fields</h4>
	
	<div class = "row">
	<div class = "column">
		First Name: <input type = "text" name = "firstName" required>
		<br>
		Last Name: <input type = "text" name = "lastName" required>
		<br>
		User Name: <input type = "text" name = "UserName" required>
		<br>
		Password: <input type = "text" name = "Password" required>
		<br>
		Address: <input type = "text" name = "Address1" required>
		<br>
		Address: <input type = "text" name = "Address2" required>
		<br>
	</div>
	<div class = "column">
		City: <input type = "text" name = "City" required>
		<br>
		State: <input type = "text" name = "State" required>
		<br>
		Zipcode: <input type = "text" name = "zipcode" required>
		<br>
		Country: <input type = "text" name = "country" required>
		<br> 
		Title: <input type = "text" name = "title" required>
		<br>
		Email: <input type = "text" name = "email" required>
		<br>
		Phone Number: <input type = "text" name = "phoneNumber">
		<br>
	</div>
	</div>
	  <button type="submit" value="Submit">Submit</button>
	  <button type="reset" value="Reset">Reset</button>
	</form>
</body>
</html>
-->

<html>
<head>
	<title>User Registration</title>
	<style>
		input.txt {
			color: #00008B;
			background-color: #E3F2F7;
			border: 1px inset #00008B;
			width: 200px;
			}
		input.btn {
		color: #00008B;
		background-color: #ADD8E6;
		border: 1px outset #00008B;
		}
		form div {
		clear: left;
		margin: 0;
		padding: 0;
		padding-top: 5px;
		}
		form div label {
		float: left;
		width: 12%;
		font: bold 0.9em Arial, Helvetica, sans-serif;
		}
		fieldset {
		border: 1px dotted #61B5CF;
		margin-top: 1.4em;
		padding: 0.6em;
		}
		legend {
		font: bold 0.8em Arial, Helvetica, sans-serif;
		color: #00008B;
		background-color: #FFFFFF;
		}
	</style>
</head>

<body>
	<h1>User Registration</h1>
	
	<form action = "hello" method = "POST">
	<fieldset>
		<legend>Personal Information</legend>
		<div>
			<label for="firstName">First Name:</label>
			<input type="text" name="firstName" id="firstName" class="txt" required />
		</div>
		<div>
			<label for="lastName">Last Name:</label>
			<input type="text" name="lastName" id="lastName" class="txt" required/>
		</div>
		<div>
			<label for="email">Email Address:</label>
			<input type="text" name="email" id="email" class="txt" required/>
		</div>
		<div>
			<label for="phoneNumber">Phone Number:</label>
			<input type="text" name="phoneNumber" id="phoneNumber" class="txt" required/>
		</div>
		<div>
			<label for="title">Title:</label>
			<input type="text" name="title" id="title" class="txt" required/>
		</div>
		<div>
			<label for="userName">Username:</label>
			<input type="text" name="userName" id="userName" class="txt" required/>
		</div>
		<div>
			<label for="password1">Password:</label>
			<input type="password" name="password1" id="password1" class="txt" required/>
		</div>
		<div>
			<label for="password2">Confirm Password:</label>
			<input type="password" name="password2" id="password2" class="txt" required/>
		</div>
	</fieldset>
	<fieldset>
		<legend>Address Details</legend>
		<div>
			<label for="address1">Address line one:</label>
			<input type="text" name="address1" id="address1" class="txt" required/>
		</div>
		<div>
			<label for="address2">Address line two:</label>
			<input type="text" name="address2" id="address2" class="txt" required/>
		</div>
		<div>
			<label for="city">City:</label>
			<input type="text" name="city" id="city" class="txt" required/>
		</div>
		<div>
			<label for="state">State:</label>
			<input type="text" name="state" id="state" class="txt" required/>
		</div>
		<div>
			<label for="zip">Zipcode:</label>
			<input type="text" name="zip" id="zip" class="txt" required/>
		</div>
		<div>
			<label for="country">Country:</label>
			<input type="text" name="country" id="country" class="txt" required/>
		</div>
	</fieldset>
	<div>
	<input type="submit" name="btnSubmit" id="btnSubmit" value="Register" class="btn" />
	<input type="reset" name="btnSubmit" id="btnSubmit" value="Clear" class="btn" />	
	</div>
	</form>
</body>
</html>