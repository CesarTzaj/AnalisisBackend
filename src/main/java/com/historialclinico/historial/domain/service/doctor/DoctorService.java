
package com.historialclinico.historial.domain.service.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import com.historialclinico.historial.domain.repositoryDTO.doctor.DoctorRespositoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    
    @Autowired
    private DoctorRespositoryDTO doctorRepo;
    
    public Optional<DoctorDTO> findById(int id){
        return doctorRepo.findById(id);
    }
    
}
