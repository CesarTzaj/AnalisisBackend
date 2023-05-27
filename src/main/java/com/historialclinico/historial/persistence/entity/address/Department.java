
package com.historialclinico.historial.persistence.entity.address;

import com.historialclinico.historial.persistence.entity.address.Town;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "departamento")
public class Department {
    @Id
    private Integer id;
    
    private String departamento;
    
    
    @OneToMany(mappedBy = "department")
    private List<Address> addresses;
    @OneToMany(mappedBy = "department")
    private List<Town> towns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Town> getTowns() {
        return towns;
    }

    public void setTowns(List<Town> towns) {
        this.towns = towns;
    }
 
}
