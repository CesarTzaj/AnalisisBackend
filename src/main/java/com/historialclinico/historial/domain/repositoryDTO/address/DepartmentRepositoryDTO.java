
package com.historialclinico.historial.domain.repositoryDTO.address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import java.util.List;


public interface DepartmentRepositoryDTO {

    List<DepartmentDTO> findByOrderByDepartment();
    List<DepartmentDTO> findByDepartmentAndTown();
}
