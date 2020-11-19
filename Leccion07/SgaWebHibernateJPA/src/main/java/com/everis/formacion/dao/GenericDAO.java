package com.everis.formacion.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDAO {
    
    protected static EntityManager em ;
    protected static EntityManagerFactory emf;
    private static final String PU ="HibernateJPAPU";
    
    public GenericDAO () {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PU);
            
        }
    }
    
    protected EntityManager getEntityManager(){
        if(em == null){
            em = emf.createEntityManager();
        }
        return em;
    }
    
    public void cerrarBaseDatos(){
        em.close();
        
        
    }
}
