package com.everis.formacion.web;

import com.everis.formacion.dao.AlumnoDAO;
import com.everis.formacion.domain.Alumno;
import com.everis.formacion.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet{
    @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String idAlumnoS = req.getParameter("idAlumno");
       Integer idAlumno = Integer.parseInt(idAlumnoS);
       
        Alumno alumno  = new Alumno();
        alumno.setIdAlumno(idAlumno);
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        
        alumno = servicioAlumno.encontrarAlumno(alumno);
        
        
        HttpSession sesion = req.getSession();
        sesion.setAttribute("alumno", alumno);
        
        req.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(req, resp);
    }
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
            
           String modificar = req.getParameter("Modificar");
             String idAlumnoS = req.getParameter("idAlumno");
       Integer idAlumno = Integer.parseInt(idAlumnoS);
           String nombre = req.getParameter("nombre");
           String apellido = req.getParameter("apellido");
           String calle = req.getParameter("calle");
           String noCalle = req.getParameter("noCalle");
           String pais = req.getParameter("pais");
           String email = req.getParameter("email");
           String telefono = req.getParameter("telefono");
           
          if(modificar!= null){
                HttpSession sesion = req.getSession();
          
          Alumno alumno = (Alumno)sesion.getAttribute("alumno");
           alumno.setNombre(nombre);
           alumno.setApellido(apellido);
           alumno.getDomicilio().setCalle(calle);
           alumno.getDomicilio().setNoCalle(noCalle);
           alumno.getDomicilio().setPais(pais);
           alumno.getContacto().setEmail(email);
           alumno.getContacto().setTelefono(telefono);
           
           ServicioAlumno servicioAlumno = new ServicioAlumno();
           servicioAlumno.guardarAlumno(alumno);
           sesion.removeAttribute("alumno");
          }else{
              Alumno alumno = new Alumno(idAlumno);
              ServicioAlumno servicioAlumno = new ServicioAlumno();
              servicioAlumno.eliminarAlumno(alumno);
          }
        
           
           req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}