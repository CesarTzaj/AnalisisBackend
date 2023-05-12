
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.ConsultDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.Consult;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsultMapper {
    
    ConsultDTO toConsultDTO(Consult consult);
}
