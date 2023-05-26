
package com.historialclinico.historial.persistence.entity.doctor;


import com.historialclinico.historial.persistence.entity.medicalRecord.Consult;
import com.historialclinico.historial.persistence.entity.person.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "doctorid")
   private Integer id;
   private Integer licencia;
   private String turno;
   private String cargo;
   private String especialidad;
   private boolean activo;
   @Column(name = "personaid")
   private long personaId;
   
   @OneToOne
   @JoinColumn(name = "personaid", updatable = false, insertable = false)
   private Person person;
  
   @OneToMany(mappedBy = "doctor")
   private List<Consult> consult;
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicencia() {
        return licencia;
    }

    public void setLicencia(Integer licencia) {
        this.licencia = licencia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Consult> getConsult() {
        return consult;
    }

    public void setConsult(List<Consult> consult) {
        this.consult = consult;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

   
}
