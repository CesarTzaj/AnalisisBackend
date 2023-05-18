
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import java.util.Optional;


public interface ConsultRepsoitoryDTO {
    
    ConsultDTO save(ConsultDTO consultDTO);
    Optional<ConsultDTO> findById(int id);
    void delete(int id);
    
}
