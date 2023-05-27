
package com.historialclinico.historial.persistence.entity.person;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_sangre")
public class BloodType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "tipo_sangre")
    private String blood;
    
    @OneToMany(mappedBy = "bloodType")
    private List<Person> person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }


        
}
