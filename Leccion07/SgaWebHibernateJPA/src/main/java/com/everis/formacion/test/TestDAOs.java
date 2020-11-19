package com.everis.formacion.test;

import com.everis.formacion.dao.*;

import java.util.List;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alummnoDAO = new AlumnoDAO();
        System.out.println("Alumnos:");
        imprimir(alummnoDAO.listar());
        
        DomicilioDAO domicilioDAO = new DomicilioDAO();
        System.out.println("Domicilios:");
        imprimir(domicilioDAO.listar());
        
        ContactoDAO contactoDAO = new ContactoDAO();
        System.out.println("Contactos:");
        imprimir(contactoDAO.listar());
        
        CursoDAO cursoDAO = new CursoDAO();
        System.out.println("Cursos:");
        imprimir(cursoDAO.listar());
        
        AsignacionDAO asignacionDAO = new AsignacionDAO();
        System.out.println("Asignaciones:");
        imprimir(asignacionDAO.listar());
    }
    
    protected static void imprimir(List coleccion){
        coleccion.forEach((Object o) -> {
            System.out.println("valor = " + o);
        });
    }
          
}
