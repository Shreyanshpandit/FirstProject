<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<form action="login" method="post"> 
			<label for="username">Username</label>
			<input type="text" id="username" name="username" placeholder="Enter your username">

			<label for="password">Password</label>
			<input type="password" id="password" name="password" placeholder="Enter your password">

			<input type="submit" value="Login">
		</form>
	</div>
</body>
</html>

 <style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
}

.container {
	width: 300px;
	margin: auto;
	margin-top: 100px;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0px 0px 10px rgba(0,0,0,0.3);
}

h1 {
	text-align: center;
}

form {
	display: flex;
	flex-direction: column;
}

label {
	font-weight: bold;
	margin-bottom: 5px;
}

input[type=text], input[type=password] {
	padding: 10px;
	margin-bottom: 20px;
	border-radius: 5px;
	border: none;
	background-color: #f2f2f2;
}

input[type=submit] {
	padding: 10px;
	background-color: #4CAF50;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

</style>