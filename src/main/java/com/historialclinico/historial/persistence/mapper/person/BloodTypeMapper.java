
package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.domain.dto.person.BloodTypeDTO;
import com.historialclinico.historial.persistence.entity.person.BloodType;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BloodTypeMapper {
    
    
    BloodTypeDTO toBloodTypeDTO(BloodType bloodType);
    List<BloodTypeDTO> toBloodTypeDTOs(List<BloodType> blood );
    
    
    
}
