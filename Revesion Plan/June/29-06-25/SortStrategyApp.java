import java.util.Scanner;

interface SortStrategy {
    void sort(int[] arr);
}

class BubbleSort implements SortStrategy {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements SortStrategy {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class InsertionSort implements SortStrategy {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i =1; i < n; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

class ArraySorter {
    SortStrategy strategy;

    public ArraySorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] arr) {
        strategy.sort(arr);
    }
}

public class SortStrategyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] originalArr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i =0; i < n; i++) {
            originalArr[i] = sc.nextInt();
        }

        ArraySorter sorter = new ArraySorter(null);

        while (true) {
            System.out.println("\nChoose sorting strategy:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            // copy array to avoid sorting original array repeatedly
            int[] arrToSort = new int[n];
            for (int i =0; i < n; i++) {
                arrToSort[i] = originalArr[i];
            }

            if (choice == 1) {
                sorter.setStrategy(new BubbleSort());
                System.out.println("Using Bubble Sort:");
            } else if (choice == 2) {
                sorter.setStrategy(new SelectionSort());
                System.out.println("Using Selection Sort:");
            } else if (choice == 3) {
                sorter.setStrategy(new InsertionSort());
                System.out.println("Using Insertion Sort:");
            } else {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            sorter.sort(arrToSort);

            System.out.print("Sorted array: ");
            for (int val : arrToSort) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
