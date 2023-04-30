
package com.historialclinico.historial.domain.service;

import com.historialclinico.historial.domain.dto.AddressDTO;
import com.historialclinico.historial.domain.repositoryDTO.AddressRepositoryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepositoryDTO addressRepositoryDTO;
    
    public List<AddressDTO> getAll(){
        return addressRepositoryDTO.getAll();
    }
    public AddressDTO save(AddressDTO addressDTO){
        return addressRepositoryDTO.save(addressDTO);
    }
}
