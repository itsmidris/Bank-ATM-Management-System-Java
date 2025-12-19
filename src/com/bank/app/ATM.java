package com.bank.app;

import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private static final int CORRECT_PIN = 1234;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == CORRECT_PIN) {
                showMenu(sc);
                return;
            } else {
                attempts--;
                System.out.println("Wrong PIN. Attempts left: " + attempts);
            }
        }

        System.out.println("ATM blocked. Try later.");
        sc.close();
    }

    private void showMenu(Scanner sc) {
        int choice;

        do {
            System.out.println("\n---- ATM MENU ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 4);
    }
}
