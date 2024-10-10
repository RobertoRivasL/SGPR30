<%--
  Created by IntelliJ IDEA.
  User: Ganon
  Date: 25-08-2023
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="navbar.jsp"%>
<%@include file="footer.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Lista Visitas</title>
</head>
<body>
<h1 class="text-center">Lista de Visitas</h1>
<div class="text-center">
  <div class="container">
    <hr class="hr" style="height: 20px"/>
    <div class="table-responsive">
      <table class="table table-dark table-bordered">
        <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Fecha Visita</th>
          <th scope="col">Nombre Visita</th>
          <th scope="col">Detalle</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${visitas}" var="visita">
          <tr>
            <td>${visita.getId()}</td>
            <td>${visita.getFechaVisita()}</td>
            <td>${visita.getNombre()}</td>
            <td>${visita.getDetalle()}</td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </div>

  <div class="container">

    <div class="row justify-content-center">
      <div class="col-lg-4 col-md-6 col-sm-8">
        <h4>Formulario Visita</h4>
        <form action="formularioVisita" method="POST">
          <div class="form-group">
            <label class="mb-3" for="fechaVisita">Fecha Visita</label>
            <input name="fechaVisita" type="date" id="fechaVisita" class="form-control" placeholder="Ingresa Fecha de Visita" required>
          </div>
          <br>
          <div class="form-group">
            <label class="mb-3" for="nombreVisita">Nombre Visita</label>
            <input name="nombreVisita" type="text" id="nombreVisita" class="form-control" placeholder="Ingresa nombre de Visita" required>
          </div>
          <div class="form-group">
            <label class="mb-3" for="detalle">Detalle</label>
            <input name="detalle" type="text" id="detalle" class="form-control" placeholder="Ingresa Detalle" required>
          </div>
          <button type="submit" class="btn btn-success mt-3">Crear Visita</button>
        </form>
      </div>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>
