package com.historialclinico.historial.domain.dto.MedicalRecord;

import com.historialclinico.historial.domain.dto.person.PersonDTO;

public class MedicalRecordDTO {

    private Integer id;
    private Integer bloodTypeid;
    private String hight;
    private String weight;
    private long personid;    
    private BloodTypeDTO bloodTypeDTO;    
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

    
}
