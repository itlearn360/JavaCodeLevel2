package javaPackage;

public class PaymentInterface {

	public static void main(String[] args) {
		// Create objects of different payment methods
        Payment paymentMethod;

        // Using Credit Card for payment
        paymentMethod = new CreditCardPayment();
        paymentMethod.processPayment(250.00);

        // Using Debit Card for payment
        paymentMethod = new DebitCardPayment();
        paymentMethod.processPayment(150.00);

        // Using PayPal for payment
        paymentMethod = new PayPalPayment();
        paymentMethod.processPayment(300.00);

	}

}


//Interface: Payment
interface Payment {
 // Abstract method to process payment
 void processPayment(double amount);
}

//Class implementing Payment interface for Credit Card payments
class CreditCardPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount);
 }
}

//Class implementing Payment interface for Debit Card payments
class DebitCardPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing debit card payment of $" + amount);
 }
}

//Class implementing Payment interface for PayPal payments
class PayPalPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount);
 }
}