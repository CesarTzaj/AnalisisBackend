
package com.historialclinico.historial.persistence.crud.address;

import com.historialclinico.historial.persistence.entity.person.address.Department;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface DepartmentCrud extends CrudRepository<Department, Integer>{
    List<Department> findByOrderByDepartamentoAsc();
}
