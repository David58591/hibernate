package com.everis.formacion.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "curso")
@NoArgsConstructor @Data

public class Curso implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Integer idCurso;
    
    private String nombre;
    
    private Double precio;
    
    @OneToMany(mappedBy = "alumno")
    @ToString.Exclude private List<Asignacion> asignaciones;
    
    public Curso(Integer idCurso) {
        this.idCurso = idCurso;
    }
    
}
