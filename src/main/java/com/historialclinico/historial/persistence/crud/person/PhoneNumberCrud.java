
package com.historialclinico.historial.persistence.crud.person;

import com.historialclinico.historial.persistence.entity.person.PhoneNumber;
import org.springframework.data.repository.CrudRepository;


public interface PhoneNumberCrud extends CrudRepository<PhoneNumber, Integer> {
    
}
