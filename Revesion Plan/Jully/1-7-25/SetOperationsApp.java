import java.util.Arrays;

class SetOperations {
    private int[] setA;
    private int[] setB;

    public SetOperations(int[] A, int[] B) {
        this.setA = removeDuplicates(A);
        this.setB = removeDuplicates(B);
    }

    // Helper: Remove duplicates from an array
    private int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[index++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, index);
    }

    // Helper: Check if an element exists in an array
    private boolean contains(int[] arr, int val) {
        for (int num : arr) {
            if (num == val) return true;
        }
        return false;
    }

    public int[] union() {
        int[] temp = new int[setA.length + setB.length];
        int index = 0;

        for (int a : setA) temp[index++] = a;
        for (int b : setB) {
            if (!contains(setA, b)) temp[index++] = b;
        }

        return Arrays.copyOf(temp, index);
    }

    public int[] intersection() {
        int[] temp = new int[Math.min(setA.length, setB.length)];
        int index = 0;

        for (int a : setA) {
            if (contains(setB, a)) {
                temp[index++] = a;
            }
        }

        return Arrays.copyOf(temp, index);
    }

    public int[] differenceAB() {
        int[] temp = new int[setA.length];
        int index = 0;

        for (int a : setA) {
            if (!contains(setB, a)) {
                temp[index++] = a;
            }
        }

        return Arrays.copyOf(temp, index);
    }

    public int[] differenceBA() {
        int[] temp = new int[setB.length];
        int index = 0;

        for (int b : setB) {
            if (!contains(setA, b)) {
                temp[index++] = b;
            }
        }

        return Arrays.copyOf(temp, index);
    }

    public int[] symmetricDifference() {
        int[] diff1 = differenceAB();
        int[] diff2 = differenceBA();
        int[] result = new int[diff1.length + diff2.length];

        int index = 0;
        for (int val : diff1) result[index++] = val;
        for (int val : diff2) result[index++] = val;

        return result;
    }

    public boolean isSubset(int[] subset, int[] superset) {
        for (int val : subset) {
            if (!contains(superset, val)) return false;
        }
        return true;
    }

    public void displayResults() {
        System.out.println("Set A: " + Arrays.toString(setA));
        System.out.println("Set B: " + Arrays.toString(setB));

        System.out.println("Union: " + Arrays.toString(union()));
        System.out.println("Intersection: " + Arrays.toString(intersection()));
        System.out.println("A - B: " + Arrays.toString(differenceAB()));
        System.out.println("B - A: " + Arrays.toString(differenceBA()));
        System.out.println("Symmetric Difference: " + Arrays.toString(symmetricDifference()));

        System.out.println("Is A subset of B? " + isSubset(setA, setB));
        System.out.println("Is B subset of A? " + isSubset(setB, setA));
    }
}

public class SetOperationsApp{
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 3, 2};
        int[] B = {4, 5, 6, 7, 4};

        SetOperations setOps = new SetOperations(A, B);
        setOps.displayResults();
    }
}
