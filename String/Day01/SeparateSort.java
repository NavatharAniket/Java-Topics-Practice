import java.util.*;

class ArrayData {
    protected int[] arr;

    ArrayData(int[] arr) {
        this.arr = arr;
    }
}

class EvenSorter extends ArrayData {
    EvenSorter(int[] arr) {
        super(arr);
    }

    public void sortEven() {
        List<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0)
                evens.add(num);
        }
        Collections.sort(evens);
        System.out.println("Sorted Even Elements → " + evens);
    }
}

class OddSorter extends ArrayData {
    OddSorter(int[] arr) {
        super(arr);
    }

    public void sortOdd() {
        List<Integer> odds = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0)
                odds.add(num);
        }
        Collections.sort(odds);
        System.out.println("Sorted Odd Elements → " + odds);
    }
}
