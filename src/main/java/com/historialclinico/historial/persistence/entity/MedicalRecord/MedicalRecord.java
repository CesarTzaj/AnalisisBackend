package com.historialclinico.historial.persistence.entity.MedicalRecord;

import com.historialclinico.historial.persistence.entity.person.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "expediente")
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipo_sangre")
    private Integer bloodTypeid;

    @Column(name = "estatura")
    private String hight;

    @Column(name = "peso")
    private String weight;

    @Column(name = "personaid")
    private long personid;

    @OneToOne
    @JoinColumn(name = "tipo_sangre", insertable = false, updatable = false)
    private BloodType bloodType;

    @OneToOne
    @JoinColumn(name = "personaid", updatable = false, insertable = false)
    private Person person;
    
    @OneToMany(mappedBy = "medicalRecord")
    private List<Appointment> appointments;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }


    
    
}
