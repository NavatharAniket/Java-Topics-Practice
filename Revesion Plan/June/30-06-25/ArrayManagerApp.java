import java.util.*;
interface ArrayOperations {
    void sortArray(int[] arr);
    int getSecondLargest(int[] arr);
    int getSum(int[] arr);
}

class ArrayManager implements ArrayOperations {

    // Sort the array in ascending order
    public void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Get the second largest element
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    // Calculate sum of elements
    public int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

public class ArrayManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept array size and elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use ArrayManager
        ArrayManager manager = new ArrayManager();

        // Sort and display
        manager.sortArray(arr);

        // Display second largest
        int secondLargest = manager.getSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("Second Largest: Not available");
        }

        // Display sum
        System.out.println("Sum of Elements: " + manager.getSum(arr));

        scanner.close();
    }
}


