
package com.historialclinico.historial.persistence.mapper.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ClinicDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Clinic;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClinicMapper {
    
    ClinicDTO toClinicDTO(Clinic clinic);
    List<ClinicDTO> toClinicDTOs(List<Clinic> clinics);
    
}
