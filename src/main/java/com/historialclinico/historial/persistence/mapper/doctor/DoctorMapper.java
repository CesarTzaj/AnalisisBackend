
package com.historialclinico.historial.persistence.mapper.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import com.historialclinico.historial.persistence.entity.doctor.Doctor;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {
    PersonDoctorMapper.class
})
public interface DoctorMapper {
    
    
    DoctorDTO toDoctorDTO(Doctor doctor);
}
