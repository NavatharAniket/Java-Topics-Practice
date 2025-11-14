// Q16. Range Queries using TreeMap
import java.util.*;
class Q16 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"A"); map.put(20,"B"); map.put(30,"C"); map.put(40,"D"); map.put(50,"E");
        
        System.out.println("HeadMap(<30): " + map.headMap(30));
        System.out.println("TailMap(>=30): " + map.tailMap(30));
        System.out.println("SubMap(20..40): " + map.subMap(20,true,40,true));
    }
}
