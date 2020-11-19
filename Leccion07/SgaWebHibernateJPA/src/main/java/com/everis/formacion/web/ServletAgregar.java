package com.everis.formacion.web;

import com.everis.formacion.domain.Alumno;
import com.everis.formacion.domain.Contacto;
import com.everis.formacion.domain.Domicilio;
import com.everis.formacion.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
           String nombre = req.getParameter("nombre");
           String apellido = req.getParameter("apellido");
           String calle = req.getParameter("calle");
           String noCalle = req.getParameter("noCalle");
           String pais = req.getParameter("pais");
           String email = req.getParameter("email");
           String telefono = req.getParameter("telefono");
           
           Domicilio domicilio = new Domicilio();
           domicilio.setCalle(calle);
           domicilio.setNoCalle(noCalle);
           domicilio.setPais(pais);
           
           Contacto contacto = new Contacto();
           contacto.setEmail(email);
           contacto.setTelefono(telefono);
           
           Alumno alumno = new Alumno();
           alumno.setNombre(nombre);
           alumno.setApellido(apellido);
           alumno.setContacto(contacto);
           alumno.setDomicilio(domicilio);
           
           ServicioAlumno servicioAlumno = new ServicioAlumno();
           servicioAlumno.guardarAlumno(alumno);
           
           
           req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
