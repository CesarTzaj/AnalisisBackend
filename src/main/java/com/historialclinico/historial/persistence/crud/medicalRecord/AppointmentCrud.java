
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Appointment;
import org.springframework.data.repository.CrudRepository;


public interface AppointmentCrud extends CrudRepository<Appointment, Integer>{
    
}
