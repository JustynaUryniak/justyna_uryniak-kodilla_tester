public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book book = new Book();
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        book.author = "Isaac Asimov";
        book.title = "The Galaxy";

        System.out.println("book.author", "book.title");
    }
}


