package com.historialclinico.historial.domain.dto.person;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import java.util.List;

public class PersonDTO {

    private long dpi;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secLastName;
    private int gender;
    private Integer age;
    private int bloodid; 
    private BloodTypeDTO bloodType;
    private GenreDTO genre;
    private List<AddressDTO> addresses;
    private List<EmailDTO> emails;
    private List<PhoneNumberDTO> phoneNumbers;
    private List<AppointmentDTO> appointments;
    private boolean patient;

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

    public int getBloodid() {
        return bloodid;
    }

    public void setBloodid(int bloodid) {
        this.bloodid = bloodid;
    }

    public BloodTypeDTO getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodTypeDTO bloodType) {
        this.bloodType = bloodType;
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

    public List<AppointmentDTO> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<AppointmentDTO> appointments) {
        this.appointments = appointments;
    }

    public boolean isPatient() {
        return patient;
    }

    public void setPatient(boolean patient) {
        this.patient = patient;
    }
    
    
}
