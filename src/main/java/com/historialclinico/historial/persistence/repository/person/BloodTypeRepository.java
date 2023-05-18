
package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.BloodTypeDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.BloodTypeRepositoryDTO;
import com.historialclinico.historial.persistence.crud.person.BloodTypeCrud;
import com.historialclinico.historial.persistence.entity.person.BloodType;
import com.historialclinico.historial.persistence.mapper.person.BloodTypeMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BloodTypeRepository implements BloodTypeRepositoryDTO{
    
    @Autowired
    private BloodTypeCrud crud;
    @Autowired
    private BloodTypeMapper mapper;
    
    @Override
    public List<BloodTypeDTO> getAll(){
        List<BloodType> bloodTypes = (List<BloodType>) crud.findAll();
        return mapper.toBloodTypeDTOs(bloodTypes);
    }
}
