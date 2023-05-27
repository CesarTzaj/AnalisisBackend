
package com.historialclinico.historial.persistence.entity.medicalRecord;

import jakarta.persistence.*;


@Entity
@Table(name = "laboratorio")
public class Exam {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "laboratorioid")
    private int examId;
    
    private String comentario;
    @Column(name = "consultaid", nullable = false )
    private Integer consultaId;
    
    @ManyToOne
    @JoinColumn(name = "consultaid", insertable = false, updatable = false)
    private Consult consult;
    
    @OneToOne
    @JoinColumn(name = "laboratorioid", insertable = false, updatable = false)
    private ExamType examType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Integer consultaId) {
        this.consultaId = consultaId;
    }

    public Consult getConsult() {
        return consult;
    }

    public void setConsult(Consult consult) {
        this.consult = consult;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    
}
