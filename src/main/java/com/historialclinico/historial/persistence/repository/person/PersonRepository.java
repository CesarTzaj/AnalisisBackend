package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.PersonDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.PersonRepositoryDTO;
import com.historialclinico.historial.domain.service.person.AddressService;
import com.historialclinico.historial.persistence.crud.person.PersonCrud;
import com.historialclinico.historial.persistence.entity.person.Person;
import com.historialclinico.historial.persistence.mapper.person.PersonMapper;
import com.historialclinico.historial.domain.dto.person.AddressDTO;
import com.historialclinico.historial.persistence.crud.person.AddressCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository implements PersonRepositoryDTO {

    @Autowired
    private PersonCrud crud;

    @Autowired
    private PersonMapper mapper;

    @Autowired
    private AddressService addressService;
    @Autowired
    private AddressCrudRepository addressCrud;

    @Override
    public List<PersonDTO> getAll() {
        List<Person> people = (List<Person>) crud.findAll();
        return mapper.toPersonDTOs(people);
    }

    @Override
    public PersonDTO save(PersonDTO personDTO) {
        Person person = mapper.toPerson(personDTO);
        return mapper.toPersonDTO(crud.save(person));
    }

    @Override
    public Optional<PersonDTO> getByDpi(long id) {
        return crud.findByDpiAndPatient(id, true)
                .map(person -> mapper.toPersonDTO(person));
    }

    @Override
    public void delete(long id) {
        
        crud.deleteById(id);
    }

}
