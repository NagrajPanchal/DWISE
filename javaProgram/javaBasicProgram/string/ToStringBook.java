package string;
public class ToStringBook
{    private String title;
    private String author;
    private int publicationYear;
    // Constructor
    public ToStringBook(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    // Overriding the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "ToStringBook{title='" + title + "', author='" + author + "', publicationYear=" + publicationYear + "}";
    }
    public static void main(String[] args) {
        ToStringBook myBook = new ToStringBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        // When an object is printed, its toString() method is implicitly called
        System.out.println(myBook);
        // Explicitly calling toString()
        System.out.println(myBook.toString());
    }
}
