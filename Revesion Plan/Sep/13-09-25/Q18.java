// Q18. Check if Array Elements form Consecutive Sequence
import java.util.*;
class Q18 {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        TreeSet<Integer> set = new TreeSet<>();
        for(int n: arr) set.add(n);
        
        int first = set.first();
        int last = set.last();
        boolean isConsecutive = (last - first + 1 == set.size());
        
        System.out.println("Consecutive sequence? " + isConsecutive);
    }
}
