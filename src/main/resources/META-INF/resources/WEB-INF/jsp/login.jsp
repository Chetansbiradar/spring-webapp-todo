<html>

    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login ${name}</h1>
        <form action="login" method="post">
            <label for="username">Username</label>
            <input type="text" name="username" id="username" required>
            <br>
            <label for="password">Password</label>
            <input type="password" name="password" id="password" required>
            <br>
            <input type="submit" value="Login">
        </form>
        <a href="">Register</a>
    </body>
</html>