import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Novel");

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Novel");

        Book book3 = new Book("1984", "George Orwell", 1949, "Novel");

        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");

        Book book5 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy");

        Book book6 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, "Fantasy");

        Book book7 = new Book("The Lion, the Witch and the Wardrobe", "C.S. Lewis", 1950, "Fantasy");

        Book book8 = new Book("The Da Vinci Code", "Dan Brown", 2003, "Thriller");

        Shelf shelf1 = new Shelf("Novels", new Book[] { book1, book2, book3, book4 });

        Shelf shelf2 = new Shelf("Fantasy", new Book[] { book5, book6, book7 });

        Shelf shelf3 = new Shelf("Thriller", new Book[] { book8 });

        Library library = new Library("My Library", new Shelf[] { shelf1, shelf2, shelf3 });

        library.printBooks();

        library.printBooksByCategory("Fantasy");

        library.printBooksByAuthor("J.K. Rowling");

        shelf1.addBook(new Book("The Shining", "Stephen King", 1977, "Horror"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n-----Welcome to the library!-----\n");
            System.out.println("1. Print all books");
            System.out.println("2. Print books by category");
            System.out.println("3. Print books by author");
            System.out.println("4. Search for a book");
            System.out.println("Type 'exit' to quit.\n");
            System.out.println("Enter your choice:");
            System.out.print("> ");
            String input = scanner.nextLine();
            input = input.toLowerCase().trim();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("1")) {
                library.printBooks();
            } else if (input.equals("2")) {
                System.out.println("Enter category:");
                input = scanner.nextLine();
                library.printBooksByCategory(input);
            } else if (input.equals("3")) {
                System.out.println("Enter author:");
                input = scanner.nextLine();
                library.printBooksByAuthor(input);
            } else if (input.equals("4")) {
                System.out.println("Enter title:");
                input = scanner.nextLine();
                library.printSingleBook(input);
            } else {
                System.out.println("Invalid input.");
            }
        }
        scanner.close();
    }
}
