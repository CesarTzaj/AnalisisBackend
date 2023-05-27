
package com.historialclinico.historial.persistence.repository.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import com.historialclinico.historial.domain.repositoryDTO.medicalRecord.ConsultRepsoitoryDTO;
import com.historialclinico.historial.persistence.crud.medicalRecord.ConsultCrud;
import com.historialclinico.historial.persistence.entity.medicalRecord.Consult;
import com.historialclinico.historial.persistence.mapper.medicalRecord.ConsultMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConsultRepository implements ConsultRepsoitoryDTO{
    
    @Autowired
    private ConsultMapper mapper;
    @Autowired
    private ConsultCrud crud;

    @Override
    public ConsultDTO save(ConsultDTO consultDTO) {
        Consult consult = mapper.toConsult(consultDTO);
        return mapper.toConsultDTO(crud.save(consult));
    }
    
     @Override
    public Optional<ConsultDTO> findById(int id) {
        return crud.findById(id)
                .map(consult -> mapper.toConsultDTO(consult));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }

   
    
    
}
