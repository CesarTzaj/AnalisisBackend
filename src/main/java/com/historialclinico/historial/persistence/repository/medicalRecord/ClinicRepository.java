
package com.historialclinico.historial.persistence.repository.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ClinicDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.ClinicRepositoryDTO;
import com.historialclinico.historial.persistence.crud.medicalRecord.ClinicCrud;
import com.historialclinico.historial.persistence.entity.medicalRecord.Clinic;
import com.historialclinico.historial.persistence.mapper.medicalRecord.ClinicMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClinicRepository implements ClinicRepositoryDTO{
    
    @Autowired
    private ClinicCrud crud;
    @Autowired
    private ClinicMapper mapper;
    
    @Override
    public List<ClinicDTO> getAll(){
        List<Clinic> clinics = (List<Clinic>) crud.findAll();
        return mapper.toClinicDTOs(clinics);
    }
}
