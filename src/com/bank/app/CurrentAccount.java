package com.bank.app;

public class CurrentAccount extends Account {

    @Override
    public void calculateInterest() {
        System.out.println("Current Account Interest = 0%");
    }
    
    @Override
    public void accountType() {
        System.out.println("Current Account");
    }
    
}
