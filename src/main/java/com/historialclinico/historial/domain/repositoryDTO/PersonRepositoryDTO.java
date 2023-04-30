
package com.historialclinico.historial.domain.repositoryDTO;

import com.historialclinico.historial.domain.dto.PersonDTO;
import java.util.List;
import java.util.Optional;


public interface PersonRepositoryDTO {
    List<PersonDTO> getAll();
    PersonDTO save(PersonDTO personDTO);
    Optional<PersonDTO> getByPeronId(int id);
    void delete (int id);
}
