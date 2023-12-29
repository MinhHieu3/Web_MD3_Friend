<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 12/27/2023
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Slide Navbar</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">

    <div class="signup">
        <form method="post">
            <label for="chk" aria-hidden="true">Sign up</label>
            <input type="text" name="username" placeholder="User name" required="">
            <input type="password" name="password" placeholder="Password" required="">
            <input type="password"  placeholder="Password" required="">
            <button>Sign up</button>
        </form>
    </div>

    <div class="login">
        <form method="post">
            <label for="chk" aria-hidden="true">Login</label>
            <input type="text" name="user" placeholder="Username" required="">
            <input type="password" name="pass" placeholder="Password" required="">
            <button>Login</button>
        </form>
    </div>
</div>
</body>
</html>
