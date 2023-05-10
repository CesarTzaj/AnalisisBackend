
package com.historialclinico.historial.domain.repositoryDTO.person;

import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import java.util.Optional;


public interface PhoneNumberRepositoryDTO {
    PhoneNumberDTO save(PhoneNumberDTO phoneNumberDTO);
    Optional<PhoneNumberDTO> getById(int id);
    void delete(int id);
}
