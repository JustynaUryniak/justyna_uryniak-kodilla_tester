import java.util.Random;

public class RandomNumbers {

    public int[] randomNumbers;
    public int size;


    public RandomNumbers() {
        this.randomNumbers = new int[30];
        this.size = 0;
    }

    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public int getMax() {
        int max = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = 30;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < min) {
                min = randomNumbers[i];
            }
        }
        return min;
    }
}