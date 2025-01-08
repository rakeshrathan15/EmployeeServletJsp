<%@ page language="java" contentType="text/html" %>
<html>
<head><title>Login</title></head>
<body>
    <form action="login" method="post">
        Email: <input type="text" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>
    <a href="register.jsp">Register Here</a>
</body>
</html>
