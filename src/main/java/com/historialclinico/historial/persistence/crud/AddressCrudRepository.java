
package com.historialclinico.historial.persistence.crud;

import com.historialclinico.historial.persistence.entity.Address;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface AddressCrudRepository extends CrudRepository<Address, Integer>{
    
    
}
