
package com.historialclinico.historial.persistence.crud.person;

import com.historialclinico.historial.persistence.entity.person.Email;
import org.springframework.data.repository.CrudRepository;

public interface EmailCrud extends CrudRepository<Email, Integer>{
    
}
