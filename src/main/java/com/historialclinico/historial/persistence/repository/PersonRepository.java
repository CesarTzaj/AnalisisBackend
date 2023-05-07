
package com.historialclinico.historial.persistence.repository;

import com.historialclinico.historial.domain.dto.PersonDTO;
import com.historialclinico.historial.domain.repositoryDTO.PersonRepositoryDTO;
import com.historialclinico.historial.persistence.crud.AddressCrudRepository;
import com.historialclinico.historial.persistence.crud.PersonCrud;
import com.historialclinico.historial.persistence.entity.Person;
import com.historialclinico.historial.persistence.mapper.AddressMapper;
import com.historialclinico.historial.persistence.mapper.PersonMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository implements PersonRepositoryDTO{
    @Autowired
    private PersonCrud crud;
    @Autowired
    private PersonMapper mapper;
    
    
    @Autowired
    private AddressCrudRepository addressCrudRepository;
    
    @Autowired
    private AddressMapper addressMapper;
    
    @Autowired
    private AddressRepository addressesa;
    @Override
    public List<PersonDTO> getAll() {
        List<Person> people = (List<Person>) crud.findAll();
        return mapper.toPersonDTOs(people);
    }

    @Override
    public PersonDTO save(PersonDTO personDTO) {
        Person person = mapper.toPerson(personDTO);
        person.getAddresses().forEach((address)->{ addressMapper.toAddressDTO(addressCrudRepository.save(address));
                });
               
        return mapper.toPersonDTO(crud.save(person));
    }

    @Override
    public Optional<PersonDTO> getByPeronId(int id) {
        return crud.findByIdPersona(id)
                .map(peron -> mapper.toPersonDTO(peron));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }
}
