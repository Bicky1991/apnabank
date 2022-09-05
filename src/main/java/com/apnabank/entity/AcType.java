package com.apnabank.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class AcType {

    @Id
    private int acTypeId;
    private String loan;
    private String current;
    private String saving;

    @OneToOne(mappedBy = "acType")
    @JsonBackReference
    private BankAccount bankAccount;
}
