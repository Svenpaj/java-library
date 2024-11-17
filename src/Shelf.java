import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private String categoryName;
    private List<Book> books;

    public Shelf(String categoryName) {
        this.categoryName = categoryName;
        this.books = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book... book) {
        for (Book b : book) {
            if (b.getCategory().equalsIgnoreCase(this.categoryName)) {
                books.add(b);
            } else {
                System.out.println(
                        "Book category: " + "('" + b.getCategory() + "')" + ". Does not match shelf category: ('"
                                + this.categoryName + "').");
            }
        }
    }
}