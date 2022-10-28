public class Main {

    public static void main(String[] args) {
        Author author = new Author("Stephen", "King");
        Book book = new Book("IT",1986, author);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название книги: " + book.getBook());
        System.out.println("Год публикации : " + book.getYear());
        book.setYear(2022);
        System.out.println("Год публикации : " + book.getYear());

        System.out.println();

        Author author1 = new Author("Chuck", "Palanik");
        Book book2 = new Book("Fight Club",1996, author1);
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println("Название книги: " + book2.getBook());
        System.out.println("Год публикации : " + book2.getYear());
    }
}