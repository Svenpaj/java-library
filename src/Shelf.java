public class Shelf {

    private String categoryName;

    private Book[] books;

    public Shelf(String categoryName, Book[] books) {
        this.categoryName = categoryName;
        this.books = books;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (book.getCategory().equalsIgnoreCase(this.categoryName)) {
            Book[] newBooks = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                newBooks[i] = books[i];
            }
            newBooks[books.length] = book;
            books = newBooks;
        } else {
            System.out
                    .println(
                            "Book category: " + "('" + book.getCategory() + "')" + ". Does not match shelf category: ('"
                                    + this.categoryName + "').");
        }
    }
}
