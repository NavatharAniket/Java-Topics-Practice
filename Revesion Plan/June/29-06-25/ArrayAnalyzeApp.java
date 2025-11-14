import java.util.Scanner;

abstract class ArrayAnalyzer {
    public abstract int analyze(int[] arr);
}

class PrimeCounter extends ArrayAnalyzer {
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int analyze(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}

class PerfectSquareSum extends ArrayAnalyzer {
    private boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int root = (int) Math.sqrt(num);
        return root * root == num;
    }

    public int analyze(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPerfectSquare(num)) {
                sum += num;
            }
        }
        return sum;
    }
}

public class ArrayAnalyzeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (max 1000): ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("Invalid input! Number must be between 1 and 1000.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PrimeCounter primeCounter = new PrimeCounter();
        PerfectSquareSum perfectSquareSum = new PerfectSquareSum();

        int primeCount = primeCounter.analyze(arr);
        int perfectSquareSumResult = perfectSquareSum.analyze(arr);

        System.out.println("\nNumber of prime numbers: " + primeCount);
        System.out.println("Sum of perfect square numbers: " + perfectSquareSumResult);

        sc.close();
    }
}
