// Q9. Top K Frequent Elements
import java.util.*;
class Q9 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n: nums) freq.put(n, freq.getOrDefault(n, 0)+1);
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
            new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        
        for(Map.Entry<Integer,Integer> e: freq.entrySet()) {
            pq.offer(e);
            if(pq.size()>k) pq.poll();
        }
        
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()) ans.add(pq.poll().getKey());
        System.out.println(ans);
    }
}
