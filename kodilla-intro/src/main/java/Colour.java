import java.util.Scanner;

public class Colour {
    public static void main(String[] args) {

    String letter = getLetter();

        switch(letter) {
            case "R":
                System.out.println("Red");
                break;
            case "P":
                System.out.println("Pink");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "V":
                System.out.println("Violet");
                break;
            default: System.out.println("Wrong letter. Try again");
                break;
        }
    }
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter of colour:");
        String let = scanner.nextLine().trim().toUpperCase();
        return let;
    }
}

