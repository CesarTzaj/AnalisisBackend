
package com.historialclinico.historial.domain.dto.doctor;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import com.historialclinico.historial.domain.dto.person.PersonDTO;
import java.util.List;


public class DoctorDTO {
     private Integer id;
   
   private Integer license;
   private String shift;
   private String position;
   private String specialty;
   private boolean status;
   private long personaId;
   private PersonDTO person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }
   
}
