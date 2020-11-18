package com.everis.formacion.dao;

import java.util.List;
import javax.persistence.*;
import com.everis.formacion.domain.Persona;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();

        for (Persona p : personas) {
            System.out.println("p =" + p);
        }
    }

    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().getClass();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().getClass();
        }

    }

    public Persona buscarPersonaPorId(Persona p) {
        return em.find(Persona.class, p.getIdPersona());
    }

    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().getClass();
        }
    }
}
