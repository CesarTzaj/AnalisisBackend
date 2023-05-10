
package com.historialclinico.historial.persistence.entity.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "direccion")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "direccionid")
    private Integer idDireccion;
    
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "personaid")
    private long dpi;

    @ManyToOne
    @JoinColumn(name = "personaid", insertable = false, updatable = false)
    private Person person;
    
    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

 
   
}
