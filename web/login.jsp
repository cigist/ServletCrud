<%-- 
    Document   : login
    Created on : Dec 16, 2016, 10:44:10 PM
    Author     : cigist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <script src="bootstrap/js/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="styles.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="wrapper">
            <form class="form-signin" action="LoginServlet" method="POST">       
                <h2 class="form-signin-heading">Please login</h2>
                <br>
                <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
                <input type="password" class="form-control" name="password" placeholder="Password" required=""/>
                <p>
                    <a href="createAccount.jsp">Create Account</a>
                </p>
                <br>

                <button class="btn btn-lg btn-primary btn-block" type="submit" href="login.jsp">Login</button>   
            </form>
        </div>

    </body>
</html>
