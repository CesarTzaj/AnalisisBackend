
package com.historialclinico.historial.persistence.crud.person;

import com.historialclinico.historial.persistence.entity.person.address.Address;
import org.springframework.data.repository.CrudRepository;


public interface AddressCrudRepository extends CrudRepository<Address, Integer>{
    
    
}
