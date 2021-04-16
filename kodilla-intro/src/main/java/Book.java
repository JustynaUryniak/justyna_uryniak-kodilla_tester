public class Book {
    private String author;
    private String title;

            public static Book of(String author, String title) {
                Book.author = author;
                Book.title = title;
            }
    public static void main(String[] args) {
        Book book = new Book();
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);
    }
}

