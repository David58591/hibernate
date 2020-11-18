package com.everis.formacion.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "contacto")
@NoArgsConstructor @Data
public class Contacto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Integer idContacto;
    
    private String telefono;
    
    private String email;
    
    public Contacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    
}
