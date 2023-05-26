
package com.historialclinico.historial.persistence.repository.Address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.domain.repositoryDTO.address.DepartmentRepositoryDTO;
import com.historialclinico.historial.persistence.crud.address.DepartmentCrud;
import com.historialclinico.historial.persistence.entity.person.address.Department;
import com.historialclinico.historial.persistence.mapper.address.DepartmentMapper;
import com.historialclinico.historial.persistence.mapper.address.DepartmentTownMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository implements DepartmentRepositoryDTO{
    
    @Autowired
    private DepartmentMapper mapper;
    @Autowired
    private DepartmentTownMapper mapperTown;
    @Autowired
    private DepartmentCrud crud;

    @Override
    public List<DepartmentDTO> findByOrderByDepartment() {
        List<Department> departments = (List<Department>)  crud.findByOrderByDepartamentoAsc();
        return mapper.toDepartmentDTOs(departments);
    }

    @Override
    public Optional<DepartmentDTO> findById(int id) {
        return crud.findById(id)
                .map(Department -> mapperTown.toDepartmentDTO(Department));
    }

}
