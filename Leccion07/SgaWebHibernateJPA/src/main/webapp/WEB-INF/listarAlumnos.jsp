<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>

        <title>Listado de Alumnos</title>
    </head>
    <body>
 <h1>Listar Alumnos</h1>
  <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
  <a href="${pageContext.request.contextPath}/ServletCerrarBD">CerrarBD</a>
  
        <table border="1 solid">
            <tr>
                <th>Alumno ID</th>
                <th>Nombre y Apellido</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td><a href="${pageContext.request.contextPath}\ServletModificar?idAlumno=${alumno.idAlumno}">${alumno.idAlumno}</a></td>
                    <td>${alumno.nombre}&nbsp; ${alumno.apellido}</td>
                    <td>${alumno.domicilio.calle}&nbsp; ${alumno.domicilio.noCalle}&nbsp;  ${alumno.domicilio.pais}</td>
                    <td>${alumno.contacto.idContacto}&nbsp;  ${alumno.contacto.email}</td>
                    <td>${alumno.contacto.telefono}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
