
package com.historialclinico.historial.persistence.entity.medicalRecord;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.sql.*;


import java.util.List;
import java.util.TimeZone;
import org.hibernate.annotations.TimeZoneStorage;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "cita")
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "citaid")
    private Integer id;
    
    
    @Column(name = "fecha")

    private Date date;
    @Column(name = "hora")
    
    private String time;
    
    @Column(name = "personaid")
    private long personaId;
    
    @Column(name = "clinicaid")
    private int clinicId;
    
    private String peso;
    private String altura;
    
    @OneToMany(mappedBy = "appointment")
    private List<Consult> consults;
    
    @ManyToOne
    @JoinColumn(name = "clinicaid", insertable = false, updatable = false)
    private Clinic clinic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public List<Consult> getConsults() {
        return consults;
    }

    public void setConsults(List<Consult> consults) {
        this.consults = consults;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
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
