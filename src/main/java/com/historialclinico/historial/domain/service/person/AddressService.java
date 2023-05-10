
package com.historialclinico.historial.domain.service.person;

import com.historialclinico.historial.domain.dto.person.AddressDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.AddressRepositoryDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepositoryDTO addressRepositoryDTO;
    
    public List<AddressDTO> getAll(){
        return addressRepositoryDTO.getAll();
    }
    public Optional<AddressDTO> getAddressById( int id){
        return addressRepositoryDTO.getAddressById(id);
    }
    public Boolean delete(int id){
        return getAddressById(id)
                .map(address -> {
                    addressRepositoryDTO.delete(id);
                    return true;
                })
                .orElse(false);
    }
    public AddressDTO save(AddressDTO addressDTO){
        return addressRepositoryDTO.save(addressDTO);                
    }
    
}
