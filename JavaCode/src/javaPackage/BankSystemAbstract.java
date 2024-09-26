package javaPackage;

public class BankSystemAbstract {

	public static void main(String[] args) {
		// Create a SavingsAccount object
		SavingsAccount myAccount = new SavingsAccount(500.0, "SA12345");

		// Access public methods (Data Abstraction in action)
		myAccount.showAccountDetails();
		myAccount.deposit(200.0);
		myAccount.withdraw(100.0);
		System.out.println("Final Balance: $" + myAccount.checkBalance());

	}

}

//Abstract class: BankAccount
abstract class BankAccount {
	// Private attribute, hidden from the user (internal state)
	private double balance;

	// Constructor to initialize balance
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	// Public method to deposit money (abstracts away internal balance management)
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Public method to withdraw money (abstracts away internal balance management)
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: $" + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Public method to check balance
	public double checkBalance() {
		return balance; // User can see the balance but cannot directly manipulate it
	}

	// Abstract method (must be implemented by subclasses)
	public abstract void showAccountDetails();
}



//Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
	private String accountNumber;

	// Constructor for SavingsAccount
	public SavingsAccount(double initialBalance, String accountNumber) {
		super(initialBalance); // Call parent class constructor to set initial balance
		this.accountNumber = accountNumber;
	}

	// Implement abstract method
	@Override
	public void showAccountDetails() {
		System.out.println("Savings Account Number: " + accountNumber);
		System.out.println("Current Balance: $" + checkBalance());
	}
}