import java.util.Random;

public class RandomNumbers {
    int result = 0;
    int sum = 0;
    int min = 30;
    int max = 0;
    int[] tab = new int[30];

    public int getCountOfRandomNumber() {
        Random random = new Random();
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public int getMax(int[] tab, int max) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public int getMin(int[] tab, int min) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }
}