
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navbar.jsp"%>
<%@include file="footer.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Lista Pagos</title>
</head>
<body>

<h1 class="text-center">Lista de Pagos</h1>
<div class="text-center">
    <div class="container">
    <hr class="hr" style="height: 20px"/>
    <div class="table-responsive">
        <table class="table table-dark table-bordered">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Monto</th>
                <th scope="col">Fecha Pago</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${pagos}" var="pago">
                <tr>
                    <td>${pago.getId()}</td>
                    <td>${pago.getMonto()}</td>
                    <td>${pago.getFechaPago()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

    <div class="container">

        <div class="row justify-content-center">
            <div class="col-lg-4 col-md-6 col-sm-8">
                <h4>Formulario Pago</h4>
                <form action="formularioPago" method="POST">
                    <div class="form-group">
                        <label class="mb-3" for="monto">Monto</label>
                        <input name="monto" type="text" id="monto" class="form-control" placeholder="Ingresa Monto" required>
                    </div>
                    <br>
                    <div class="form-group">
                        <label class="mb-3" for="fechaPago">Fecha de Pago</label>
                        <input name="fechaPago" type="date" id="fechaPago" class="form-control" placeholder="Ingresa Fecha de Pago" required>
                    </div>
                    <button type="submit" class="btn btn-success mt-3">Crear Pago</button>
                </form>
            </div>
        </div>
    </div>










</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

</body>
</html>
