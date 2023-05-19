
package com.historialclinico.historial.persistence.crud.person;

import com.historialclinico.historial.persistence.entity.person.Person;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface PersonCrud extends CrudRepository<Person, Long>{
 
    Optional<Person> findByDpi (long dpi);
}
