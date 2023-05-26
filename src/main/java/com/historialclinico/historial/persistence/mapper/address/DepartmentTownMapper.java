
package com.historialclinico.historial.persistence.mapper.address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.persistence.entity.person.address.Department;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {TownMapper.class})
public interface DepartmentTownMapper {
    
    @Mapping(source = "departamento", target = "department")
    DepartmentDTO toDepartmentDTO(Department department);
    List<DepartmentDTO> toDepartmentDTOs(List<Department> departments);
}
