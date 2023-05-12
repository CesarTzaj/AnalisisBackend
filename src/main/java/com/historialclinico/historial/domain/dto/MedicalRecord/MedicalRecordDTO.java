package com.historialclinico.historial.domain.dto.MedicalRecord;

import com.historialclinico.historial.domain.dto.person.PersonDTO;
import java.util.List;

public class MedicalRecordDTO {

    private Integer id;
    private Integer bloodTypeid;
    private String hight;
    private String weight;
    private long personid;    
    private BloodTypeDTO bloodTypeDTO; 
    List<AppointmentDTO> appointmentDTOs;
   // private PersonDTO personDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBloodTypeid() {
        return bloodTypeid;
    }

    public void setBloodTypeid(Integer bloodTypeid) {
        this.bloodTypeid = bloodTypeid;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public long getPersonid() {
        return personid;
    }

    public void setPersonid(long personid) {
        this.personid = personid;
    }

    public BloodTypeDTO getBloodTypeDTO() {
        return bloodTypeDTO;
    }

    public void setBloodTypeDTO(BloodTypeDTO bloodTypeDTO) {
        this.bloodTypeDTO = bloodTypeDTO;
    }

    public List<AppointmentDTO> getAppointmentDTOs() {
        return appointmentDTOs;
    }

    public void setAppointmentDTOs(List<AppointmentDTO> appointmentDTOs) {
        this.appointmentDTOs = appointmentDTOs;
    }

    
}
