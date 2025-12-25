// Import statements to use Java's built-in classes for lists and user input
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class represents a single book with title, author, and ISBN
class Book {
    // Private fields to store book information
    private String title;
    private String author;
    private String isbn;

    // Constructor to create a new book with given details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to get the book's title
    public String getTitle() {
        return title;
    }

    // Method to get the book's author
    public String getAuthor() {
        return author;
    }

    // Method to get the book's ISBN
    public String getIsbn() {
        return isbn;
    }

    // Method to return a string representation of the book
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Library class manages a collection of books
class Library {
    // List to hold all books in the library
    private List<Book> books;

    // Constructor to initialize the book list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

// Main class that runs the library management program
public class LibraryApp {
    public static void main(String[] args) {
        // Create a new library instance
        Library library = new Library();
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // Variable to control the main loop
        boolean running = true;

        // Main loop to show menu and handle user choices
        while (running) {
            // Display the menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            // Handle the user's choice using a switch statement
            switch (choice) {
                case 1:
                    // Prompt for book details
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    // Create a new book and add it to the library
                    Book book = new Book(title, author, isbn);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    // Display all books
                    library.viewBooks();
                    break;
                case 3:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Close the scanner to free resources
        scanner.close();
    }
}