package com.everis.formacion.domain;

import javax.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor 
@Entity @Data
@Table(name = "alumno")
public class Alumno implements  Serializable {

      private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    
    private String nombre;
    
    private String apellido;
    
    @JoinColumn(name="id_domicilio", referencedColumnName = "id_domicilio")
    @ManyToOne(cascade = CascadeType.ALL)
    private Domicilio domicilio;
    
    @JoinColumn(name="id_contacto", referencedColumnName = "id_contacto")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;
    
    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;
   
   public Alumno (Integer idAlumno){
       this.idAlumno = idAlumno;
   }
   
   
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", contacto=" + contacto + '}';
    }
   
   

}
