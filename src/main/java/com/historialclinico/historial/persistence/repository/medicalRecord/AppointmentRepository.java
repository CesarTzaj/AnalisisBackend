
package com.historialclinico.historial.persistence.repository.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.AppointmentRepositoryDTO;
import com.historialclinico.historial.persistence.crud.medicalRecord.AppointmentCrud;
import com.historialclinico.historial.persistence.entity.medicalRecord.Appointment;
import com.historialclinico.historial.persistence.mapper.MedicalRecord.AppointmentMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentRepository implements AppointmentRepositoryDTO{

    @Autowired
    private AppointmentCrud crud;
    
    @Autowired
    private AppointmentMapper mapper;
    
    @Override
    public AppointmentDTO save(AppointmentDTO appointmentDTO) {
        Appointment appointment = mapper.toAppointment(appointmentDTO);
        return mapper.toAppointmentDTO(crud.save(appointment));
    }

    @Override
    public Optional<AppointmentDTO> getById(int id) {
        return crud.findById(id)
                .map(appoint -> mapper.toAppointmentDTO(appoint));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }
    
}
