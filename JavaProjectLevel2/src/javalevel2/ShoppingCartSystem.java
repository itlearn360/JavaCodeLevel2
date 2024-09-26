package javalevel2;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCartSystem {

	public static void main(String[] args) {
		// Create a LinkedHashMap to store product names and their prices
        Map<String, Double> shoppingCart = new LinkedHashMap<>();

        // 1. Add items to the shopping cart (product name and price)
        shoppingCart.put("Laptop", 1200.00);
        shoppingCart.put("Smartphone", 800.00);
        shoppingCart.put("Headphones", 150.00);
        shoppingCart.put("Smartwatch", 250.00);

        // Display all items in the cart in the order they were added
        System.out.println("Shopping Cart: " + shoppingCart);

        // 2. Retrieve the price of a specific product (e.g., Laptop)
        String product = "Laptop";
        Double price = shoppingCart.get(product);
        System.out.println("Price of " + product + ": $" + price);

        // 3. Remove an item from the cart (e.g., Headphones)
        shoppingCart.remove("Headphones");
        System.out.println("After removing Headphones: " + shoppingCart);

        // 4. Display the total number of items in the cart
        System.out.println("Total items in the cart: " + shoppingCart.size());

        // 5. Display all items using a loop, in the order they were added
        System.out.println("Items in the cart:");
        for (Map.Entry<String, Double> entry : shoppingCart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: $" + entry.getValue());
        }

	}

}
