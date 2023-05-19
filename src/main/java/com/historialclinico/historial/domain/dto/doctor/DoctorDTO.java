
package com.historialclinico.historial.domain.dto.doctor;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import java.util.List;


public class DoctorDTO {
     private Integer id;
   
   private Integer licencia;
   private String turno;
   private String cargo;
   private String especialidad;
   private long personaId;
   private PersonDoctorDTO person;
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicencia() {
        return licencia;
    }

    public void setLicencia(Integer licencia) {
        this.licencia = licencia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
 
    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public PersonDoctorDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDoctorDTO person) {
        this.person = person;
    }

   
}
