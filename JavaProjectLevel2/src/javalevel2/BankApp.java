package javalevel2;

import java.util.Scanner;

public class BankApp {
	
	// Constructor to initialize balance
    public BankApp(double initialBalance) {
        balance = initialBalance;
    }

	public static void main(String[] args) {
		BankApp account = new BankApp(500.00);  // Initial balance is $500
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            // Attempt to withdraw money
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            // Handle invalid input and insufficient funds
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Thank you for using our banking system.");
        }

        scanner.close();

	}

	
    private double balance;

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. You only have $" + balance + " in your account.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Your new balance is: $" + balance);
    }
}
