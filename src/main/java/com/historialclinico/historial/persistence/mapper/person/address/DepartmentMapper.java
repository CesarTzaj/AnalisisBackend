
package com.historialclinico.historial.persistence.mapper.person.address;

import com.historialclinico.historial.domain.dto.person.address.DepartmentDTO;
import com.historialclinico.historial.persistence.entity.person.address.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    
    DepartmentDTO toDepartmentDTO(Department department);
}
