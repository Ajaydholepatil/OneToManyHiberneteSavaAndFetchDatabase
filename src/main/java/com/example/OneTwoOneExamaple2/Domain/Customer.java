package com.example.OneTwoOneExamaple2.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue
    @GenericGenerator(name = "gen" , parameters = "foreign" ,parameter = {@org.hibernate.annotations.Parameter(name = "property",value = "student")})
     private int bank_id;

    private String customerName;

    private String location;

    private String Address;

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public  void setCustomer(Customer customer) {
    }
}

