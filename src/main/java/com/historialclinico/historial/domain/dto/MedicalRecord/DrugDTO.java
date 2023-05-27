
package com.historialclinico.historial.domain.dto.medicalRecord;


public class DrugDTO {
    
    private Integer id;
    private String medicamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    
}
