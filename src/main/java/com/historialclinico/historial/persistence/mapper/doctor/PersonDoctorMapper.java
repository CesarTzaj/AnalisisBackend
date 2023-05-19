 
package com.historialclinico.historial.persistence.mapper.doctor;

import com.historialclinico.historial.domain.dto.doctor.PersonDoctorDTO;
import com.historialclinico.historial.persistence.entity.doctor.PersonDoctor;
import com.historialclinico.historial.persistence.mapper.person.AddressMapper;
import com.historialclinico.historial.persistence.mapper.person.EmailMapper;
import com.historialclinico.historial.persistence.mapper.person.GenreMapper;
import com.historialclinico.historial.persistence.mapper.person.PhoneNumberMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {
    EmailMapper.class,
    PhoneNumberMapper.class, 
    GenreMapper.class,
    AddressMapper.class
})
public interface PersonDoctorMapper {
    
    @Mappings({
         @Mapping(source = "genero", target = "gender"),
        @Mapping(source = "edad", target = "age"),
        @Mapping(source = "primerNombre", target = "firstName"),
        @Mapping(source = "segundoNombre", target = "middleName"),
        @Mapping(source = "primerApellido", target = "lastName"),
        @Mapping(source = "segundoApellido", target = "secLastName"),
    })
    PersonDoctorDTO toPersonDoctorDTO(PersonDoctor personDoctor);
}
