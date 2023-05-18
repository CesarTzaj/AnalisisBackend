
package com.historialclinico.historial.persistence.repository.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.PrescriptionDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.PrescriptionRepositoryDTO;
import com.historialclinico.historial.persistence.crud.medicalRecord.PrescriptionCrud;
import com.historialclinico.historial.persistence.entity.medicalRecord.Prescription;
import com.historialclinico.historial.persistence.mapper.MedicalRecord.PrescriptionMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PrescriptionRepository implements PrescriptionRepositoryDTO{
    
    @Autowired
    private PrescriptionMapper mapper;
    @Autowired
    private PrescriptionCrud crud;

    @Override
    public PrescriptionDTO save(PrescriptionDTO prescriptionDTO) {
        Prescription prescription = mapper.toPrescription(prescriptionDTO);
        return mapper.toPrescriptionDTO(crud.save(prescription));
    }

    @Override
    public Optional<PrescriptionDTO> findById(int id) {
        return crud.findById(id)
                .map(appoint -> mapper.toPrescriptionDTO(appoint));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }
    
}
