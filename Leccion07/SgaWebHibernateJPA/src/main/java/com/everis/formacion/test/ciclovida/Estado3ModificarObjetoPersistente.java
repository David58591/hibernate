package com.everis.formacion.test.ciclovida;

import com.everis.formacion.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado3ModificarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPAPU");
        EntityManager em = emf.createEntityManager();

        // Recupeamos un objeto de la BBDD
        //Definimos la variable
        Contacto contacto = new Contacto();
        //REcuperamos el objeto
        //Deteached
        contacto = em.find(Contacto.class, 3);

        //modificamos el objeto 
        contacto.setEmail("carlalara@gmail.com");

        em.getTransaction().begin();

        //2.Persistimos
        em.persist(contacto);

        em.getTransaction().commit();
        //Detached
        System.out.println("contacto = " + contacto);
    }

}
