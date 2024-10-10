<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="navbar.jsp" %>
<%@include file="footer.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Capacitación</title>
</head>
<body>
<div class="container">
    <h1 class="text-center">Capacitación</h1>
    <div class="b-example-divider mt-5"></div>

    <form id="formulario" action="formularioCapacitacion" method="POST" style="max-width: 40%; margin-left: 30%">
        <div class="container">
            <!-- Name input -->
            <div class="form-outline mb-4">
                <label class="form-label" for="rut_cliente">Rut Cliente</label>
                <input name="rutCliente" type="number" id="rut_cliente" class="form-control" minlength="8" maxlength="9"
                       required/>
                <label class="d-none text-danger" id="alertaRut_cliente">Falta agregar el rut del cliente</label>
            </div>

            <div class="form-group mb-4">
                <label for="Dia">Día</label>
                <select name="dia" class="form-control" id="Dia" required>
                    <%

                        List<String> listaDias = new ArrayList<>();
                        listaDias.addAll(List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));

                        for (int i = 0; i < listaDias.size(); i++) {

                    %>
                    <option><%=listaDias.get(i)%>
                    </option>
                    <%}%>
                </select>
            </div>
            <div class="form-group mb-4">
                <label for="Hora">Hora</label>
                <select name="hora" class="form-control" id="Hora" required>
                    <%
                        for (int j = 10; j < 24; j++) {

                    %>
                    <option><%=j%>:00</option>
                    <%}%>
                </select>
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="lugar">Lugar</label>
                <input name="lugar" type="text" id="lugar" class="form-control" minlength="10" maxlength="50" required/>
                <label class="d-none text-danger" id="alertaLugar">Falta agregar el lugar</label>
            </div>
            <div class="form-outline mb-4">
                <label class="form-label" for="duracion">Duración</label>
                <input name="duracion" type="text" id="duracion" class="form-control" maxlength="70" required/>
                <label class="d-none text-danger" id="alertaDuracion">Falta agregar la Duración</label>
            </div>
            <div class="form-outline mb-4">
                <label class="form-label" for="cantidadAsistentes">Cantidad de Asistentes</label>
                <input name="cantidadAsistentes" type="number" id="cantidadAsistentes" class="form-control"
                       maxlength="1000" required/>
                <label class="d-none text-danger" id="alertaCantidadAsistentes">Falta agregar la cantidad de
                    Asistentes</label>
            </div>

            <!-- Submit button -->
            <button id="botonCrear" type="submit" class="btn btn-dark btn-block mb-4">Crear</button>
            <div class="center" style="margin-top:10px; margin-bottom: 20px;">
                <label class="d-none text-success " id="capCreada">Su capacitación ha sido creada</label>
            </div>
        </div>
    </form>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
        crossorigin="anonymous"></script>
</body>
</html>
