package com.historialclinico.historial.domain.dto.medicalRecord;

public class ExamDTO {

    private Integer id;
    private String examId;
    private Integer consultaId;
    private ExamTypeDTO examType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
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
