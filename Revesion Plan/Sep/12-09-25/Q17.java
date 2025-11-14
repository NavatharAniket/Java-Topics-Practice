class Node17 {
    int data;
    Node17 next;
    Node17(int d) { data = d; }
}

public class Q17 {
    public static Node17 merge(Node17 l1, Node17 l2) {
        Node17 dummy = new Node17(0);
        Node17 tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void printList(Node17 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node17 l1 = new Node17(1);
        l1.next = new Node17(3);
        l1.next.next = new Node17(5);

        Node17 l2 = new Node17(2);
        l2.next = new Node17(4);
        l2.next.next = new Node17(6);

        Node17 merged = merge(l1, l2);
        printList(merged);
    }
}
