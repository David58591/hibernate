
package com.everis.formacion.web;


import com.everis.formacion.dao.AlumnoDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCerrarBD")
public class ServletCerrarBD extends HttpServlet{
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
         AlumnoDAO alumnoDao = new AlumnoDAO();
         alumnoDao.cerrarBaseDatos();
         
    }
    
}
