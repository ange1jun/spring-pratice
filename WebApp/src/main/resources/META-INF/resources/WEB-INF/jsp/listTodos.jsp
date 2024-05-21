<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>Your Todos</h1>
    <table class="table">
        <thead>
            <tr>
                <th>Description</th>
                <th>Target Data</th>
                <th>Is Done?</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.description}</td>
                    <td>${todo.targetdate}</td>
                    <td>${todo.done}</td>
                    <td><a href="update-todo?id=${todo.id}" class="btn btn-outline-success">Update</a></td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-outline-danger">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-outline-dark">Add Todo</a>
</div>

<%@ include file="common/footer.jspf"%>