package com.everis.formacion.test.ciclovida;

import com.everis.formacion.domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPAPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        
        Contacto contacto = new Contacto();
        
        contacto.setEmail("clara@gmail.com");
        contacto.setTelefono("112233448");
        
        //2.persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
         em.getTransaction().commit();
    
        //3.Detach (separado)
        System.out.println("contacto = " + contacto.toString());
       
    }
}
