package org.lessons.java.snacks;

public class ContoBancario {
    private String accountNumber;
    private double balance;

    public ContoBancario(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getBalance() {
        return "Current balance: €" + String.format("%.2f", this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }
}
