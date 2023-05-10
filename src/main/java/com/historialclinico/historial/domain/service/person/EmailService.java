package com.historialclinico.historial.domain.service.person;

import com.historialclinico.historial.domain.dto.person.EmailDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.EmailRepositoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepositoryDTO emailRepositoryDTO;
    
    public Optional<EmailDTO> getById(int id){
        return emailRepositoryDTO.getByEmailId(id);
    }

    public Boolean delte(int id){
        return getById(id)
                .map(email ->{
                    emailRepositoryDTO.delete(id);
                    return true;
                })
                .orElse(false);
    }
    
    public EmailDTO save(EmailDTO emailDTO){
        return emailRepositoryDTO.save(emailDTO);
    }
}
