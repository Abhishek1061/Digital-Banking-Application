// package com.wecp.progressive.entity;

// import java.math.BigDecimal;
// import java.util.List;

// import javax.persistence.CascadeType;
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToOne;
// import javax.persistence.OneToMany;

// import com.fasterxml.jackson.annotation.JsonIgnore;

// @Entity
// public class Accounts {

    // @Id
    // @GeneratedValue(strategy =  GenerationType.IDENTITY)
    // @Column(name = "account_id")
    // private Integer accountId;
    // @Column(name = "customer_id")
    // private Integer customerId;
    // @Column(name = "balance")
    // private BigDecimal balance;


    // @ManyToOne
    // private Customers customers;

    // @OneToMany(mappedBy = "accounts",cascade = CascadeType.ALL)
    // @JsonIgnore
    // private List<Transactions> transactions;

    // public Accounts() {
    // }

    // public Accounts(Integer accountId, Integer customerId, BigDecimal balance, Customers customers,
    //         List<Transactions> transactions) {
    //     this.accountId = accountId;
    //     this.customerId = customerId;
    //     this.balance = balance;
    //     this.customers = customers;
    //     this.transactions = transactions;
    // }

    // public Integer getAccountId() {
    //     return accountId;
    // }

    // public void setAccountId(Integer accountId) {
    //     this.accountId = accountId;
    // }

    // public Integer getCustomerId() {
    //     return customerId;
    // }

    // public void setCustomerId(Integer customerId) {
    //     this.customerId = customerId;
    // }

    // public BigDecimal getBalance() {
    //     return balance;
    // }

    // public void setBalance(BigDecimal balance) {
    //     this.balance = balance;
    // }

    // public Customers getCustomers() {
    //     return customers;
    // }

    // public void setCustomers(Customers customers) {
    //     this.customers = customers;
    // }

    // public List<Transactions> getTransactions() {
    //     return transactions;
    // }

    // public void setTransactions(List<Transactions> transactions) {
    //     this.transactions = transactions;
    // }

    // private int accountId;
    // private int customerId;
    // private double balance;
    
    // public Accounts() {
    // }

    // public Accounts(int accountId, int customerId, double balance) {
    //     this.accountId = accountId;
    //     this.customerId = customerId;
    //     this.balance = balance;
    // }

    // public int getAccountId() {
    //     return accountId;
    // }

    // public void setAccountId(int accountId) {
    //     this.accountId = accountId;
    // }

    // public int getCustomerId() {
    //     return customerId;
    // }

    // public void setCustomerId(int customerId) {
    //     this.customerId = customerId;
    // }

    // public double getBalance() {
    //     return balance;
    // }

    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }    
// }

package com.wecp.progressive.entity;

public class Accounts implements Comparable<Accounts> {

    private int accountId;
    private int customerId;
    private double balance;

    public Accounts() {
        // constrcutor
    }

    public Accounts(int accountId, int customerId, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }

    // Getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Accounts otherAccounts) {
        // Implement comparison logic based on account balance
        return Double.compare(this.getBalance(), otherAccounts.getBalance());
    }
}