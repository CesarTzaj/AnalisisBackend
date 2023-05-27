
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.PrescriptionDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Prescription;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {DrugMapper.class})
public interface PrescriptionMapper {
    
    @Mappings({
        @Mapping(source = "medicamentoId", target = "drugId"),
        @Mapping(source = "dosis", target = "dosage"),
        @Mapping(source = "comentario", target = "comment"),
        @Mapping(source = "consultaId", target = "consultaId"),
    })
    PrescriptionDTO toPrescriptionDTO(Prescription prescription);
    
    @InheritInverseConfiguration
    @Mapping(target = "consult", ignore = true)
    @Mapping(target = "drug", ignore = true)
    Prescription toPrescription(PrescriptionDTO prescriptionDTO);
}
