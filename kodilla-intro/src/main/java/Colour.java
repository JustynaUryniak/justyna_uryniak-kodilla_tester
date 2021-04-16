import java.util.Scanner;

public class Colour {

        enum Colour {
            R, /* Red */
            P, /* Pink */
            B, /* Blue */
            V, /* Violet */
        }
        public static void main(String[] args) {
        Colour colour = Colour(getLetter());

        switch(colour) {
            case R:
                System.out.println("Red");
                break;
            case P:
                System.out.println("Pink");
                break;
            case B:
                System.out.println("Blue");
                break;
            case V:
                System.out.println("Violet");
                break;
            default: System.out.println("Wrong letter. Try again");
        }
    }
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter of colour:");
        String let = scanner.nextLine();
        return let;
    }
}
