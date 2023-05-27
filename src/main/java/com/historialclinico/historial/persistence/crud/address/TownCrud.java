
package com.historialclinico.historial.persistence.crud.address;

import com.historialclinico.historial.persistence.entity.address.Town;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface TownCrud extends CrudRepository<Town, Integer>{
    List<Town> findByDepartmentIdOrderByMunicipioAsc(int id);
}
