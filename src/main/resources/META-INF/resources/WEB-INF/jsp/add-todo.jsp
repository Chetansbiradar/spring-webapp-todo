<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.css" rel="stylesheet" />
        <link href="webjars/bootstrap-datepicker/1.10.0/css/bootstrap-datepicker.standalone.css" rel="stylesheet" />
        <title>Todos</title>
    </head>
    <body>
        <div class="container">
            <h1>Add Todo</h1>
            <form:form method="POST" modelAttribute="todo">
                <fieldset>
                    <form:label path="description">Description</form:label>
                    <form:input type="text" path="description" required="required" />
                    <form:errors path="description" cssClass="error" />
                </fieldset>
                <fieldset>
                    <form:label path="targetDate">Target Date</form:label>
                    <form:input type="text" path="targetDate" required="required"/>
                    <form:errors path="targetDate" cssClass="error" />
                </fieldset>
                <form:input type="hidden" path="done"  />
                <form:input type="hidden" path="id" />
                <input type="submit" value="Add" class="btn btn-success" />
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.3.0/js/bootstrap.js" type="text/javascript"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js" type="text/javascript"></script>
        <script src="webjars/bootstrap-datepicker/1.10.0/js/bootstrap-datepicker.js" type="text/javascript"></script>
        <script type="text/javascript">
                $('#targetDate').datepicker({
                    format: 'yyyy-mm-dd',
                    startDate: '0d',
                    linked: true,
                });
        </script>
    </body>
</html>