
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.MedicalRecordDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.MedicalRecord;
import com.historialclinico.historial.persistence.mapper.person.PersonMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {  BloodTypeMapper.class})
public interface MedicalRecordMapper {
    
    @Mappings({
        @Mapping(source = "bloodType", target = "bloodTypeDTO")
     //   @Mapping(source = "person", target = "personDTO")
    })
    MedicalRecordDTO toMedicalRecordDTO(MedicalRecord medicalRecord);
    
    
}
