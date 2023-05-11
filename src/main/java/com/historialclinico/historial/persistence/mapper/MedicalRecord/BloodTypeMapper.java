
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.BloodTypeDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.BloodType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BloodTypeMapper {
    
    
    BloodTypeDTO toBloodTypeDTO(BloodType bloodType);
    
    
    
}
