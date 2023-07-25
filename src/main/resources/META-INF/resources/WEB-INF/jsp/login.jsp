<html>

    <head>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <p>${errorMessage}</p>
            <h1>Login ${name}</h1>
            <hr>
            <form method="post">
                <label for="username">Username</label>
                <input type="text" name="name" required>
                <br>
                <label for="password">Password</label>
                <input type="password" name="password" required>
                <br>
                <input type="submit" value="Login">
            </form>
        </div>
    </body>
</html>