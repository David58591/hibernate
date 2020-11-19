package com.everis.formacion.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor @Data

public class Domicilio implements Serializable{

  private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;
    
    private String calle;
    
    @Column(name = "no_calle")
    private String noCalle;
    
    private String pais;

    public Domicilio(Integer idDomicilio){
        this.idDomicilio = idDomicilio;
    }
   
    
}
