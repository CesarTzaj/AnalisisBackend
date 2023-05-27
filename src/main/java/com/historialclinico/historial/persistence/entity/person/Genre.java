
package com.historialclinico.historial.persistence.entity.person;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
public class Genre {
    @Id
    private Integer id;
   
    @Column(name = "genero")
    private String genre;
    
    @OneToMany(mappedBy = "genre")
    private List<Person> people;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
    
}
