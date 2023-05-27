
package com.historialclinico.historial.persistence.mapper.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Consult;
import com.historialclinico.historial.persistence.mapper.doctor.DoctorMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {
    PrescriptionMapper.class, 
    ExamMapper.class, 
    DoctorMapper.class,
    
})
public interface ConsultMapper {
    
    ConsultDTO toConsultDTO(Consult consult);
    
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "appointment", ignore = true),
        @Mapping(target = "prescriptions", ignore = true),
        @Mapping(target = "exams", ignore = true),
        @Mapping(target = "doctor", ignore = true)
    })
    Consult toConsult(ConsultDTO consultDTO);
}
 