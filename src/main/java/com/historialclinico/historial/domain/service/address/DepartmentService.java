
package com.historialclinico.historial.domain.service.address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.domain.dto.address.TownDTO;
import com.historialclinico.historial.domain.repositoryDTO.address.DepartmentRepositoryDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepositoryDTO department;
    
    public List<DepartmentDTO> getAll(){
        return department.findByOrderByDepartment();
    }
    
    public List<TownDTO> getByDepId(int id){
        return department.findByDepId(id);
    }
}
