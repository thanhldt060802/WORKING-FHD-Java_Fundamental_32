package bai12_01;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String id;
    private String pin;
    private int balance;
    
    public Account(String id, String pin, int balance) {
        this.id = id;
        this.pin = pin;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", pin=" + pin + ", balance=" + balance + "]";
    }
}