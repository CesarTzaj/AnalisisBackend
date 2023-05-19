
package com.historialclinico.historial.persistence.repository.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import com.historialclinico.historial.domain.repositoryDTO.doctor.DoctorRespositoryDTO;
import com.historialclinico.historial.persistence.crud.doctor.DoctorCrud;
import com.historialclinico.historial.persistence.entity.doctor.Doctor;
import com.historialclinico.historial.persistence.mapper.doctor.DoctorMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepository implements DoctorRespositoryDTO{
    
    @Autowired
    private DoctorCrud crud;
    @Autowired
    private DoctorMapper mapper;

    @Override
    public Optional<DoctorDTO> findById(int id) {
        return crud.findById(id)
                .map(doctor -> mapper.toDoctorDTO(doctor));
    }
    
    
    
}
