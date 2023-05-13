
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.PrescriptionDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.Prescription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PrescriptionMapper {
    
    PrescriptionDTO toPrescriptionDTO(Prescription prescription);
}
