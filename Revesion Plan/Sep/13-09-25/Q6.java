// Q6. Find Pairs with Given Sum
import java.util.*;
class Q6 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            if(set.contains(target - num)) {
                System.out.println("Pair: " + num + ", " + (target-num));
            }
            set.add(num);
        }
    }
}
