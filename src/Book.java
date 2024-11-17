public class Book {

    private String title;
    private String author;
    private int year;
    private String category;
    private String publisher;

    public Book(String title, String author, int year, String category, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.category = category;
        this.publisher = publisher;
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

    public String getPublisher() {
        return publisher;
    }

}
