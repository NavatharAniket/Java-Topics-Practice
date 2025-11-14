import java.util.Arrays;

class ArrayProcessor {
    private int[] arr;

    // Constructor to accept array
    public ArrayProcessor(int[] inputArray) {
        // Deep copy to avoid modifying original array
        this.arr = Arrays.copyOf(inputArray, inputArray.length);
    }

    // Display method
    public void display(String message) {
        System.out.println(message + Arrays.toString(arr));
    }

    // Left rotate array by k positions
    public void leftRotate(int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }
        arr = rotated;
        display("After left rotation by " + k + ": ");
    }

    // Right rotate array by k positions
    public void rightRotate(int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        arr = rotated;
        display("After right rotation by " + k + ": ");
    }

    // Sort in ascending order
    public void sortAscending() {
        Arrays.sort(arr);
        display("After sorting in ascending order: ");
    }

    // Sort in descending order
    public void sortDescending() {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        display("After sorting in descending order: ");
    }

    // Find second smallest and second largest elements
    public void findSecondSmallestAndLargest() {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int smallest = copy[0], largest = copy[copy.length - 1];
        Integer secondSmallest = null, secondLargest = null;

        // Find second smallest
        for (int i = 1; i < copy.length; i++) {
            if (copy[i] != smallest) {
                secondSmallest = copy[i];
                break;
            }
        }

        // Find second largest
        for (int i = copy.length - 2; i >= 0; i--) {
            if (copy[i] != largest) {
                secondLargest = copy[i];
                break;
            }
        }

        System.out.println("Second Smallest: " + (secondSmallest != null ? secondSmallest : "Not Found"));
        System.out.println("Second Largest: " + (secondLargest != null ? secondLargest : "Not Found"));
    }
}

public class ArrayProcessorApp {
    public static void main(String[] args) {
        int[] input = {5, 3, 8, 1, 9, 3, 8};

        ArrayProcessor processor = new ArrayProcessor(input);
        processor.display("Original Array: ");

        processor.leftRotate(2);
        processor.rightRotate(3);

        processor.sortAscending();
        processor.sortDescending();

        processor.findSecondSmallestAndLargest();
    }
}
