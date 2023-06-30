package com.example.OneTwoOneExamaple2.Domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "bank")

public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int bank_Id;

    public int getBank_Id() {
        return bank_Id;
    }

    public void setBank_Id(int bank_Id) {
        this.bank_Id = bank_Id;
    }

    public Customer getCustemor() {
        return customer;
    }

    public void setCustemor(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctNo() {
        return AcctNo;
    }

    public void setAcctNo(String acctNo) {
        AcctNo = acctNo;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    @OneToOne
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)

    private Customer customer;

    private String name;
    private String AcctNo;
    private String IFSC;



}
