
package com.historialclinico.historial.domain.dto.doctor;

import com.historialclinico.historial.domain.dto.person.AddressDTO;
import com.historialclinico.historial.domain.dto.person.BloodTypeDTO;
import com.historialclinico.historial.domain.dto.person.EmailDTO;
import com.historialclinico.historial.domain.dto.person.GenreDTO;
import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import java.util.List;


public class PersonDoctorDTO {
     
    
    private long dpi;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secLastName;
    private int gender;
    private Integer age;
    private GenreDTO genre;
    private List<AddressDTO> addresses;
    private List<EmailDTO> emails;
    private List<PhoneNumberDTO> phoneNumbers;
    

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GenreDTO getGenre() {
        return genre;
    }

    public void setGenre(GenreDTO genre) {
        this.genre = genre;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    public List<EmailDTO> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailDTO> emails) {
        this.emails = emails;
    }

    public List<PhoneNumberDTO> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
}
