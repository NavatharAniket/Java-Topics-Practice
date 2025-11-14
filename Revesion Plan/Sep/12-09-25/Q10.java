import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));

        boolean isPalindrome = true;
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("List: " + list);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
