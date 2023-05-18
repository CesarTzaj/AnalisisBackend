
package com.historialclinico.historial.persistence.mapper.MedicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Exam;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExamMapper {
    
    @Mapping(source = "examType", target = "exam")
    ExamDTO toExamDTO(Exam exam);
    
    @InheritInverseConfiguration
    @Mapping(target = "consult", ignore = true)
    Exam toExam(ExamDTO examDTO);
}
