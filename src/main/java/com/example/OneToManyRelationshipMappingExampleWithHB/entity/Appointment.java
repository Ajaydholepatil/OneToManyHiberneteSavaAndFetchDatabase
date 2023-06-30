package com.example.OneToManyRelationshipMappingExampleWithHB.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;

@Entity
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int appointment_no;
    private String appointment_date;
    private String appointment_time;
    private String doctor_name;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public int getAppointment_no() {
        return appointment_no;
    }

    public void setAppointment_no(int appointment_no) {
        this.appointment_no = appointment_no;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

