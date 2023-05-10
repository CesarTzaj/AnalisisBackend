
package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.AddressDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.AddressRepositoryDTO;
import com.historialclinico.historial.persistence.crud.person.AddressCrudRepository;
import com.historialclinico.historial.persistence.entity.person.Address;
import com.historialclinico.historial.persistence.mapper.person.AddressMapper;
import java.util.List;
import java.util.Optional;
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
    @Override
    public Optional<AddressDTO> getAddressById(int id) {
        return  addressCrudRepository.findById(id)
                .map(address -> addressMapper.toAddressDTO(address));
    }
    @Override
    public void delete(int id) {
        addressCrudRepository.deleteById(id);
    }

    
  
    
    
}
