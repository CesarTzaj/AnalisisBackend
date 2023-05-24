
package com.historialclinico.historial.persistence.entity.person.address;

import com.historialclinico.historial.persistence.entity.person.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "direccion")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "direccionid")
    private Integer idDireccion;
    
    @Column(name = "calle")
    private String direccion;
    @Column(name = "edificio_colonia")
    private String colAppart;
    @Column(name = "zona")
    private int zone;
    @Column(name = "municipioid")
    private int municipioId;
     @Column(name = "departamentoid")
    private int departmento;
    @Column(name = "personaid")   
    private long dpi;
    
    @ManyToOne
    @JoinColumn(name = "municipioid", insertable = false, updatable = false)
    private Town town;
    
    @ManyToOne
    @JoinColumn(name = "departamentoid", insertable = false, updatable = false)
    private Department department;
    
    @ManyToOne
    @JoinColumn(name = "personaid", insertable = false, updatable = false)
    private Person person;
    
    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public String getColAppart() {
        return colAppart;
    }

    public void setColAppart(String colAppart) {
        this.colAppart = colAppart;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public int getDepartmento() {
        return departmento;
    }

    public void setDepartmento(int departmento) {
        this.departmento = departmento;
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    } 

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
