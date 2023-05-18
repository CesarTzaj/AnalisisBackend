
package com.historialclinico.historial.domain.service.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.ExamRepositoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    
    @Autowired
    private ExamRepositoryDTO examRepository;
    
    public ExamDTO save(ExamDTO examDTO){
        return examRepository.save(examDTO);
    }
    
    public Optional<ExamDTO> findById(int id){
        return examRepository.findById(id);
    }
    
    public Boolean delete(int id){
        return findById(id)
                .map(exam ->{
                    examRepository.delete(id);
                    return true;
                }).orElse(false);
    }
}
