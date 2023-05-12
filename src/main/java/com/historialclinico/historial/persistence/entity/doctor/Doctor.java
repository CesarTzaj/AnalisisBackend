
package com.historialclinico.historial.persistence.entity.doctor;

import com.historialclinico.historial.domain.dto.MedicalRecord.ConsultDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "doctorid")
   private Integer id;
   
   private Integer licencia;
   private String turno;
   private String cargo;
   private String especialidad;
  /* 
   @OneToMany(mappedBy = "doctor")
   private ConsultDTO consult;
   */
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
    public ConsultDTO getConsult() {
        return consult;
    }

    public void setConsult(ConsultDTO consult) {
        this.consult = consult;
    }
   */
}
