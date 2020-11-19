<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agregar Alumno</h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="POST">
            Nombre: <input type="text" name="nombre" value="" />
            <br>
            Apellido: <input type="text" name="apellido" value="" />
            <br>
            <br>
            Datos Domicilio
            <br>
            Calle <input type="text" name="calle" value="" />
            <br>
            noCalle <input type="text" name="noCalle" value="" />
            <br>
           Pais: <input type="text" name="pais" value="" />
           <br>
           <br>
           Datos de Contacto
           <br>
           Email <input type="email" name="email" value="" />
           <br>
           Telefono <input type="tel" name="telefono" value="" />
           <br>
           <input type="submit" name="Agregar" value="Agregar"/>
        </form>
    </body>
</html>
