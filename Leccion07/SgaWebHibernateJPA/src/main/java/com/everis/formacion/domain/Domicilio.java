package com.everis.formacion.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "domicilio")


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

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Domicilio(Integer idDomicilio){
        this.idDomicilio = idDomicilio;
    }
    public Domicilio(){
       
    }
   
    
}
