package atm;

import java.util.Scanner;

public class ATMInterface {
	 private static double balance = 1000.00;
	    private static int registeredPin;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("==== ATM PIN Registration ====");
	        System.out.print("Create a 4-digit PIN: ");
	        registeredPin = sc.nextInt();

	        System.out.println("PIN registered successfully!");

	        // Authentication step
	        System.out.println("\n==== Welcome to Simple ATM ====");
	        System.out.print("Enter your 4-digit PIN to login: ");
	        int enteredPin = sc.nextInt();

	        if (enteredPin != registeredPin) {
	            System.out.println("Incorrect PIN. Access Denied.");
	            return;
	        }

	        int choice;

	        do {
	            System.out.println("\n==== ATM Menu ====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");

	            System.out.print("Choose an option: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    deposit(sc);
	                    break;
	                case 3:
	                    withdraw(sc);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using our ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }

	    public static void checkBalance() {
	        System.out.printf("Your current balance is: ₹%.2f%n", balance);
	    }

	    public static void deposit(Scanner sc) {
	        System.out.print("Enter amount to deposit: ₹");
	        double amount = sc.nextDouble();

	        if (amount <= 0) {
	            System.out.println("Invalid amount. Must be greater than zero.");
	            return;
	        }

	        balance += amount;
	        System.out.printf("₹%.2f deposited successfully.%n", amount);
	    }

	    public static void withdraw(Scanner sc) {
	        System.out.print("Enter amount to withdraw: ₹");
	        double amount = sc.nextDouble();

	        if (amount <= 0) {
	            System.out.println("Invalid amount. Must be greater than zero.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance!");
	        } else {
	            balance -= amount;
	            System.out.printf("₹%.2f withdrawn successfully.%n", amount);
	        }
	    }
	}