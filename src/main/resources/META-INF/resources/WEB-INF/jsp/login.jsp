<html>

    <head>
        <title>Login</title>
    </head>
    <body>
        <p>${errorMessage}</p>
        <h1>Login ${name}</h1>
        <form method="post">
            <label for="username">Username</label>
            <input type="text" name="name" required>
            <br>
            <label for="password">Password</label>
            <input type="password" name="password" required>
            <br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>