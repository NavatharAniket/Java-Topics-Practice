import java.util.*;

class ArrayData {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {4, 5, 6, 7, 8};
}

class UnionArray extends ArrayData {
    void findUnion() {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        System.out.println("Union → " + set);
    }
}

class IntersectionArray extends ArrayData {
    void findIntersection() {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new LinkedHashSet<>();
        for (int num : a) setA.add(num);
        for (int num : b) {
            if (setA.contains(num)) result.add(num);
        }
        System.out.println("Intersection → " + result);
    }
}
