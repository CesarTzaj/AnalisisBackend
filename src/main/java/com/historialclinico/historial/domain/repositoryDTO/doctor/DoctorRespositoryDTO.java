
package com.historialclinico.historial.domain.repositoryDTO.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import java.util.Optional;


public interface DoctorRespositoryDTO {

    Optional<DoctorDTO> findById(int id);
}
