
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.AppointmentDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ConsultMapper.class})
public interface AppointmentMapper {
  
    AppointmentDTO toAppointmentDTO(Appointment appointment);
}
