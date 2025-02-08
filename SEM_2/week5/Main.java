package week5;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private final String bookID;
    private String title;
    private String author;
    private String genre;
    private boolean availabilityStatus;

    // Constructors
    public Book(String bookID, String title, String author, String genre, boolean availabilityStatus) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    // Getters
    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return availabilityStatus; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setAvailabilityStatus(boolean availabilityStatus) { this.availabilityStatus = availabilityStatus; }

    // Methods
    public void updateBookDetails(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public boolean borrowBook() {
        if (availabilityStatus) {
            availabilityStatus = false;
            return true;  // Successfully borrowed
        } else {
            return false; // Book is already borrowed
        }
    }

    public void returnBook() {
        availabilityStatus = true;
    }

    public String displayDetails() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Available: " + availabilityStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookID.equals(book.bookID); // Books are equal if they have the same ID
    }

    @Override
    public int hashCode() {
        return bookID.hashCode(); // Keep hashCode consistent with equals
    }
}

class FictionBook extends Book {
    private String subGenre;

    public FictionBook(String bookID, String title, String author, String genre, boolean availabilityStatus, String subGenre) {
        super(bookID, title, author, genre, availabilityStatus);
        this.subGenre = subGenre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Sub-Genre: " + subGenre;
    }
}

class NonFictionBook extends Book {
    private String fieldOfStudy;

    public NonFictionBook(String bookID, String title, String author, String genre, boolean availabilityStatus, String fieldOfStudy) {
        super(bookID, title, author, genre, availabilityStatus);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Field of Study: " + fieldOfStudy;
    }
}

class User {
    private final String userID;
    private String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Constructor
    public User(String userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    // Getters
    public String getUserID() { return userID; }
    public String getName() { return name; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " didn't borrow this book.");
        }
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + " borrowed: ");
            for (Book book : borrowedBooks) {
                System.out.println(book.displayDetails());
            }
        }
    }
}

class Catalog {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)) { // Prevent duplicate book entries
            books.add(book);
        } else {
            System.out.println("Book with ID " + book.getBookID() + " is already in the catalog.");
        }
    }

    public void displayAvailableBooks() {
        boolean found = false;
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.displayDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }

    public Book findBookById(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String bookID, User user) {
        Book book = findBookById(bookID);
        if (book != null) {
            user.borrowBook(book);
        } else {
            System.out.println("Book not found in catalog.");
        }
    }

    public void returnBook(String bookID, User user) {
        Book book = findBookById(bookID);
        if (book != null) {
            user.returnBook(book);
        } else {
            System.out.println("Book not found in catalog.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Catalog catalog = new Catalog();
        ArrayList<User> users = new ArrayList<>();

        // Add Books
        addBooks(input, catalog);

        // Add Users
        addUsers(input, users);

        // Interactive Menu
        interactiveMenu(input, catalog, users);

        input.close();
    }

    private static void addBooks(Scanner input, Catalog catalog) {
        System.out.print("Enter number of books to add: ");
        int numBooks = getValidIntInput(input);
        input.nextLine(); // Consume newline

        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            String bookID = input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Author: ");
            String author = input.nextLine();
            System.out.print("Genre: ");
            String genre = input.nextLine();
            System.out.print("Is Fiction? (yes/no): ");
            String isFiction = input.nextLine().toLowerCase();

            if (isFiction.equals("yes")) {
                System.out.print("Enter Sub-Genre: ");
                String subGenre = input.nextLine();
                catalog.addBook(new FictionBook(bookID, title, author, genre, true, subGenre));
            } else {
                System.out.print("Enter Field of Study: ");
                String fieldOfStudy = input.nextLine();
                catalog.addBook(new NonFictionBook(bookID, title, author, genre, true, fieldOfStudy));
            }
        }
    }

    private static void addUsers(Scanner input, ArrayList<User> users) {
        System.out.print("\nEnter number of users to register: ");
        int numUsers = getValidIntInput(input);
        input.nextLine(); // Consume newline

        for (int i = 0; i < numUsers; i++) {
            System.out.println("\nEnter details for User " + (i + 1) + ":");
            System.out.print("User ID: ");
            String userID = input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            users.add(new User(userID, name));
        }
    }

    private static void interactiveMenu(Scanner input, Catalog catalog, ArrayList<User> users) {
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. View Borrowed Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = getValidIntInput(input);
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    catalog.displayAvailableBooks();
                    break;
                case 2:
                    borrowBook(input, catalog, users);
                    break;
                case 3:
                    returnBook(input, catalog, users);
                    break;
                case 4:
                    viewBorrowedBooks(input, users);
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void borrowBook(Scanner input, Catalog catalog, ArrayList<User> users) {
        System.out.print("Enter User ID: ");
        String borrowUserID = input.nextLine();
        User borrowUser = findUserById(users, borrowUserID);
        if (borrowUser == null) {
            System.out.println("User not found!");
            return;
        }
        System.out.print("Enter Book ID to borrow: ");
        String borrowID = input.nextLine();
        catalog.borrowBook(borrowID, borrowUser);
    }

    private static void returnBook(Scanner input, Catalog catalog, ArrayList<User> users) {
        System.out.print("Enter User ID: ");
        String returnUserID = input.nextLine();
        User returnUser = findUserById(users, returnUserID);
        if (returnUser == null) {
            System.out.println("User not found!");
            return;
        }
        System.out.print("Enter Book ID to return: ");
        String returnID = input.nextLine();
        catalog.returnBook(returnID, returnUser);
    }

    private static void viewBorrowedBooks(Scanner input, ArrayList<User> users) {
        System.out.print("Enter User ID: ");
        String viewUserID = input.nextLine();
        User viewUser = findUserById(users, viewUserID);
        if (viewUser != null) {
            viewUser.listBorrowedBooks();
        } else {
            System.out.println("User not found!");
        }
    }

    private static User findUserById(ArrayList<User> users, String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }

    private static int getValidIntInput(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (Exception e) {
                input.nextLine(); // Clear invalid input
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}