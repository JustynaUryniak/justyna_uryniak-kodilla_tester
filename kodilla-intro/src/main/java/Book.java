public class Book {
     String author;
     String title;

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.author);
        System.out.println(book.title);
    }
}



