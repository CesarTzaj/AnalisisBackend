
package com.historialclinico.historial.domain.dto.address;

import java.util.List;


public class DepartmentDTO {
    private Integer id;
    private String department;
    private List<TownDTO> towns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<TownDTO> getTowns() {
        return towns;
    }

    public void setTowns(List<TownDTO> towns) {
        this.towns = towns;
    }

}
