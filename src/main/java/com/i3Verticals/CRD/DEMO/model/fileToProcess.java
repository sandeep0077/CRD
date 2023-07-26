package com.i3Verticals.CRD.DEMO.model;


import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class fileToProcess {
    private String merchantName;
    private String merchantNum;
    private String feedDate;
    private String portfolio;
    private String isoName;
    private String source;
    private String system;
    private int prin;
    private double debitAmt;
    private double creditAmt;
    private int rejectedDebit;
    private int rejectedCredit;
    private String status;
}
