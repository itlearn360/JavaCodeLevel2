package javalevel2;

import java.util.Hashtable;
import java.util.Map;

public class LibrarySystemTable {

	public static void main(String[] args) {
		// Create a HashTable to store book titles and their quantities
        Hashtable<String, Integer> bookInventory = new Hashtable<>();

        // 1. Add books and their quantities to the HashTable
        bookInventory.put("The Great Gatsby", 3);
        bookInventory.put("1984", 5);
        bookInventory.put("To Kill a Mockingbird", 4);

        // Display all books and their quantities
        System.out.println("Library Inventory: " + bookInventory);

        // 2. Look up the quantity of a specific book (e.g., "1984")
        String bookTitle = "1984";
        int quantity = bookInventory.get(bookTitle);
        System.out.println("Quantity of \"" + bookTitle + "\": " + quantity);

        // 3. Remove a book from the inventory (e.g., "The Great Gatsby")
        bookInventory.remove("The Great Gatsby");
        System.out.println("After removing \"The Great Gatsby\": " + bookInventory);

        // 4. Display the total number of books in the library
        System.out.println("Total books in the inventory: " + bookInventory.size());

        // 5. Display all books and their quantities using a loop
        System.out.println("Books in the library:");
        for (Map.Entry<String, Integer> entry : bookInventory.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

	}

}
