
package com.historialclinico.historial.persistence.crud;

import com.historialclinico.historial.persistence.entity.Person;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface PersonCrud extends CrudRepository<Person, Integer>{
 
    Optional<Person> findByIdPersona(int id);
    Optional<Person> findByDpi(long dpi);
}
