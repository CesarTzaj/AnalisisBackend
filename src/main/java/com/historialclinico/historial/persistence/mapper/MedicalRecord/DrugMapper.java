
package com.historialclinico.historial.persistence.mapper.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.DrugDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Drug;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DrugMapper {
    @Mapping(source = "medicamento", target = "medicamento")
    DrugDTO toDrugDTO(Drug drug);
    List<DrugDTO> toDrugDTOs(List<Drug> drugs);
    
    @InheritInverseConfiguration
    @Mapping(target = "prescription", ignore = true)
    Drug toDrug(DrugDTO drugDTO);
}
