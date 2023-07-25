<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.css" rel="stylesheet">
        <title>Todos</title>
    </head>
    <body>
        <div class="container">
            <h1>Add Todo</h1>
            <form method="POST">
                Description: <input type="text" name="description" />
                <input type="submit" value="Add" class="btn btn-success" />
        </div>
        <script src="webjars/bootstrap/5.3.0/js/bootstrap.js" type="text/javascript"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js" type="text/javascript"></script>
    </body>
</html>