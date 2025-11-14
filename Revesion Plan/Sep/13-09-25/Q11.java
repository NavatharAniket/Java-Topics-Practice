// Q11. Find Kth Largest/Smallest Element using TreeSet
import java.util.*;
class Q11 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        TreeSet<Integer> set = new TreeSet<>();
        for(int n : arr) set.add(n);
        
        // Kth smallest
        int i = 1;
        for(int val : set) {
            if(i == k) {
                System.out.println("Kth Smallest: " + val);
                break;
            }
            i++;
        }
        
        // Kth largest
        i = 1;
        for(int val : set.descendingSet()) {
            if(i == k) {
                System.out.println("Kth Largest: " + val);
                break;
            }
            i++;
        }
    }
}
