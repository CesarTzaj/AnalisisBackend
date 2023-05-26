
package com.historialclinico.historial.persistence.mapper.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import com.historialclinico.historial.persistence.entity.doctor.Doctor;
import com.historialclinico.historial.persistence.mapper.person.PersonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring", uses = {
    PersonMapper.class
})
public interface DoctorMapper {
    
    @Mappings({
        @Mapping(source = "licencia", target = "license"),
        @Mapping(source = "turno", target = "shift"),
        @Mapping(source = "cargo", target = "position"),
        @Mapping(source = "especialidad", target = "specialty"),
        @Mapping(source = "activo", target = "status"),
    })
    DoctorDTO toDoctorDTO(Doctor doctor);
}
