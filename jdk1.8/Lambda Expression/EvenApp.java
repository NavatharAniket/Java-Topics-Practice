import java.util.*;
import java.util.function.*;

class EvenApp {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        for (Integer val : list) {
            System.out.println(
                ((Predicate<Integer>) ((Integer i) -> i % 2 == 0)).test(val) ? "Even" : "Odd"
            );
        }
    }
}
