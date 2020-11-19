package com.everis.formacion.test.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.everis.formacion.domain.Domicilio;
import com.everis.formacion.domain.Contacto;
import com.everis.formacion.domain.Alumno;

public class PersistenciaCascadaTest {
    public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Mexico");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("juanjopita@email.com");
        contacto.setTelefono("443322118");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Juanjo");
        alumno.setNombre("Pita");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin(); 
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = "+alumno);
        
    }
}
