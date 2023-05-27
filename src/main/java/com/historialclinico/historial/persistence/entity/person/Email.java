package com.historialclinico.historial.persistence.entity.person;

import jakarta.persistence.*;

@Entity
@Table(name = "email")
public class Email {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;  
    
    private long persondpi;
    
    @ManyToOne
    @JoinColumn(name = "persondpi", updatable = false, insertable = false)
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPersondpi() {
        return persondpi;
    }

    public void setPersondpi(long persondpi) {
        this.persondpi = persondpi;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
