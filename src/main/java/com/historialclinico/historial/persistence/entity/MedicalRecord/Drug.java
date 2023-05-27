
package com.historialclinico.historial.persistence.entity.medicalRecord;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "medicamentos")
public class Drug {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String medicamento;
    
    @OneToMany(mappedBy = "drug")
    private List<Prescription> prescription;

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

    public List<Prescription> getPrescription() {
        return prescription;
    }

    public void setPrescription(List<Prescription> prescription) {
        this.prescription = prescription;
    }
 
}
