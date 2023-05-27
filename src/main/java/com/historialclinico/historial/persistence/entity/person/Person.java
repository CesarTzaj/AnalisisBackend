package com.historialclinico.historial.persistence.entity.person;

import com.historialclinico.historial.persistence.entity.address.Address;
import com.historialclinico.historial.persistence.entity.doctor.Doctor;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "persona")
public class Person {

    @Id
    private long dpi;

    @Column(name = "generoid")
    private Integer genero;

    private Integer edad;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "sapellido")
    private String segundoApellido;
    @Column(name = "estado")
    private boolean status;

    private int bloodid;
    @OneToMany(mappedBy = "person")
    private List<Address> addresses;

    @OneToMany(mappedBy = "person")
    private List<Email> emails;

    @OneToMany(mappedBy = "person")
    private List<PhoneNumber> phoneNumbers;

    @ManyToOne
    @JoinColumn(name = "bloodid", insertable = false, updatable = false)
    private BloodType bloodType;

    @ManyToOne
    @JoinColumn(name = "generoid", insertable = false, updatable = false)
    private Genre genre;

    @OneToOne(mappedBy = "person")
    private Doctor doctor;

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getBloodid() {
        return bloodid;
    }

    public void setBloodid(int bloodid) {
        this.bloodid = bloodid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
