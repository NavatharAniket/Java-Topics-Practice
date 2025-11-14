import java.util.*;

interface ArrayMerger {
    int[] mergeAndFilterEven(int[] arr1, int[] arr2);
}

class MergeOperation implements ArrayMerger {

    // Merge two arrays and filter even numbers
    public int[] mergeAndFilterEven(int[] arr1, int[] arr2) {
        ArrayList<Integer> resultList = new ArrayList<>();

        // Add even numbers from arr1
        for (int num : arr1) {
            if (num % 2 == 0) {
                resultList.add(num);
            }
        }

        // Add even numbers from arr2
        for (int num : arr2) {
            if (num % 2 == 0) {
                resultList.add(num);
            }
        }

        // Convert ArrayList to array
        int[] evenArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            evenArray[i] = resultList.get(i);
        }

        return evenArray;
    }
}

public class ArrayMergerApp {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        MergeOperation merger = new MergeOperation();
        int[] mergedEvenArray = merger.mergeAndFilterEven(array1, array2);

        System.out.println("Merged Even Array: " + Arrays.toString(mergedEvenArray));
    }
}

