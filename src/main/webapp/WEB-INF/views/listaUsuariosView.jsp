<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navbar.jsp"%>
<%@include file="footer.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Lista Usuarios</title>
</head>
<body>
<div class="container">
    <h1 class="text-center">Usuarios</h1>

    <hr class="hr" style="height: 20px"/>
    <div class="table-responsive">
        <table class="table table-dark table-bordered">
            <thead>
            <tr>
                <th scope="col">Nombre Usuario</th>
                <th scope="col">Contraseña</th>
                <th scope="col">Roles</th>
                <th scope="col">Acciones</th> <!-- Add a new column for actions -->
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${usuarios}" var="usuario">
                <tr>
                    <td>${usuario.getUsername()}</td>
                    <td>${usuario.getPassword()}</td>
                    <td>
                        <c:forEach items="${usuario.getAuthorities()}" var="authority" varStatus="loop">
                            ${authority.name}
                            <c:if test="${not loop.last}">, </c:if>
                        </c:forEach>
                    </td>
                    <td>
                        <a href="editarUsuario?username=${usuario.getUsername()}" class="btn btn-danger">Editar</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
        crossorigin="anonymous"></script>
</body>
</html>
