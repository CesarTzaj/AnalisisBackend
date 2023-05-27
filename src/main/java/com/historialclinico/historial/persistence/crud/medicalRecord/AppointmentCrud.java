
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Appointment;
import java.sql.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface AppointmentCrud extends CrudRepository<Appointment, Integer>{
    List<Appointment> findByPersonaIdOrderByDateDesc(long dpi);
    List<Appointment> findByPersonaIdAndDateBetweenOrderByDateDesc(long dpi, Date start, Date end);
}
