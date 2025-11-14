import java.util.*;
 
interface ArraySearch {
    int findElement(int[] arr, int key);
}

class SearchOperation implements ArraySearch {

    // Binary search implementation
    public int findElement(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Method to display result
    public void displayResult(int[] arr, int key) {
        int index = findElement(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index + ", value: " + arr[index]);
        } else {
            System.out.println("Not Found");
        }
    }
}


// Main class with the main method
public class ArrayApp {
    public static void main(String[] args) {
        int[] sortedArray = {5, 10, 15, 25, 30, 40};
        int key = 25;

        SearchOperation search = new SearchOperation();
        search.displayResult(sortedArray, key);
    }
}



