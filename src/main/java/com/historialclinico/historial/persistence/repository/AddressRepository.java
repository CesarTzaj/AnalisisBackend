
package com.historialclinico.historial.persistence.repository;

import com.historialclinico.historial.domain.dto.AddressDTO;
import com.historialclinico.historial.domain.repositoryDTO.AddressRepositoryDTO;
import com.historialclinico.historial.persistence.crud.AddressCrudRepository;
import com.historialclinico.historial.persistence.entity.Address;
import com.historialclinico.historial.persistence.mapper.AddressMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepository implements AddressRepositoryDTO{
    
    @Autowired
    private AddressCrudRepository addressCrudRepository;
    
    @Autowired
    private AddressMapper addressMapper;
    
    @Override
    public List<AddressDTO> getAll() {
        List<Address> address = (List<Address>) addressCrudRepository.findAll();
        return addressMapper.toAddresDTOs(address);
    }

    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        Address address = addressMapper.toAddress(addressDTO);
        return addressMapper.toAddressDTO(addressCrudRepository.save(address));
    }
  
    
    
}
