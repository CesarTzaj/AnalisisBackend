package com.historialclinico.historial.domain.dto.medicalRecord;

public class PrescriptionDTO {

    private Integer id;
    private int drugId;
    private int dosage;
    private String comment;
    private Integer consultaId;
    private DrugDTO drug;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public Integer getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Integer consultaId) {
        this.consultaId = consultaId;
    }

    public DrugDTO getDrug() {
        return drug;
    }

    public void setDrug(DrugDTO drug) {
        this.drug = drug;
    }

    
    
}
