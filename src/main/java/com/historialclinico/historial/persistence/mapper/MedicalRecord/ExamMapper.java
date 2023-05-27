
package com.historialclinico.historial.persistence.mapper.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.Exam;
import org.mapstruct.InheritInverseConfiguration;

import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {ExamTypeMapper.class})
public interface ExamMapper {
    
    @Mapping(source = "comentario", target = "commet")
    ExamDTO toExamDTO(Exam exam);
    
    @InheritInverseConfiguration
    @Mapping(target = "consult", ignore = true)
    @Mapping(target = "examType", ignore = true)        
    Exam toExam(ExamDTO examDTO);
}
