
package com.historialclinico.historial.persistence.crud.person;

import com.historialclinico.historial.persistence.entity.person.Genre;
import org.springframework.data.repository.CrudRepository;


public interface GenreCrud extends CrudRepository<Genre, Integer>{
    
}
