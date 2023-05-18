
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Appointment;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.web.context.annotation.ApplicationScope;

@Mapper(componentModel = "spring", uses = {ConsultMapper.class})
public interface AppointmentMapper {
  
    AppointmentDTO toAppointmentDTO(Appointment appointment);
    
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "consults", ignore = true),
        @Mapping(target = "person", ignore = true),
    })
    Appointment toAppointment(AppointmentDTO appointmentDTO);
}
