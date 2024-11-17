// public class Library {

//     private String name;
//     private Shelf[] shelves;

//     public Library(String name, Shelf[] shelves) {
//         this.name = name;
//         this.shelves = shelves;
//     }

//     public String getName() {
//         return name;
//     }

//     public Shelf[] getShelves() {
//         return shelves;
//     }

//     public void addShelf(Shelf shelf) {
//         Shelf[] newShelves = new Shelf[shelves.length + 1];
//         for (int i = 0; i < shelves.length; i++) {
//             newShelves[i] = shelves[i];
//         }
//         newShelves[shelves.length] = shelf;
//         shelves = newShelves;
//     }

//     public void printBooks() {
//         int count = 1;
//         for (Shelf shelf : shelves) {
//             System.out.println("\n" + shelf.getCategoryName() + ":");
//             for (Book book : shelf.getBooks()) {
//                 System.out.println(count + ". " + book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
//                 count++;
//             }
//             count = 1;
//         }
//         if (shelves.length == 0) {
//             System.out.println("No books in library.");
//         }
//     }

//     public void printSingleBook(String title) {
//         boolean found = false;
//         for (Shelf shelf : shelves) {
//             for (Book book : shelf.getBooks()) {
//                 if (book.getTitle().equalsIgnoreCase(title)) {
//                     System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
//                     found = true;
//                 }
//             }
//         }
//         if (!found) {
//             System.out.println("Book not found.");
//         }
//     }

//     public void printBooksByCategory(String category) {
//         for (Shelf shelf : shelves) {
//             if (shelf.getCategoryName().equalsIgnoreCase(category)) {
//                 System.out.println(shelf.getCategoryName() + ":");
//                 for (Book book : shelf.getBooks()) {
//                     System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
//                 }
//             }
//         }
//     }

//     public void printBooksByAuthor(String author) {
//         boolean found = false;
//         for (Shelf shelf : shelves) {
//             for (Book book : shelf.getBooks()) {
//                 if (book.getAuthor().equalsIgnoreCase(author)) {
//                     if (!found) {
//                         System.out.println("Books by " + book.getAuthor() + ":");
//                         found = true;
//                     }
//                     System.out.println(book.getTitle() + " (" + book.getYear() + ")");
//                 }
//             }
//         }
//         if (!found) {
//             System.out.println("Author not found.");
//         }
//     }

// }

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Library {
    private List<Shelf> shelves;
    private String name;

    public Library() {
        this.shelves = new ArrayList<>();
        this.name = "Default Library";
    }

    public Library(String name) {
        this.shelves = new ArrayList<>();
        this.name = name;
    }

    public Library(String name, List<Shelf> shelves) {
        this.shelves = shelves;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Shelf> getShelves() {
        return shelves;
    }

    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }

    public void addShelfs(Shelf... shelf) {
        Collections.addAll(shelves, shelf);
    }

    public void printBooks() {
        if (shelves.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }

        for (Shelf shelf : shelves) {
            System.out.println("\n" + shelf.getCategoryName() + ":");
            List<Book> books = shelf.getBooks();
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out
                        .println((i + 1) + ". " + book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
            }
        }
    }

    public void printSingleBook(String title) {
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void printBooksByCategory(String category) {
        boolean found = false;
        for (Shelf shelf : shelves) {
            if (shelf.getCategoryName().equalsIgnoreCase(category)) {
                System.out.println(shelf.getCategoryName() + ":");
                for (Book book : shelf.getBooks()) {
                    System.out.println(book.getTitle() + " (" + book.getYear() + ") by " + book.getAuthor());
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("Category not found.");
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