
package com.historialclinico.historial.domain.service.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.ConsultRepsoitoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultService {
    
    @Autowired
    private ConsultRepsoitoryDTO consult;
    
    public ConsultDTO save(ConsultDTO consultDTO){
        return consult.save(consultDTO);
    }
    
    public Optional<ConsultDTO> findById(int id){
        return consult.findById(id);
    }
    
    public Boolean delete(int id){
        return findById(id)
                .map(consul->{
                    consult.delete(id);
                    return true;
                })
                .orElse(false);       
    }
    
}
