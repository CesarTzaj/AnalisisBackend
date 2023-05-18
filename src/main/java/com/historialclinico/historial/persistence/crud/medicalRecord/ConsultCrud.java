
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Consult;
import org.springframework.data.repository.CrudRepository;


public interface ConsultCrud extends CrudRepository<Consult, Integer>{
    
}
