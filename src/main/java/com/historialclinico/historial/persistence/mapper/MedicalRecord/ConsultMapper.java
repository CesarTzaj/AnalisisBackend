
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.ConsultDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.Consult;
import com.historialclinico.historial.persistence.mapper.doctor.DoctorMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PrescriptionMapper.class, ExamMapper.class, DoctorMapper.class})
public interface ConsultMapper {
    
    ConsultDTO toConsultDTO(Consult consult);
}
