public class User {
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }
    public static void main(String[] args) {


        User piotr = new User("Piotr", 25);
        User adam = new User("Adam", 54);
        User kasia = new User("Kasia", 34);
        User ola = new User("Ola", 36);
        User marcin = new User("Marcin", 76);

        User[] users = {"Piotr", "Adam", "Kasia", "Ola", "Marcin"};

        public int averageAge(User[] users) {
            int result = 0;
            for (int i = 0; i < users.length; i++) {
                result = result + users[i].userAge
                return = result / users.length;

                int sum = result / users.length;
                for (int i = 0; i < int sum; i++) {
                    System.out.println(users[i].userName);
                }
            }
        }
    }
}