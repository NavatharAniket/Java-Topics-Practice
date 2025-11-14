import java.util.*;

class Node19 {
    int data;
    Node19 next;
    Node19(int d) { data = d; }
}

public class Q19 {
    public static void removeDuplicates(Node19 head) {
        HashSet<Integer> set = new HashSet<>();
        Node19 prev = null;
        Node19 curr = head;

        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public static void printList(Node19 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node19 head = new Node19(1);
        head.next = new Node19(2);
        head.next.next = new Node19(2);
        head.next.next.next = new Node19(3);

        removeDuplicates(head);
        printList(head);
    }
}
