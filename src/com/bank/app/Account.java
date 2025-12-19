package com.bank.app;

public abstract class Account {
	
	public abstract void calculateInterest();
	
	public void accountType() {
		System.out.println("General Bank Account");
	}
}
