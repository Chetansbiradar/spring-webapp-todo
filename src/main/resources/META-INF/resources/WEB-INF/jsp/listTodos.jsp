<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.css" rel="stylesheet">
        <title>Todos</title>
    </head>
    <body>
        <div class="container">
            <h1>Welcome ${name}</h1>
            <hr>
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            <td><a href="/delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="/add-todo" class="btn btn-success"> Add Todo</a>
        </div>
        <script src="webjars/bootstrap/5.3.0/js/bootstrap.js" type="text/javascript"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js" type="text/javascript"></script>
    </body>
</html>