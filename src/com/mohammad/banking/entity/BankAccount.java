package com.mohammad.banking.entity;

public class BankAccount implements java.io.Serializable {
    
    private int id;
    private int number;
    private String owner;
    private long balance;

    public BankAccount() {
    }

    public BankAccount(int number, String owner, long balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
 
}
