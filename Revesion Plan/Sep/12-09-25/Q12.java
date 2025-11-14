import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);

        System.out.println("Queue: " + queue);

        // Dequeue
        System.out.println("Dequeued: " + queue.removeFirst());
        System.out.println("After Dequeue: " + queue);
    }
}
