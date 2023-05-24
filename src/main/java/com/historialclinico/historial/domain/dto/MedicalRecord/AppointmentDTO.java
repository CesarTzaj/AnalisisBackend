
package com.historialclinico.historial.domain.dto.medicalRecord;

import java.util.List;


public class AppointmentDTO {

    private Integer id;
    private String date;
    private String time;
    private long personaId;
    private List<ConsultDTO> consults;
    private int clinicId;
    private ClinicDTO clinic;
    private String peso;
    private String altura;
    
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

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public List<ConsultDTO> getConsults() {
        return consults;
    }

    public void setConsults(List<ConsultDTO> consults) {
        this.consults = consults;
    }

    public ClinicDTO getClinic() {
        return clinic;
    }

    public void setClinic(ClinicDTO clinic) {
        this.clinic = clinic;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
}
