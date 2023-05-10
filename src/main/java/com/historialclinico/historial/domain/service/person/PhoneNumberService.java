package com.historialclinico.historial.domain.service.person;

import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.PhoneNumberRepositoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService {

    @Autowired
    private PhoneNumberRepositoryDTO phone;

    public Optional<PhoneNumberDTO> getById(int id) {
        return phone.getById(id);
    }

    public Boolean delete(int id) {
        return getById(id)
                .map(address -> {
                    phone.delete(id);
                    return true;
                })
                .orElse(false);
    }

    public PhoneNumberDTO save(PhoneNumberDTO phoneNumberDTO) {
        return phone.save(phoneNumberDTO);
    }
}
