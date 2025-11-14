class Node15 {
    int data;
    Node15 next;
    Node15(int d) { data = d; }
}

public class Q15 {
    public static int findMiddle(Node15 head) {
        Node15 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node15 head = new Node15(1);
        head.next = new Node15(2);
        head.next.next = new Node15(3);
        head.next.next.next = new Node15(4);
        head.next.next.next.next = new Node15(5);

        System.out.println("Middle Element: " + findMiddle(head));
    }
}
