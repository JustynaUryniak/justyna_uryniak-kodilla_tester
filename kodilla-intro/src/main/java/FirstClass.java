public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2014);
        System.out.println(notebook.weight +"g" +" "+ notebook.price +" "+ notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2001);
        System.out.println(heavyNotebook.weight+"g" +" "+ heavyNotebook.price +" "+ heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 1980);
        System.out.println(oldNotebook.weight+"g" +" "+ oldNotebook.price +" "+ oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook firstNotebook = new Notebook(24000, 700, 1975);
        System.out.println(firstNotebook.weight +"g" +" "+ firstNotebook.price +" "+ firstNotebook.year);
        firstNotebook.checkPrice();
        firstNotebook.checkWeight();
        firstNotebook.checkYear();

    }
}
