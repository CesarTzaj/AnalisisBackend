
package com.historialclinico.historial.domain.dto.doctor;

import com.historialclinico.historial.domain.dto.MedicalRecord.ConsultDTO;
import java.util.List;


public class DoctorDTO {
     private Integer id;
   
   private Integer licencia;
   private String turno;
   private String cargo;
   private String especialidad;
  // private List<ConsultDTO> consult;
   
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
/*
    public List<ConsultDTO> getConsult() {
        return consult;
    }

    public void setConsult(List<ConsultDTO> consult) {
        this.consult = consult;
    }

*/
   
}
