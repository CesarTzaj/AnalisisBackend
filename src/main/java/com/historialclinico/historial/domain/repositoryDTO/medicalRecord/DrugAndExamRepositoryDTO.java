
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.*;
import java.util.List;


public interface DrugAndExamRepositoryDTO {
    
    List<DrugDTO> getByDrugName(String name);
    List<ExamTypeDTO> getByLabName(String name);
    
    DrugDTO saveDrug(DrugDTO drugDTO);
    ExamTypeDTO saveLab(ExamTypeDTO examTypeDTO);
    
}
