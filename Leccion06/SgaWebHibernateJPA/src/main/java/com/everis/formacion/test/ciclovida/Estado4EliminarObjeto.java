package com.everis.formacion.test.ciclovida;

import com.everis.formacion.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Estado4EliminarObjeto {
     public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPAPU");
        EntityManager em = emf.createEntityManager();

        // Recupeamos un objeto de la BBDD
        //Definimos la variable
        Contacto contacto = new Contacto();
        //REcuperamos el objeto
        //deteached
        contacto = em.find(Contacto.class, 3);
        
        
        em.getTransaction().begin();
        
        //2.Persistimos
        em.remove(em.merge(contacto));
        
        em.getTransaction().commit();
        //transitivo
            System.out.println("contacto = "+ contacto);
    }
}
