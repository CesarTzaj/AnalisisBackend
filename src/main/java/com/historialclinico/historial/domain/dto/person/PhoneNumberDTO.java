
package com.historialclinico.historial.domain.dto.person;


public class PhoneNumberDTO {
        
    private Integer id;
    private String phoneNumber;
    private long dpi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }
    
}
