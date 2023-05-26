
package com.historialclinico.historial.domain.repositoryDTO.address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import java.util.List;
import java.util.Optional;


public interface DepartmentRepositoryDTO {

    List<DepartmentDTO> findByOrderByDepartment();
    Optional<DepartmentDTO> findById(int id);
}
