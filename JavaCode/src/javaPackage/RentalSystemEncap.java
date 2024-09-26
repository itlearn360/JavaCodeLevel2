package javaPackage;

public class RentalSystemEncap {

	public static void main(String[] args) {
		// Create a Car object
		CarSystem myCar = new CarSystem("Toyota Corolla", 2021, 50.0);

		// Display initial car details
		myCar.displayCarDetails();

		// Use getter and setter methods to update and access car details
		System.out.println("\nUpdating car details using setter methods...");

		myCar.setModel("Honda Civic");
		myCar.setYear(2018); // Valid year
		myCar.setRentalPricePerDay(55.0); // Valid price

		// Trying to set invalid values
		myCar.setYear(1995); // Invalid year (should be > 2000)
		myCar.setRentalPricePerDay(-20); // Invalid price (should be positive)

		// Display updated car details
		System.out.println("\nUpdated Car Details:");
		myCar.displayCarDetails();

	}

}

//Car class to demonstrate encapsulation
class CarSystem {
	// Private fields (encapsulated)
	private String model;
	private int year;
	private double rentalPricePerDay;

	// Constructor to initialize the Car object
	public CarSystem(String model, int year, double rentalPricePerDay) {
		this.model = model;
		this.year = year;
		this.rentalPricePerDay = rentalPricePerDay;
	}

	// Getter for model (retrieve the model)
	public String getModel() {
		return model;
	}

	// Setter for model (set the model)
	public void setModel(String model) {
		this.model = model;
	}

	// Getter for year (retrieve the year)
	public int getYear() {
		return year;
	}

	// Setter for year (set the year)
	public void setYear(int year) {
		if (year > 2000) { // Simple validation: Only allow year greater than 2000
			this.year = year;
		} else {
			System.out.println("Invalid year. Must be greater than 2000.");
		}
	}

	// Getter for rental price (retrieve the rental price per day)
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	// Setter for rental price (set the rental price per day)
	public void setRentalPricePerDay(double rentalPricePerDay) {
		if (rentalPricePerDay > 0) { // Simple validation: Only allow positive rental prices
			this.rentalPricePerDay = rentalPricePerDay;
		} else {
			System.out.println("Rental price must be positive.");
		}
	}

	// Method to display car details
	public void displayCarDetails() {
		System.out.println("Car Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
	}
}