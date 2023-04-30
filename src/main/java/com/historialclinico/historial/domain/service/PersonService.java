
package com.historialclinico.historial.domain.service;

import com.historialclinico.historial.domain.dto.PersonDTO;
import com.historialclinico.historial.domain.repositoryDTO.PersonRepositoryDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepositoryDTO personRepositoryDTO;
    
    public List<PersonDTO> getAll(){
        return personRepositoryDTO.getAll();
    }
    
    public PersonDTO save(PersonDTO personDTO){
    return personRepositoryDTO.save(personDTO);
    }
    
    public Optional<PersonDTO> getByPersonId(int id){
        return personRepositoryDTO.getByPeronId(id);
    }
    public Boolean delete(int id){
        return getByPersonId(id)
                .map(person ->{
                    personRepositoryDTO.delete(id);
                    return true;
                }).orElse(false);
    }
}   
