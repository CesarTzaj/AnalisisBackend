
package com.historialclinico.historial.persistence.entity.medicalRecord;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "laboratori_tipo")
public class ExamType {
    @Id
    private Integer id;
    
    private String laboratorio;
    
    @OneToOne(mappedBy = "examType")
    private Exam exam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    
}
