
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Appointment;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.web.context.annotation.ApplicationScope;

@Mapper(componentModel = "spring", uses = {ConsultMapper.class, ClinicMapper.class})
public interface AppointmentMapper {
  
    AppointmentDTO toAppointmentDTO(Appointment appointment);
    List<AppointmentDTO> toAppointmentDTOs(List<Appointment> appointments);
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "consults", ignore = true),
        @Mapping(target = "clinic", ignore = true),
    })
    Appointment toAppointment(AppointmentDTO appointmentDTO);
    
}
