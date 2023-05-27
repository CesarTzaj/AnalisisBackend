package com.historialclinico.historial.domain.dto.medicalRecord;

public class ExamDTO {

    private Integer id;
    private int examId;
    private String commet;
    private Integer consultaId;
    private ExamTypeDTO examType;

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

    public String getCommet() {
        return commet;
    }

    public void setCommet(String commet) {
        this.commet = commet;
    }

    public Integer getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Integer consultaId) {
        this.consultaId = consultaId;
    }

    public ExamTypeDTO getExamType() {
        return examType;
    }

    public void setExamType(ExamTypeDTO examType) {
        this.examType = examType;
    }

   
}
