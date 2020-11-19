package com.everis.formacion.dao;

import static com.everis.formacion.dao.GenericDAO.em;
import com.everis.formacion.domain.Alumno;
import java.util.List;
import javax.persistence.Query;


public class AlumnoDAO extends GenericDAO {

    public List<Alumno> listar() {
         String consulta = "SELECT al FROM Alumno al";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();

    }

    public void insertar(Alumno alumno) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
    public void actualizar(Alumno alumno) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
    public void eliminar(Alumno alumno) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        
        }
    }
    
    public Alumno buscarPorId(Alumno alumno){
        em = getEntityManager();
        
        return em.find(Alumno.class, alumno.getIdAlumno());
    }
}
