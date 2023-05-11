
package com.historialclinico.historial.persistence.entity.MedicalRecord;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consulta")
public class Cunsult {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consultaid")
    private Integer id;
    
    @Column(name = "fecha")
    private String date;
    
    @Column(name = "hora")
    private String time;
    
    
}
