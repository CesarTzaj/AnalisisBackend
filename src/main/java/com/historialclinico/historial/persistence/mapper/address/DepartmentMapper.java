
package com.historialclinico.historial.persistence.mapper.address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.persistence.entity.person.address.Department;
import java.util.List;
import org.hibernate.annotations.Target;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TownMapper.class})
public interface DepartmentMapper {
    
    @Mappings({
        @Mapping(source = "departamento", target = "department"),
        @Mapping(target = "towns", ignore = true)    
    })        
    DepartmentDTO toDepartmentDTO(Department department);
    List<DepartmentDTO> toDepartmentDTOs(List<Department> department);
    
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "addresses", ignore = true),
        @Mapping(target = "towns", ignore = true)
    })
    Department toDepartment(DepartmentDTO departmentDTO);
}
