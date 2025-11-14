// Q14. Find Floor and Ceiling of a Given Number using TreeMap
import java.util.*;
class Q14 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"A"); map.put(20,"B"); map.put(30,"C");
        
        int x = 25;
        System.out.println("Floor of " + x + " : " + map.floorKey(x));
        System.out.println("Ceiling of " + x + " : " + map.ceilingKey(x));
    }
}
