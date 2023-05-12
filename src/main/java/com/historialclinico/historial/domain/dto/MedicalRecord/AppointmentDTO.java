
package com.historialclinico.historial.domain.dto.MedicalRecord;

import java.util.List;


public class AppointmentDTO {

    private Integer id;
    private String date;
    private String time;
    private Integer medicalRecordId;
    private List<ConsultDTO> consults;

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

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public List<ConsultDTO> getConsults() {
        return consults;
    }

    public void setConsults(List<ConsultDTO> consults) {
        this.consults = consults;
    }

    
}
