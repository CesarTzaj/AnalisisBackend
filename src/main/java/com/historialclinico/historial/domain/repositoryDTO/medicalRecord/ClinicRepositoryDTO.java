
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ClinicDTO;
import java.util.List;


public interface ClinicRepositoryDTO {
    List<ClinicDTO> getAll();
}
