// Q17. Count Number of Unique Elements in Subarrays
import java.util.*;
class Q17 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int k = 3;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<k; i++)
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        System.out.println("Window 1 unique: " + map.size());
        
        for(int i=k; i<arr.length; i++) {
            int left = arr[i-k];
            map.put(left, map.get(left)-1);
            if(map.get(left) == 0) map.remove(left);
            
            int right = arr[i];
            map.put(right, map.getOrDefault(right,0)+1);
            
            System.out.println("Window ending at " + i + " unique: " + map.size());
        }
    }
}
