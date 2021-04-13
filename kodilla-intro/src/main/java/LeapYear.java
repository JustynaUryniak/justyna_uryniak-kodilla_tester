public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear = true;

        if (isLeapYear) {
            System.out.println("The year is leap");
        } else {
            System.out.println("The year isn't leap");
        }
      }

      public static boolean isLeapYear(int year) {

        return ((year % 4 == 0 && year % 100 == 0 || year % 400 == 0));
      }
    }
