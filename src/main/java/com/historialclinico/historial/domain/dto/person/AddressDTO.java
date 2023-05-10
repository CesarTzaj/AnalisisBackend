
package com.historialclinico.historial.domain.dto.person;


public class AddressDTO {
    
    private Integer id;
    private String address;
    private long dpi;

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

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }
}
