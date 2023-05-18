
package com.historialclinico.historial.domain.service.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ClinicDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.ClinicRepositoryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicService {
    
    @Autowired
    private ClinicRepositoryDTO clinic;
    
    public List<ClinicDTO> getAll(){
        return clinic.getAll();
    }
}
