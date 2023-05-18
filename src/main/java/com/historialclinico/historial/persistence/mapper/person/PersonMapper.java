
package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.persistence.mapper.person.AddressMapper;
import com.historialclinico.historial.domain.dto.person.PersonDTO;
import com.historialclinico.historial.persistence.entity.person.Person;
import com.historialclinico.historial.persistence.mapper.MedicalRecord.AppointmentMapper;
import java.util.List;
import javax.xml.transform.Source;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", 
   uses = {AddressMapper.class, 
     EmailMapper.class,
     PhoneNumberMapper.class, 
     AppointmentMapper.class, 
     BloodTypeMapper.class,
     GenreMapper.class
   })
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
    @Mappings({
        @Mapping(target = "appointments", ignore = true),
        @Mapping(target = "bloodType", ignore = true),
        @Mapping(target = "genre", ignore = true),
    })           
    Person toPerson(PersonDTO personDTO);
}
