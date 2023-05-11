
package com.historialclinico.historial.domain.dto.person;

import com.historialclinico.historial.domain.dto.MedicalRecord.MedicalRecordDTO;
import java.util.List;


public class PersonDTO {
    private long dpi;
    private String gender;
    private Integer age;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secLastName;
    private List<AddressDTO> addresses;
    private List<EmailDTO> emails;
    private List<PhoneNumberDTO> phoneNumbers;
    private MedicalRecordDTO medicalRecordDTO;

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
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

    public MedicalRecordDTO getMedicalRecordDTO() {
        return medicalRecordDTO;
    }

    public void setMedicalRecordDTO(MedicalRecordDTO medicalRecordDTO) {
        this.medicalRecordDTO = medicalRecordDTO;
    }
}
