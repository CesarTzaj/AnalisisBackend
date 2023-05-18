
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Prescription;
import org.springframework.data.repository.CrudRepository;


public interface PrescriptionCrud extends CrudRepository<Prescription, Integer>{
    
}
