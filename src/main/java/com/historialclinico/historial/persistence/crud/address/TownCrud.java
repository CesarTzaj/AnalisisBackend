
package com.historialclinico.historial.persistence.crud.address;

import com.historialclinico.historial.persistence.entity.person.address.Town;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface TownCrud extends CrudRepository<Town, Integer>{
    List<Town> findByOrderByMunicipioAsc();
}
