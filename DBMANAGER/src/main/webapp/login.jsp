<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
<link href="login.css" rel="stylesheet">
<link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Anton&family=Noto+Serif:ital,wght@1,400;1,700&family=Oswald:wght@700&family=Rubik+Bubbles&family=Rubik+Marker+Hatch&family=Stylish&display=swap" rel="stylesheet">

  <link href="style.css" rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=Combo&family=Island+Moments&family=Lora&family=PT+Sans:ital@1&family=Roboto:ital,wght@1,700&display=swap"
    rel="stylesheet">

</head>
<body id="logbody">
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0"); // for proxies
%>
    <div id="logheader">
        <h1 class="apptitle">Z-----O-------   DBMANAGER   ------H-----O</h1>
    </div>
    <div id="parent">
        <div id="logimg">
            <img id="loginimage" src="https://media.istockphoto.com/id/1312423107/vector/stealing-data-concept-flat-vector-illustration-online-registration-form-login-to-social.jpg?s=612x612&w=0&k=20&c=7Trftif8xV9FCDO5B4M7JiBpZUFlXo51m5lfI6hYCog=">
        </div>
        <div id="loginfo">
        <div id="logtitle">LOG IN</div>
            <form id="form" action="checker" method="post">
                <label for="user">USERNAME</label>
                <input type="text" name="username" id="user"  autocomplete="off"/>
                <label for="pass">PASSWORD</label>
                <input type="password" name="password" id="pass"  autocomplete="off"/>
                <button type="submit">SUBMIT</button>
            </form>            

        </div>
    </div>
    
</body>
</html>