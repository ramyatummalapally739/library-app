import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryApp {

    // Stores book name and availability (true = available, false = not available)
    private static Map<String, Boolean> books = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        books.put("Java Basics", true);
        books.put("Python Guide", false);

        System.out.println("Enter book name to check availability:");
        String bookName = scanner.nextLine();

        if (books.containsKey(bookName)) {
            if (books.get(bookName)) {
                System.out.println("Book is available");
            } else {
                System.out.println("Book is not available");
            }
        } else {
            System.out.println("Book not found");
        }

        scanner.close();
    }
}
