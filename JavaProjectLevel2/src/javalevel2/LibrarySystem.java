package javalevel2;

import java.util.HashSet;
import java.util.Set;

public class LibrarySystem {

	public static void main(String[] args) {
		// Create a HashSet to store unique book titles
        Set<String> books = new HashSet<>();

        // 1. Add books to the HashSet
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("The Great Gatsby");
        books.add("To Kill a Mockingbird"); // Duplicate, will not be added

        // Display the collection of books
        System.out.println("Available books: " + books);

        // 2. Check if a specific book is available in the library
        String bookToCheck = "1984";
        boolean isAvailable = books.contains(bookToCheck);
        System.out.println("Is \"" + bookToCheck + "\" available? " + isAvailable);

        // 3. Remove a book that is no longer available
        books.remove("The Great Gatsby");
        System.out.println("After removing 'The Great Gatsby': " + books);

        // 4. Display the total number of unique books
        System.out.println("Total number of books: " + books.size());

        // 5. Display all available books using a loop
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println(book);
        }

	}

}
