
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import java.sql.Date;

import java.util.List;
import java.util.Optional;

public interface AppointmentRepositoryDTO {
    
    
    List<AppointmentDTO> getByDPi(long dpi);
    List<AppointmentDTO> getByDpiDateRagen(long dpi, Date start , Date end);
    Optional<AppointmentDTO> getById(int id);
    AppointmentDTO save(AppointmentDTO appointmentDTO);
    void delete(int id);
}
