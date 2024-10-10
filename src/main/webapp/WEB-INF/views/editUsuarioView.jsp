<%--
  Created by IntelliJ IDEA.
  User: Ganon
  Date: 26-08-2023
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navbar.jsp" %>
<%@include file="footer.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Edit User</title>
</head>
<body>
<div class="container">
    <h1 class="display-1 text-center">Edición de Usuario</h1>

    <%-- Fetch user data from the backend (replace this with your actual data retrieval logic) --%>
    <%-- Here, I'm using dummy data for demonstration purposes --%>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    %>
    <div class="row justify-content-center">
        <div class="col-lg-4 col-md-6 col-sm-8">
            <form action="actualizarUsuario" method="post">

                <div class="form-group mb-3">
                    <label for="usernameMOD">Usuario :</label>
                    <input type="text" class="form-control" id="usernameMOD" name="usernameMOD" value="<%= username %>"
                           readonly>
                </div>
                <div class="form-group mb-3">
                    <label for="passwordMOD">Contraseña :</label>
                    <input type="password" class="form-control" id="passwordMOD" name="passwordMOD"
                           value="<%= password %>" required>
                </div>
                <button type="submit" class="btn btn-primary mt-3">Actualizar Contraseña</button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
        crossorigin="anonymous"></script>
</body>
</html>
