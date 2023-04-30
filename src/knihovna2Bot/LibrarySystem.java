package knihovna2Bot;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Library System!");
            System.out.println("Please choose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    removeBook(scanner);
                    break;
                case 3:
                    searchForBook(scanner);
                    break;
                case 4:
                    displayAllBooks();
                    break;
                case 5:
                    System.out.println("Thank you for using the Library System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.println("Enter the title of the book:");
        String title = scanner.next();
        System.out.println("Enter the author of the book:");
        String author = scanner.next();
        books.add(new Book(title, author));
        System.out.println("Book added successfully.");
    }

    private static void removeBook(Scanner scanner) {
        System.out.println("Enter the title of the book you want to remove:");
        String title = scanner.next();
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("Book not found.");
        }
    }

    private static void searchForBook(Scanner scanner) {
        System.out.println("Enter the title or author of the book you want to search for:");
        String query = scanner.next().toLowerCase();
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query)) {
                results.add(book);
            }
        }
        if (results.size() == 0) {
            System.out.println("No results found.");
        } else {
            System.out.println("Results:");
            for (Book book : results) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    private static void displayAllBooks() {
        if (books.size() == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}

