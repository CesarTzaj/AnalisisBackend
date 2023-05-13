
package com.historialclinico.historial.persistence.entity.MedicalRecord;

import com.historialclinico.historial.persistence.entity.doctor.Doctor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "consulta")
public class Consult {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consultaid")
    private Integer id;
    
    @Column(name = "fecha")
    private String date;
    
    @Column(name = "hora")
    private String time;
    
    @Column(name = "citaid")
    private Integer citaId;
    
    @Column(name = "doctorid")
    private Integer doctorId;

    @ManyToOne
    @JoinColumn(name = "citaid", insertable = false, updatable = false)
    private Appointment appointment;

    @OneToMany(mappedBy = "consult")
    private List<Prescription> prescriptions;
            
    @OneToMany(mappedBy = "consult")
    private List<Exam> exams;
  /*  
    @ManyToOne
    @JoinColumn(name = "doctorid", insertable = false, updatable = false)
    private Doctor doctor;
    */
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

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
/*
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

*/
    
}
