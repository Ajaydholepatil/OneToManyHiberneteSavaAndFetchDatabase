package com.example.OneToManyRelationshipMappingExampleWithHB.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity


public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patient_id;
    private String patient_name;
    private String patient_age;
    @OneToMany
    @JoinColumn(name = "Patient_id")
    private List<Appointment> appointmentList;

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
}
}
