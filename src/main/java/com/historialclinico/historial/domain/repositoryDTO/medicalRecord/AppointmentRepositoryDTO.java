
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import java.util.Optional;

public interface AppointmentRepositoryDTO {
    
    AppointmentDTO save(AppointmentDTO appointmentDTO);
    Optional<AppointmentDTO> getById(int id);
    void delete(int id);
}
