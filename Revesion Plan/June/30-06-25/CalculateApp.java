import java.util.*;

interface ArrayStats {
    int getMax(int[] arr);
    int getMin(int[] arr);
    double getAverage(int[] arr);
}

class StatCalculator implements ArrayStats {

    // Get maximum value
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Get minimum value
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Calculate average value
    public double getAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}

public class CalculateApp {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        StatCalculator stats = new StatCalculator();

        System.out.println("Maximum: " + stats.getMax(numbers));
        System.out.println("Minimum: " + stats.getMin(numbers));
        System.out.println("Average: " + stats.getAverage(numbers));
    }
}

