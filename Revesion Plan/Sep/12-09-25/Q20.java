class Node20 {
    int data;
    Node20 next;
    Node20(int d) { data = d; }
}

public class Q20 {
    public static int getLength(Node20 head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node20 head = new Node20(10);
        head.next = new Node20(20);
        head.next.next = new Node20(30);

        System.out.println("Length of LinkedList: " + getLength(head));
    }
}
