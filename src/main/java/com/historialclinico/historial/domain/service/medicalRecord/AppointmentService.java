
package com.historialclinico.historial.domain.service.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.AppointmentRepositoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepositoryDTO appointment;
    
    public Optional<AppointmentDTO> getById(int id){
        return appointment.getById(id);
    }
    
    public Boolean delete(int id){
        return getById(id)
                .map(appoint ->{
                    appointment.delete(id);
                    return true;
                }).orElse(false);
    }
    
    public AppointmentDTO save(AppointmentDTO appointmentDTO){
        return appointment.save(appointmentDTO);
    }
}   
