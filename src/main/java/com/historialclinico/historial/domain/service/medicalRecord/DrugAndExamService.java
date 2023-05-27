
package com.historialclinico.historial.domain.service.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.*;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.DrugAndExamRepositoryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugAndExamService {
    
    @Autowired
    private DrugAndExamRepositoryDTO drugAndExam;
    
    public List<DrugDTO> getByDrugName(String name){
        return drugAndExam.getByDrugName(name);
    }
    
    public DrugDTO saveDrug(DrugDTO drugDTO){
        return drugAndExam.saveDrug(drugDTO);
    }
    
    public List<ExamTypeDTO> getByLabName(String lab){
        return drugAndExam.getByLabName(lab);
    }
    
    public ExamTypeDTO saveLab(ExamTypeDTO examTypeDTO){
        return drugAndExam.saveLab(examTypeDTO);
    }
}
