<%--
  Created by IntelliJ IDEA.
  User: Ganon
  Date: 09-08-2023
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@include file="navbar.jsp" %>
<%@include file="footer.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Crear Usuario</title>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-lg-4 col-md-6 col-sm-8">
            <form class="register-form" action="formularioRegistro" method="POST">
                <h2 class="text-center mb-4">Crear Usuario</h2>
                <div class="form-group">
                    <label class="mb-3" for="username">Nombre de Usuario</label>
                    <input name="username" type="text" id="username" class="form-control" placeholder="Ingresa Usuario"
                           required>
                </div>
                <br>
                <div class="form-group">
                    <label class="mb-3" for="password">Contraseña</label>
                    <input name="password" type="password" id="password" class="form-control"
                           placeholder="Ingresa tu contraseña" required>
                </div>
                <div class="form-group">
                    <label class="mb-3" for="tipo">Tipo</label>
                    <select name="tipo" class="form-control" id="tipo">
                        <option disabled selected>Seleccione</option>
                        <option>CLIENTE</option>
                        <option>PROFESIONAL</option>
                        <option>ADMINISTRATIVO</option>
                    </select>
                </div>
                <br>
                <div style="display: flex; justify-content: space-between;">
                    <button type="submit" class="btn btn-primary btn-dark mb-3">Crear</button>
                </div>
            </form>

        </div>
    </div>
</div>

</body>
</html>
