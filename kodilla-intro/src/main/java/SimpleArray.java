public class SimpleArray {
    public static void main(String[] args) {
    String[] books = new String [5];

    books[0] = "Podejrzany";
    books[1] = "Wróg bez twarzy";
    books[2] = "Nieprzyjaciel";
    books[3] = "61 godzin";
    books[4] = "Adres nieznany";

            String book = "books[3]";
            System.out.println(books[3]);
            int numberOfElements = books.length;

            System.out.println("Moja tablica zawiera " +numberOfElements+ " elementów");

    }
}
