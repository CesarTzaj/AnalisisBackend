
package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.persistence.mapper.person.AddressMapper;
import com.historialclinico.historial.domain.dto.person.PersonDTO;
import com.historialclinico.historial.persistence.entity.person.Person;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, EmailMapper.class, PhoneNumberMapper.class})
public interface PersonMapper {
    
    /**
     *
     * @param person
     * @return
     */
    @Mappings({
        @Mapping(source = "genero", target = "gender"),
        @Mapping(source = "edad", target = "age"),
        @Mapping(source = "primerNombre", target = "firstName"),
        @Mapping(source = "segundoNombre", target = "middleName"),
        @Mapping(source = "primerApellido", target = "lastName"),
        @Mapping(source = "segundoApellido", target = "secLastName"),
        @Mapping(source = "emails", target = "emails"),
    })
    PersonDTO toPersonDTO(Person person);
    List<PersonDTO> toPersonDTOs(List<Person> person);
    

    @InheritInverseConfiguration
    Person toPerson(PersonDTO personDTO);
}