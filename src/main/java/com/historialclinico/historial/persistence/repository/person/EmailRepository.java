
package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.EmailDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.EmailRepositoryDTO;
import com.historialclinico.historial.persistence.crud.person.EmailCrud;
import com.historialclinico.historial.persistence.mapper.person.EmailMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository  implements EmailRepositoryDTO{
    
    @Autowired
    private EmailCrud crud;
    
    @Autowired
    private EmailMapper mapper;

    @Override
    public EmailDTO save(EmailDTO emailDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<EmailDTO> getByEmailId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
