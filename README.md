# Library Management Application

## Project Description

This is a simple Java console-based library management application. It allows users to add books to a library collection and view all the books currently in the library. The application runs in the terminal and provides a basic menu-driven interface.

## Features

- **Add Book**: Add a new book by entering its title, author, and ISBN.
- **View All Books**: Display a list of all books in the library.
- **Exit**: Quit the application.

## Technologies Used

- **Java**: Core programming language (JDK 8 or higher).
- **Scanner**: For reading user input from the console.
- **ArrayList**: Part of Java's Collections Framework for storing the list of books.

## How to Run the Application

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system.
- A terminal or command prompt to run the application.

### Steps to Run

1. **Ensure the File is Present**:
   - Make sure `LibraryApp.java` is in your current directory.

2. **Compile the Application**:
   - Open a terminal and navigate to the directory containing `LibraryApp.java`.
   - Compile the code using:
     ```
     javac LibraryApp.java
     ```

3. **Run the Application**:
   - Execute the compiled program with:
     ```
     java LibraryApp
     ```

4. **Use the Application**:
   - Follow the on-screen menu to add books or view the list.
   - Choose option 1 to add a book (enter title, author, ISBN).
   - Choose option 2 to view all books.
   - Choose option 3 to exit.

### Example Usage

- Run the app and select "1" to add a book.
- Enter details like: Title: "Java Basics", Author: "John Doe", ISBN: "123456789".
- Select "2" to see the list of books.
- Select "3" to exit.

## Contributing

This is a basic implementation. Feel free to extend it with more features like user management or data persistence.

## License

This project is open-source under the MIT License.