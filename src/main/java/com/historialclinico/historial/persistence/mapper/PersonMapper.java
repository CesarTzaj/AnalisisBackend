
package com.historialclinico.historial.persistence.mapper;

import com.historialclinico.historial.domain.dto.PersonDTO;
import com.historialclinico.historial.persistence.entity.Person;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface PersonMapper {
    
    @Mappings({
        @Mapping(source = "idPersona", target = "id"),
        @Mapping(source = "genero", target = "gender"),
        @Mapping(source = "edad", target = "age"),
        @Mapping(source = "primerNombre", target = "firstName"),
        @Mapping(source = "segundoNombre", target = "middleName"),
        @Mapping(source = "primerApellido", target = "lastName"),
        @Mapping(source = "segundoApellido", target = "secLastName"),
        @Mapping(source = "addresses", target = "addresses"),
        
    })
    PersonDTO toPersonDTO(Person person);
    List<PersonDTO> toPersonDTOs(List<Person> person);
    
    @InheritInverseConfiguration
    Person toPerson(PersonDTO personDTO);
}
