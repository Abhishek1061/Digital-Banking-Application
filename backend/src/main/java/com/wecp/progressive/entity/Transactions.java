package com.wecp.progressive.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// @Entity
public class Transactions {

    // @Id
    // @GeneratedValue (strategy = GenerationType.IDENTITY)
    // @Column(name = "transaction_id")
    // private Integer transactionId;
    // // @Column(name = "account_id")
    // // private Integer accountId;
    // @Column(name = "amount")
    // private Double amount;
    // @Column(name = "transactionDate")
    // private Date transactionDate;
    // @Column(name = "transactionType")
    // private String transactionType;

    // @ManyToOne
    // @JoinColumn(name = "accounts_id")
    // private Accounts accounts;

    // public Transactions() {
    // }

    // public Transactions(Integer transactionId, Double amount, Date transactionDate, String transactionType,
    //         Accounts accounts) {
    //     this.transactionId = transactionId;
    //     this.amount = amount;
    //     this.transactionDate = transactionDate;
    //     this.transactionType = transactionType;
    //     this.accounts = accounts;
    // }

    // public Integer getTransactionId() {
    //     return transactionId;
    // }

    // public void setTransactionId(Integer transactionId) {
    //     this.transactionId = transactionId;
    // }

    // public Double getAmount() {
    //     return amount;
    // }

    // public void setAmount(Double amount) {
    //     this.amount = amount;
    // }

    // public Date getTransactionDate() {
    //     return transactionDate;
    // }

    // public void setTransactionDate(Date transactionDate) {
    //     this.transactionDate = transactionDate;
    // }

    // public String getTransactionType() {
    //     return transactionType;
    // }

    // public void setTransactionType(String transactionType) {
    //     this.transactionType = transactionType;
    // }

    // public Accounts getAccounts() {
    //     return accounts;
    // }

    // public void setAccounts(Accounts accounts) {
    //     this.accounts = accounts;
    // }

  
    private int transactionId;
    private int accountId;
    private double amount;
    private Date transactionDate;
    private String transactionType;
    
    public Transactions() {
    }

    public Transactions(int transactionId, int accountId, double amount, Date timeStamp, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = timeStamp;
        this.transactionType = transactionType;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    


    
}