
package com.historialclinico.historial.persistence.repository.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.*;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.DrugAndExamRepositoryDTO;
import com.historialclinico.historial.persistence.crud.medicalRecord.*;
import com.historialclinico.historial.persistence.entity.medicalRecord.*;
import com.historialclinico.historial.persistence.mapper.medicalRecord.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DrugAndExamRepository implements DrugAndExamRepositoryDTO{

    @Autowired
    private DrugCrud drugCrud;
    @Autowired
    private DrugMapper drugMapper;
    @Autowired
    private ExamTypeCrud examTypeCrud;
    @Autowired
    private ExamTypeMapper examTypeMapper;

    @Override
    public List<DrugDTO> getByDrugName(String name) {
        List<Drug> drugs = (List<Drug>) drugCrud.findByMedicamentoContains(name);
        return drugMapper.toDrugDTOs(drugs);
    }

    @Override
    public List<ExamTypeDTO> getByLabName(String name) {
        List<ExamType> examTypes = (List<ExamType>) examTypeCrud.findByLaboratorioContains(name);
        return examTypeMapper.toExamTypeDTOs(examTypes);
    }

    @Override
    public DrugDTO saveDrug(DrugDTO drugDTO) {
        Drug drug = drugMapper.toDrug(drugDTO);
        return drugMapper.toDrugDTO(drugCrud.save(drug));
    }

    @Override
    public ExamTypeDTO saveLab(ExamTypeDTO examTypeDTO) {
        ExamType examType = examTypeMapper.toExamType(examTypeDTO);
        return examTypeMapper.toExamTypeDTO(examTypeCrud.save(examType));
    }
    
    
    
}
