
package com.historialclinico.historial.persistence.entity;

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
    private Integer personaid;

    @ManyToOne
    @JoinColumn(name = "personaid", insertable = false, updatable = false)
    private Person people;
    
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

    public Person getPeople() {
        return people;
    }

    public void setPeople(Person people) {
        this.people = people;
    }

    public Integer getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Integer personaid) {
        this.personaid = personaid;
    }


    
}
