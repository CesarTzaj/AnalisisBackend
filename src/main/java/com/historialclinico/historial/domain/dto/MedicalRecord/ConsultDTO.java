
package com.historialclinico.historial.domain.dto.MedicalRecord;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;

public class ConsultDTO {
    
    private Integer id;
    private String date;
    private String time;
    private Integer citaId;
    private Integer doctorId;
   // private DoctorDTO doctor;
  //  private AppointmentDTO appointment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCitaId() {
        return citaId;
    }

    public void setCitaId(Integer citaId) {
        this.citaId = citaId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
/*
    public AppointmentDTO getAppointment() {
        return appointment;
    }

    public void setAppointment(AppointmentDTO appointment) {
        this.appointment = appointment;
    }

   */
    
}
