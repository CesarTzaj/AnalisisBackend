
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.ExamType;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ExamTypeCrud extends CrudRepository<ExamType, Integer>{
    List<ExamType> findByLaboratorioContains(String lab);
}
