public class FirstClass {
    public static void main(String[] args) {
        Aplication aplication = new Aplication("Adam", 40.5, 178);
        System.out.println(aplication.name + " " + aplication.age + " " + aplication.height);
        aplication.checkProfile();

    }
}
