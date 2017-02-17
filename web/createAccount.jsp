<%-- 
    Document   : createAccount
    Created on : Dec 17, 2016, 2:11:58 AM
    Author     : cigist
--%>

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
            <form class="form-signin" action="MasterUserServlet" method="POST">       
                <h2 class="form-signin-heading">Create Account</h2>
                <label class="lebl-control">User Code :</label>
                <input type="text" class="form-control" name="name" place
                <label class="lebl-control">Name :</label>
                <input type="text" class="form-control" name="cdUser" placeholder="User Code" required="" autofocus="" />
                <label class="lebl-control">Email/Username :</label>
                <input type="text" class="form-control" name="username" placeholder="Email/Username" required="" autofocus="" />
                <label class="lebl-control">Password :</label>
                <input type="password" class="form-control" name="password" placeholder="Password" required="" autofocus="" />
                <label class="lebl-control">Repassword :</label>
                <input type="password" class="form-control" name="repassword" placeholder="Repassword" required=""/>
                <br>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Create Account</button>   
            </form>
        </div>

    </body>
</html>

