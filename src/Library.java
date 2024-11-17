public class Library {

    private String name;
    private Shelf[] shelves;

    public Library(String name, Shelf[] shelves) {
        this.name = name;
        this.shelves = shelves;
    }

    public String getName() {
        return name;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    public void addShelf(Shelf shelf) {
        Shelf[] newShelves = new Shelf[shelves.length + 1];
        for (int i = 0; i < shelves.length; i++) {
            newShelves[i] = shelves[i];
        }
        newShelves[shelves.length] = shelf;
        shelves = newShelves;
    }

    public void printBooks() {
        for (Shelf shelf : shelves) {
            System.out.println(shelf.getCategoryName() + ":");
            for (Book book : shelf.getBooks()) {
                System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
            }
        }
        if (shelves.length == 0) {
            System.out.println("No books in library.");
        }
    }

    public void printSingleBook(String title) {
        boolean found = false;
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public void printBooksByCategory(String category) {
        for (Shelf shelf : shelves) {
            if (shelf.getCategoryName().equalsIgnoreCase(category)) {
                System.out.println(shelf.getCategoryName() + ":");
                for (Book book : shelf.getBooks()) {
                    System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
                }
            }
        }
    }

    public void printBooksByAuthor(String author) {
        boolean found = false;
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    if (!found) {
                        System.out.println("Books by " + book.getAuthor() + ":");
                        found = true;
                    }
                    System.out.println(book.getTitle() + " (" + book.getYear() + ")");
                }
            }
        }
        if (!found) {
            System.out.println("Author not found.");
        }
    }

}
