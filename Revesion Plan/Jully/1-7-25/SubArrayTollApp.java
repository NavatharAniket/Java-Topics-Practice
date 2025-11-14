import java.util.Arrays;

class SubarrayTool {
    private int[] arr;

    // Constructor
    public SubarrayTool(int[] input) {
        this.arr = Arrays.copyOf(input, input.length);
    }

    // Method to print all subarrays
    public void printAllSubarrays() {
        System.out.println("All Subarrays:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printSubarray(i, j);
            }
        }
    }

    // Method to print subarrays with sum = k
    public void subarraysWithSumK(int k) {
        System.out.println("Subarrays with sum = " + k + ":");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    printSubarray(i, j);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No subarrays found with sum " + k);
    }

    // Method to find min and max length subarrays with positive integers only
    public void minMaxPositiveLengthSubarrays() {
        int minLen = Integer.MAX_VALUE, maxLen = 0;
        int[] minSub = null, maxSub = null;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                boolean allPositive = true;
                for (int k = i; k <= j; k++) {
                    if (arr[k] <= 0) {
                        allPositive = false;
                        break;
                    }
                }

                if (allPositive) {
                    int len = j - i + 1;
                    if (len < minLen) {
                        minLen = len;
                        minSub = Arrays.copyOfRange(arr, i, j + 1);
                    }
                    if (len > maxLen) {
                        maxLen = len;
                        maxSub = Arrays.copyOfRange(arr, i, j + 1);
                    }
                }
            }
        }

        System.out.println("Min Length Positive Subarray (" + minLen + "): " + Arrays.toString(minSub));
        System.out.println("Max Length Positive Subarray (" + maxLen + "): " + Arrays.toString(maxSub));
    }

    // Method to count subarrays with even and odd sums
    public void countEvenOddSumSubarrays() {
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
        }

        System.out.println("Total Even-Sum Subarrays: " + evenCount);
        System.out.println("Total Odd-Sum Subarrays: " + oddCount);
    }

    // Helper method to print a subarray
    private void printSubarray(int start, int end) {
        System.out.print("[");
        for (int k = start; k <= end; k++) {
            System.out.print(arr[k]);
            if (k < end) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class SubArrayTollApp {
    public static void main(String[] args) {
        int[] input = {1, -2, 3, 4, -1, 2, 1};

        SubarrayTool tool = new SubarrayTool(input);

        tool.printAllSubarrays();
        System.out.println();

        tool.subarraysWithSumK(5);
        System.out.println();

        tool.minMaxPositiveLengthSubarrays();
        System.out.println();

        tool.countEvenOddSumSubarrays();
    }
}
