package com.historialclinico.historial.domain.repositoryDTO.person;

import com.historialclinico.historial.domain.dto.person.address.AddressDTO;
import java.util.List;
import java.util.Optional;

public interface AddressRepositoryDTO {

    List<AddressDTO> getAll();
    AddressDTO save (AddressDTO addressDTO);
    Optional<AddressDTO> getAddressById(int id);
    void delete (int id);
}
