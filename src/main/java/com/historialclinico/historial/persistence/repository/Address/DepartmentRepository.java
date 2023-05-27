package com.historialclinico.historial.persistence.repository.Address;

import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.domain.dto.address.TownDTO;
import com.historialclinico.historial.domain.repositoryDTO.address.DepartmentRepositoryDTO;
import com.historialclinico.historial.persistence.crud.address.DepartmentCrud;
import com.historialclinico.historial.persistence.crud.address.TownCrud;
import com.historialclinico.historial.persistence.entity.address.Department;
import com.historialclinico.historial.persistence.entity.address.Town;
import com.historialclinico.historial.persistence.mapper.address.DepartmentMapper;
import com.historialclinico.historial.persistence.mapper.address.TownMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository implements DepartmentRepositoryDTO {

    @Autowired
    private DepartmentMapper mapper;

    @Autowired
    private DepartmentCrud crud;

    @Autowired
    private TownCrud townCrudcrud;
    @Autowired
    private TownMapper townMappermapper;

    @Override
    public List<DepartmentDTO> findByOrderByDepartment() {
        List<Department> departments = (List<Department>) crud.findByOrderByDepartamentoAsc();
        return mapper.toDepartmentDTOs(departments);
    }

    @Override
    public List<TownDTO> findByDepId(int id) {
        List<Town> towns = (List<Town>) townCrudcrud.findByDepartmentIdOrderByMunicipioAsc(id);
        return townMappermapper.toTownDTOs(towns);
    }
}
