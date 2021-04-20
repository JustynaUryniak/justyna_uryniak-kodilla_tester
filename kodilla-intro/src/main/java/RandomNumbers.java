import java.util.Random;

public class RandomNumbers {
    int result = 0;
    int sum = 0;
    int min = 30;
    int max = 0;

    public int getCountOfRandomNumber() {
        Random random = new Random();
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public int getMax(int temp, int max) {
            int max = 0;
        for (int i = 0; i < temp; i++) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public int getMin(int temp, int min) {
            int min = 30;
        for (int i = 0; i < temp; i++) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}

