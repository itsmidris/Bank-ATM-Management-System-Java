package com.bank.app;

public class SavingsAccount extends Account {

    @Override
    public void calculateInterest() {
        System.out.println("Savings Account Interest = 4%");
    }
    
    @Override
    public void accountType() {
        System.out.println("Savings Account");
    }
}
