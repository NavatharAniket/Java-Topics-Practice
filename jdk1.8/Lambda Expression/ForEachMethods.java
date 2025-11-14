import java.util.*;
import java.util.function.*;
/*
class ForEachMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Consumer<Integer> c = new Fetch(); 
        al.forEach(c);
    }
}

class Fetch implements Consumer<Integer> {
    public void accept(Integer i) {
        System.out.println(i);
    }
}
*/
class ForEachMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);	
	al.forEach((Integer i)->System.out.println("Value is "+i));
    }
}
