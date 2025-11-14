import java.util.Arrays;

class FrequencyManager {
    private int[] arr;

    // Constructor to accept and copy the array
    public FrequencyManager(int[] input) {
        this.arr = Arrays.copyOf(input, input.length);
    }

    // Calculate and display frequency of each number
    public void displayFrequencies() {
        int[] freq = new int[arr.length];
        boolean[] visited = new boolean[arr.length];

        System.out.println("Frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
            visited[i] = true;
            System.out.println(arr[i] + " => " + count + " times");
        }
    }

    // Display duplicates and their count
    public void showDuplicates() {
        boolean[] visited = new boolean[arr.length];
        System.out.println("Duplicates and their counts:");
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                visited[i] = true;
                System.out.println(arr[i] + " => " + count + " times");
                found = true;
            }
        }

        if (!found)
            System.out.println("No duplicates found.");
    }

    // Remove duplicates and return new array
    public int[] removeDuplicates() {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        int[] unique = new int[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(unique));
        return unique;
    }

    // Find number with highest frequency
    public void highestFrequency() {
        int maxFreq = 0;
        int number = arr[0];

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                number = arr[i];
            }

            visited[i] = true;
        }

        System.out.println("Number with highest frequency: " + number + " (appeared " + maxFreq + " times)");
    }
}

public class FrequencyManagerApp {
    public static void main(String[] args) {
        int[] input = {4, 2, 5, 2, 4, 5, 4, 7};

        FrequencyManager fm = new FrequencyManager(input);

        fm.displayFrequencies();
        fm.showDuplicates();
        fm.removeDuplicates();
        fm.highestFrequency();
    }
}
