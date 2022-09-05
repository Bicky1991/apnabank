package com.apnabank.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class BankAccount {

    @Id
    private int acNo;
    private float acBalance;
    private String acHolderName;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private AcType acType;


//    public BankAccount() {
//    }

//    public BankAccount(int acNo, float acBalance, String acHolderName, String acType) {
//        this.acNo = acNo;
//        this.acBalance = acBalance;
//        this.acHolderName = acHolderName;
//        this.acType = acType;
//    }
//
//    @Override
//    public String toString() {
//        return "BankAccount{" +
//                "acNo=" + acNo +
//                ", acBalance=" + acBalance +
//                ", acHolderName='" + acHolderName + '\'' +
//                ", acType='" + acType + '\'' +
//                '}';
//    }
}
