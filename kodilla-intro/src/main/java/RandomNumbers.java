import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int min = 0;
        int max = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;

        public int getMax() {
            int result = 0;
            int max = 30;
            for (int i = 0; i > max; i++) {
                max = result;
            }
            return = max;
        }
        public int getMin() {
            int result = 0;
            int min = 0;
            for (int i = 0; i < min; i++) {
                min = result;
            }
            return = min;
        }
    }
}