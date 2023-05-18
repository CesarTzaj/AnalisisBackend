
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.PrescriptionDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Prescription;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrescriptionMapper {
    
    PrescriptionDTO toPrescriptionDTO(Prescription prescription);
    
    @InheritInverseConfiguration
    @Mapping(target = "consult", ignore = true)
    Prescription toPrescription(PrescriptionDTO prescriptionDTO);
}
