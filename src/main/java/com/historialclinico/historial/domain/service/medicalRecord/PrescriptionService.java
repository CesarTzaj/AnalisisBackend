
package com.historialclinico.historial.domain.service.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.PrescriptionDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.PrescriptionRepositoryDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepositoryDTO prescription;
    
    public PrescriptionDTO save(PrescriptionDTO prescriptionDTO){
        return prescription.save(prescriptionDTO);
    }
    
    public Optional<PrescriptionDTO> findByid(int id){
        return prescription.findById(id);
    }
    
    public boolean delete(int id){
        return findByid(id)
                .map(prescipt -> {
                    prescription.delete(id);
                    return true;
                }).orElse(false);
    }
}
