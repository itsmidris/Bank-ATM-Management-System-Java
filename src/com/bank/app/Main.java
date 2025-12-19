package com.bank.app;

public class Main {
	
	//Runtime Poly
	public static void showInterest(Account acc) {
        acc.calculateInterest();
        acc.accountType();
    }

    public static void main(String[] args) {
    	
        // Static
        Bank.showBankDetails();
    	
    	BankAccount acc1 = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(2000);
        
        acc1.deposit(500);
        acc1.withdraw(700);
        acc1.showBalance();

        acc2.deposit(1000);
        acc2.withdraw(300);
        acc2.showBalance();
        
        acc1.deposit(-100);
        acc1.withdraw(0);
        
        System.out.println("Deposit count: " + acc1.getDepositCount());
        System.out.println("Withdraw count: " + acc1.getWithdrawCount());
        
        Account savings = new SavingsAccount();
        Account current = new CurrentAccount();

        showInterest(savings);
        showInterest(current);
        
        System.out.println("\n--- Starting ATM Machine ---");

        ATM atm = new ATM(acc1);   // ATM works on acc1
        atm.start();
        
        Bank.showBankDetails();
        
    }
}
