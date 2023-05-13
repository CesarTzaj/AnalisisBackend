
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.MedicalRecord.ExamDTO;
import com.historialclinico.historial.persistence.entity.MedicalRecord.Exam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExamMapper {
    
    @Mapping(source = "examType", target = "exam")
    ExamDTO toExamDTO(Exam exam);
    
}
