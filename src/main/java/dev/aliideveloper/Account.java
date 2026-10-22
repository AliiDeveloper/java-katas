package dev.aliideveloper;

public class Account {
        private String owner;
        private double balance;


    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount<=0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balance+=amount;
    }

    public void withdraw(double amount){

        if (this.balance-amount<0){
            throw new IllegalStateException("Not enough balance");
        }
        this.balance-=amount;
    }

}
