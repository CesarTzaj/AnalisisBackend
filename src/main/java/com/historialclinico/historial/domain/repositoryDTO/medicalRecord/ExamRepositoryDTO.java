
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamDTO;
import java.util.Optional;


public interface ExamRepositoryDTO {
    
    ExamDTO save(ExamDTO examDTO);
    Optional<ExamDTO> findById(int  id);
    void  delete(int id);
}
