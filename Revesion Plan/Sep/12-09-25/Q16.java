class Node16 {
    int data;
    Node16 next;
    Node16(int d) { data = d; }
}

public class Q16 {
    public static Node16 removeNthFromEnd(Node16 head, int n) {
        Node16 dummy = new Node16(0);
        dummy.next = head;
        Node16 first = dummy, second = dummy;

        for (int i = 0; i <= n; i++) first = first.next;

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

    public static void printList(Node16 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node16 head = new Node16(1);
        head.next = new Node16(2);
        head.next.next = new Node16(3);
        head.next.next.next = new Node16(4);
        head.next.next.next.next = new Node16(5);

        head = removeNthFromEnd(head, 2);
        printList(head);
    }
}
