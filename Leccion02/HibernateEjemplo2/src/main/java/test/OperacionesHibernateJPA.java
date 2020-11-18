package test;

import com.everis.formacion.dao.PersonaDAO;
import com.everis.formacion.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
        
        persona.setIdPersona(3);
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("Persona encontrada");
//        persona.setNombre("Carlos");
//        persona.setApellido("Esparza");
//        persona.setEmail("cesparza@email.com");
//        persona.setTelefono("548987459");
        
//        personaDao.insertar(persona);
 //         personaDao.modificar(persona);
            personaDao.eliminar(persona);
          personaDao.listar();
    }
}
