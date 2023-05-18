
package com.historialclinico.historial.domain.service.person;

import com.historialclinico.historial.domain.dto.person.BloodTypeDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.BloodTypeRepositoryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodTypeService {
    
    @Autowired
    private BloodTypeRepositoryDTO service;
    
    public List<BloodTypeDTO> getAll(){
        return  service.getAll();
    }
}
