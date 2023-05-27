
package com.historialclinico.historial.domain.repositoryDTO.address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.domain.dto.address.TownDTO;
import java.util.List;
import java.util.Optional;


public interface DepartmentRepositoryDTO {

    List<DepartmentDTO> findByOrderByDepartment();
    List<TownDTO> findByDepId(int id);
}
