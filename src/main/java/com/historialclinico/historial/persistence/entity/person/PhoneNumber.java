
package com.historialclinico.historial.persistence.entity.person;

import jakarta.persistence.*;

@Entity
@Table(name = "telefono")
public class PhoneNumber {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "telefonoid")
    private Integer id;
    
    @Column(name = "numero_telefono",nullable = true)
    private int phoneNumber;
    
    private long personadpi;
    
    @ManyToOne
    @JoinColumn(name = "personadpi", insertable = false, updatable = false)
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPersonadpi() {
        return personadpi;
    }

    public void setPersonadpi(long personadpi) {
        this.personadpi = personadpi;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
}
