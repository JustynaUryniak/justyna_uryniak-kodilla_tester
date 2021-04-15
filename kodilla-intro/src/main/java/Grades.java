public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrades() {
        return this.grades[this.size - 1];
    }
    public double averageGrades() {
        double sum = 0;
        double result = 0;
        for (int i = 0; i < size; i++) {
            result = result + this.grades[i];
        }
        return result / this.size;
    }
}
