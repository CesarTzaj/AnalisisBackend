
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Clinic;
import org.springframework.data.repository.CrudRepository;


public interface ClinicCrud extends CrudRepository<Clinic, Integer>{
    
}
