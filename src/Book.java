public class Book {

    private String title;
    private String author;
    private int year;
    private String category;

    public Book(String title, String author, int year, String category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

}
