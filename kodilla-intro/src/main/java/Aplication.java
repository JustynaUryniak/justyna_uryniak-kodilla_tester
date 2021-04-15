public class Aplication {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        public Aplication(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public void checkProfile() {
            if (this.name != null) {
                if (this.age > 30 && this.height > 160) {
                    System.out.println("User is older than 30 and higher than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
    }
