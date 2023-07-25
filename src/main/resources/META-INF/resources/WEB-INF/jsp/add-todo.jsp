<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.css" rel="stylesheet">
        <title>Todos</title>
    </head>
    <body>
        <div class="container">
            <h1>Add Todo</h1>
            <form:form method="POST" modelAttribute="todo">
                Description: <form:input type="text" path="description" required="required" />
                <form:input type="hidden" path="id" />
                <form:input type="hidden" path="done"  />
                <input type="submit" value="Add" class="btn btn-success" />
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.3.0/js/bootstrap.js" type="text/javascript"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js" type="text/javascript"></script>
    </body>
</html>