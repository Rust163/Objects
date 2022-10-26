public class Main {

    public static void main(String[] args) {
        Author author_1 = new Author("Stephen King");
        System.out.println("Автор: " + author_1.getAuthor());
        Book book = new Book("IT", 1986);
        System.out.println("Название книги: " + book.getBook());
        System.out.println("Год публикации : " + book.getYear());
        book.setYear(2022);
        System.out.println("Год публикации : " + book.getYear());

        System.out.println();

        Author author_2 = new Author("Chuck Palanik");
        System.out.println("Автор: " + author_2.getAuthor());
        Book book2 = new Book("Fight Club", 1996);
        System.out.println("Название книги: " + book2.getBook());
        System.out.println("Год публикации : " + book2.getYear());
    }
}