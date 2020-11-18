
package com.everis.formacion.web;

import com.everis.formacion.domain.Persona;
import com.everis.formacion.servicio.ServicioPersonas;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicioPersonas servicioPersonas = new ServicioPersonas();
        List<Persona> personas = servicioPersonas.listarPersonas();
        
        req.setAttribute("personas", personas);
       try{
                   req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
       }catch(ServletException ex) {
           ex.printStackTrace(System.out);
       }catch(IOException ex){
           ex.printStackTrace(System.out);
       }

    }
}
