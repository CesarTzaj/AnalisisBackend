
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamCrud extends CrudRepository<Exam, Integer>{
    
}
