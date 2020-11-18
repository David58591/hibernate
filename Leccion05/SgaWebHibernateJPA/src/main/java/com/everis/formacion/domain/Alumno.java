package com.everis.formacion.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.io.Serializable;
import java.util.List;


@Table(name = "alumno")
@Entity
public class Alumno implements  Serializable {

      private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    
    private String nombre;
    
    private String apellido;
    
    @JoinColumn(name="id_domicilio", referencedColumnName = "id_domicilio")
    @ManyToOne
    private Domicilio domicilio;
    
    @JoinColumn(name="id_contacto", referencedColumnName = "id_contacto")
    @ManyToOne
    private Contacto contacto;
    
    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;
   
    public Alumno(){
        
    }
   public Alumno (Integer idAlumno){
       this.idAlumno = idAlumno;
   }
   
   
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", contacto=" + contacto + '}';
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
   
   

}
