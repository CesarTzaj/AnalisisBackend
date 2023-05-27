
package com.historialclinico.historial.persistence.mapper.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamTypeDTO;
import com.historialclinico.historial.persistence.entity.medicalRecord.ExamType;
import java.util.List;
import org.mapstruct.*;


@Mapper(componentModel = "spring")
public interface ExamTypeMapper {
    
    @Mapping(source = "laboratorio", target = "exam")
    ExamTypeDTO toExamTypeDTO(ExamType examType);
    List<ExamTypeDTO> toExamTypeDTOs(List<ExamType> examTypes);
    
    @InheritInverseConfiguration
    @Mapping(target = "exam", ignore = true)
    ExamType toExamType(ExamTypeDTO examTypeDTO);
}
