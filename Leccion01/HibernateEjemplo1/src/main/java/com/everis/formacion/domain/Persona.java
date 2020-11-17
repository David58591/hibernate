package com.everis.formacion.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "persona")
@Data @NoArgsConstructor
public class Persona implements Serializable{

    
    private static final long serialVersionUID = 1L;
    
   @Column(name = "id_persona")
   @Id
   private int idPersona;
   
   private String nombre;
   
   private String apellido;
   
   private String email;
   
   private String telefono;
}
