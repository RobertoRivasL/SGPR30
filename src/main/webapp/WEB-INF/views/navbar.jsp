<%--
  Created by IntelliJ IDEA.
  User: Ganon
  Date: 01-08-2023
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  <link rel="stylesheet" href="./css/style.css">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<header>
  <nav class="navbar navbar-expand-lg bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand text-light" href="index">Inicio</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">

          <sec:authorize access="hasRole('CLIENTE')">
            <li class="nav-item">
              <a class="nav-link text-light" href="contacto">Contacto</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-light" href="crearCapacitacion">Capacitación</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-light" href="listaCapacitacion">Lista Capacitaciones</a>
            </li>
          </sec:authorize>
          <sec:authorize access="hasRole('ADMINISTRATIVO')">
            <li class="nav-item">
              <a class="nav-link text-light" href="listaUsuarios">Lista Usuarios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-light" href="crearUsuario">Crear Usuario</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-light" href="listaPagos">Listado de Pagos</a>
            </li>
          </sec:authorize>
          <sec:authorize access="hasRole('PROFESIONAL')">
            <li class="nav-item">
              <a class="nav-link text-light" href="listaVisita">Lista Visitas</a>
            </li>
          </sec:authorize>

          <sec:authorize access="!isAuthenticated()">
            <li class="nav-item">
              <a class="nav-link text-primary" href="login">Ingresar</a>
            </li>
          </sec:authorize>
          <sec:authorize access="isAuthenticated()">
            <li class="nav-item">
              <a class="nav-link text-primary" href="#">
                Bienvenid@: <c:out value="${pageContext.request.userPrincipal.name}" />
              </a>
            </li>
            <li class="nav-item">
            <a class="nav-link text-danger" href="/logout">Cerrar Sesión</a>
            </li>
          </sec:authorize>
        </ul>
      </div>
    </div>
  </nav>
</header>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
        crossorigin="anonymous"></script>
</body>
</html>
