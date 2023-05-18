
package com.historialclinico.historial.persistence.repository.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.ExamRepositoryDTO;
import com.historialclinico.historial.persistence.crud.medicalRecord.ExamCrud;
import com.historialclinico.historial.persistence.entity.medicalRecord.Exam;
import com.historialclinico.historial.persistence.mapper.MedicalRecord.ExamMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRespository implements ExamRepositoryDTO{

    @Autowired
    private ExamMapper mapper;
    @Autowired
    private ExamCrud crud;
    
    @Override
    public ExamDTO save(ExamDTO examDTO) {
        Exam exam = mapper.toExam(examDTO);
        return mapper.toExamDTO(crud.save(exam));
    }

    @Override
    public Optional<ExamDTO> findById(int id) {
        return crud.findById(id).
                map(exam -> mapper.toExamDTO(exam));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }
    
}
