
package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.PhoneNumberRepositoryDTO;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PhoneNumberRepository implements PhoneNumberRepositoryDTO{

    @Override
    public PhoneNumberDTO save(PhoneNumberDTO phoneNumberDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<PhoneNumberDTO> getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
