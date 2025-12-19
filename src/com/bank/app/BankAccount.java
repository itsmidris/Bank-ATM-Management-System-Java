package com.bank.app;

public class BankAccount {
	
	private double balance; // Encapsulation ?
	
	//counters
	private int depositCount = 0;
	private int withdrawCount = 0;
	
	public BankAccount(double balance) {
//		this.balance = balance;
		// Validation
		if(balance < 0) {
			this.balance = 0;
		}else {
			this.balance = balance;
			   // static usage
		}
		Bank.totalAccounts++;
		System.out.println("Account created with balance: " + this.balance);
	}
	
	public double getBalance() { 		//getter
		return balance;
	}
	
	public void showBalance() {
		System.out.println("Current balance: " + balance);
	}
	
//	public void deposit(double amount) {
//		if (amount > 0) {
//	        balance += amount;
//	    } else {
//	        System.out.println("Invalid deposit amount");
//	    }
//	}
	
	public void deposit (double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount");
			return;
		}
		balance += amount;
		depositCount++;
	}
	
//	public void withdraw(double amount) {
////        if(amount > 0 && amount <= balance) {
////            balance -= amount;
////        }
//		if (amount <= 0) {
//	        System.out.println("Invalid withdrawal amount");
//	    } 
//	    else if (amount > balance) {
//	        System.out.println("Insufficient balance");
//	    } 
//	    else {
//	        balance -= amount;
//	    }
//    }	
	
	public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }

        if (balance - amount < 500) {
            System.out.println("Minimum balance of 500 must be maintained");
            return;
        }

        balance -= amount;
        withdrawCount++;
    }
	
	public int getDepositCount() {
        return depositCount;
    }
	
	public int getWithdrawCount() {
        return withdrawCount;
    }

}
