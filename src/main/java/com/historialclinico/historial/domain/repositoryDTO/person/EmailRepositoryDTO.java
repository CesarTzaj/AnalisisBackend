package com.historialclinico.historial.domain.repositoryDTO.person;

import com.historialclinico.historial.domain.dto.person.EmailDTO;
import java.util.Optional;

public interface EmailRepositoryDTO {
    
    EmailDTO save(EmailDTO emailDTO);
    Optional<EmailDTO> getByEmailId(int id);
    void delete(int id);
    
}
