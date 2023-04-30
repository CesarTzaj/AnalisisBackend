package com.historialclinico.historial.domain.repositoryDTO;

import com.historialclinico.historial.domain.dto.AddressDTO;
import java.util.List;

public interface AddressRepositoryDTO {

    List<AddressDTO> getAll();
    AddressDTO save (AddressDTO addressDTO);
}
