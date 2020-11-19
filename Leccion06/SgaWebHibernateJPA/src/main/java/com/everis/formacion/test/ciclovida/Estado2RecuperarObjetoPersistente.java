package com.everis.formacion.test.ciclovida;

import com.everis.formacion.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado2RecuperarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPAPU");
        EntityManager em = emf.createEntityManager();

        // Recupeamos un objeto de la BBDD
        //Definimos la variable
        Contacto contacto = new Contacto();
        //REcuperamos el objeto
        
        contacto = em.find(Contacto.class, 3);
        
        //Detached
            System.out.println("contacto = "+ contacto);
       
    }

}
