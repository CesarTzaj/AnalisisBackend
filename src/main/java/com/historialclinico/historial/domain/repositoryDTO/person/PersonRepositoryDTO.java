
package com.historialclinico.historial.domain.repositoryDTO.person;

import com.historialclinico.historial.domain.dto.person.PersonDTO;
import java.util.List;
import java.util.Optional;


public interface PersonRepositoryDTO {
    List<PersonDTO> getAll();
    PersonDTO save(PersonDTO personDTO);
    Optional<PersonDTO> getByDpi(long id);
    void delete (long id);
}
