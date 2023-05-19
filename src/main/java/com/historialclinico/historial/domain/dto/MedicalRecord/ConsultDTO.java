
package com.historialclinico.historial.domain.dto.medicalRecord;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import java.util.List;

public class ConsultDTO {
    
    private Integer id;
    private Integer citaId;
    private Integer doctorId;
    private List<PrescriptionDTO> prescriptions;
    private List<ExamDTO> exams;
    private DoctorDTO doctor;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<PrescriptionDTO> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<PrescriptionDTO> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<ExamDTO> getExams() {
        return exams;
    }

    public void setExams(List<ExamDTO> exams) {
        this.exams = exams;
    }

    public DoctorDTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
    }

}
