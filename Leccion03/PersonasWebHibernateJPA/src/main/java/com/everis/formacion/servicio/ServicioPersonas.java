package com.everis.formacion.servicio;

import com.everis.formacion.dao.PersonaDAO;
import com.everis.formacion.domain.Persona;
import java.util.List;

public class ServicioPersonas {
    
    private PersonaDAO personaDao = new PersonaDAO();
    
    public ServicioPersonas(){
        this.personaDao = new PersonaDAO();
    }
    public List<Persona> listarPersonas(){
        return this.personaDao.listar();
    }
}
