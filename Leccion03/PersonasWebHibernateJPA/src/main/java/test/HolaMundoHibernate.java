
package test;

import java.util.List;
import com.everis.formacion.domain.Persona;
import javax.persistence.*;


public class HolaMundoHibernate {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory factoria = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = factoria.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        
        List<Persona> personas = query.getResultList();
        for(Persona p : personas){
            System.out.println("Persona: "+ p );
        }
    }
}
