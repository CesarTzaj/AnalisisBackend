
package com.historialclinico.historial.persistence.crud.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import com.historialclinico.historial.persistence.entity.doctor.Doctor;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface DoctorCrud extends CrudRepository<Doctor, Integer>{
    
}
