
package com.historialclinico.historial.domain.dto.person.address;


public class AddressDTO {
    
    private Integer id;
    private String address;
    private String colAppart;
    private int zone;
    private int municipioId;
    private int departmento;
    private long dpi;
    private DepartmentDTO department;
    private TownDTO town;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColAppart() {
        return colAppart;
    }

    public void setColAppart(String colAppart) {
        this.colAppart = colAppart;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public int getDepartmento() {
        return departmento;
    }

    public void setDepartmento(int departmento) {
        this.departmento = departmento;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public TownDTO getTown() {
        return town;
    }

    public void setTown(TownDTO town) {
        this.town = town;
    }

   
}
