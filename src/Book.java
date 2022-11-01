public class Book {
    private final String book;
    private final Author author;
    private int year;

    public Book (String book, int year, Author author){
        this.book = book;
        this.year = year;
        this.author = author;
    }
    public String getBook(){
        return book;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Author getAuthor() {
        return author;
    }




}
