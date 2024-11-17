import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Library library = new Library("My Library");

        Shelf novel = new Shelf("Novel");
        Shelf fantasy = new Shelf("Fantasy");
        Shelf thriller = new Shelf("Thriller");
        Shelf nonFiction = new Shelf("Non-Fiction");
        Shelf horror = new Shelf("Horror");
        Shelf scienceFiction = new Shelf("Science Fiction");

        novel.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel", "Charles Scribner's Sons"),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Novel", "Little, Brown and Company"),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Novel", "J.B. Lippincott & Co."),
                new Book("1984", "George Orwell", 1949, "Novel", "Secker & Warburg"),
                new Book("Pride and Prejudice", "Jane Austen", 1813, "Novel", "T. Egerton, Whitehall"));

        fantasy.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy", "George Allen & Unwin"), new Book(
                "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, "Fantasy", "Bloomsbury Publishing"),
                new Book("The Lion, the Witch and the Wardrobe", "C.S. Lewis", 1950, "Fantasy", "Geoffrey Bles"),
                new Book("A Game of Thrones", "George R.R. Martin", 1996, "Fantasy", "Bantam Spectra"),
                new Book("Mistborn: The Final Empire", "Brandon Sanderson", 2006, "Fantasy", "Tor Books"));

        thriller.addBook(new Book("The Da Vinci Code", "Dan Brown", 2003, "Thriller", "Doubleday"), new Book("Hangman",
                "Daniel Cole", 2018, "Thriller", "Orion Publishing Group"),
                new Book("None Of This Is True", "Jon McGregor", 2003, "Thriller", "Bloomsbury Publishing"));

        scienceFiction.addBook(new Book("Dune", "Frank Herbert", 1965, "Science Fiction", "Chilton Books"),
                new Book("Neuromancer", "William Gibson", 1984, "Science Fiction", "Ace Books"),
                new Book("Snow Crash", "Neal Stephenson", 1992, "Science Fiction", "Bantam Books"),
                new Book("The Left Hand of Darkness", "Ursula K. Le Guin", 1969, "Science Fiction", "Ace Books"),
                new Book("The War of the Worlds", "H.G. Wells", 1898, "Science Fiction", "William Heinemann"));

        horror.addBook(new Book("Dracula", "Bram Stoker", 1897, "Horror", "Archibald Constable and Company"),
                new Book("Frankenstein", "Mary Shelley", 1818, "Horror", "Lackington, Hughes, Harding, Mavor & Jones"),
                new Book("The Haunting of Hill House", "Shirley Jackson", 1959, "Horror", "Viking Press"),
                new Book("The Shining", "Stephen King", 1977, "Horror", "Doubleday"),
                new Book("The Silence of the Lambs", "Thomas Harris", 1988, "Horror", "St. Martin's Press"));

        nonFiction.addBook(new Book("A Brief History of Time", "Stephen Hawking", 1988, "Non-Fiction", "Bantam Books"),
                new Book("Freakonomics", "Steven D. Levitt", 2005, "Non-Fiction", "William Morrow and Company"),
                new Book("Into the Wild", "Jon Krakauer", 1996, "Non-Fiction", "Villard"),
                new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011, "Non-Fiction",
                        "HarperCollins"),
                new Book("The Diary of a Young", "Anne Frank", 1947, "Non-Fiction", "Contact Publishing"));

        library.addShelf(novel);
        library.addShelfs(fantasy, thriller, nonFiction, horror, scienceFiction);

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
        System.out.println("Goodbye!");
    }
}
