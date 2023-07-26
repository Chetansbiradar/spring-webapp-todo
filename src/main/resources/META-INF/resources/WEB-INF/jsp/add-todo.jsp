<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <%@ include file="common/header.jspf" %>
    <body>
        <%@ include file="common/navbar.jspf" %>
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
        <%@ include file="common/footer.jspf" %>
        <script type="text/javascript">
                $('#targetDate').datepicker({
                    format: 'yyyy-mm-dd',
                    startDate: '0d',
                    linked: true,
                });
        </script>
    </body>
</html>