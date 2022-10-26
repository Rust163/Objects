public class Book {
    private final String book;
    private int year;

    public Book(String book, int year){
        this.book = book;
        this.year = year;
    }
    public String getBook(){
        return this.book;
    }
    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
