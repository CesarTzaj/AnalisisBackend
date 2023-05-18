
package com.historialclinico.historial.persistence.crud.person;

import com.historialclinico.historial.persistence.entity.person.BloodType;
import org.springframework.data.repository.CrudRepository;

public interface BloodTypeCrud extends CrudRepository<BloodType, Integer>{
    
}
