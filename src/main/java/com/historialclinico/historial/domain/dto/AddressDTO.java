
package com.historialclinico.historial.domain.dto;


public class AddressDTO {
    
    private Integer id;
    private String address;
    private int personId;

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

    public int getPersonaId() {
        return personId;
    }

    public void setPersonaId(int personId) {
        this.personId = personId;
    }
    

}
