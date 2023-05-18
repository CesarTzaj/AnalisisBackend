
package com.historialclinico.historial.domain.repositoryDTO.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.PrescriptionDTO;
import java.util.Optional;

public interface PrescriptionRepositoryDTO {
    PrescriptionDTO save (PrescriptionDTO prescriptionDTO);
    Optional<PrescriptionDTO> findById(int id);
    void delete(int id);
}
