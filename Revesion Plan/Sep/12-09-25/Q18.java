import java.util.*;

class Node18 {
    int data;
    Node18 next;
    Node18(int d) { data = d; }
}

public class Q18 {
    public static boolean isPalindrome(Node18 head) {
        Stack<Integer> stack = new Stack<>();
        Node18 temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop()) return false;
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node18 head = new Node18(1);
        head.next = new Node18(2);
        head.next.next = new Node18(2);
        head.next.next.next = new Node18(1);

        System.out.println("Is Palindrome? " + isPalindrome(head));
    }
}
