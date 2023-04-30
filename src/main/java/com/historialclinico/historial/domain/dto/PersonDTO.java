
package com.historialclinico.historial.domain.dto;

import java.util.List;


public class PersonDTO {
    private Integer id;
    private String gender;
    private Integer age;
    private double dpi;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secLastName;
    private List<AddressDTO> addresses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getDpi() {
        return dpi;
    }

    public void setDpi(double dpi) {
        this.dpi = dpi;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecLastName() {
        return secLastName;
    }

    public void setSecLastName(String secLastName) {
        this.secLastName = secLastName;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }

 
}
