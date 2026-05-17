import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert (offer is preferred)
        pq.offer(50);
        System.out.println(pq);

        pq.offer(10);
        System.out.println(pq);

        pq.offer(70);
        System.out.println(pq);

        pq.offer(5);
        System.out.println(pq);

        pq.offer(20);
        System.out.println(pq);




        // Peek (top element)
        System.out.println("Peek: " + pq.peek());

        // Contains check
        System.out.println("Contains 20? " + pq.contains(20));

        // Remove specific element
        pq.remove(20);
        System.out.println("After removing 20: " + pq);

        // Poll (remove min)
        System.out.println("Poll: " + pq.poll());
        System.out.println(pq);

        // Size
        System.out.println("Size: " + pq.size());

        // Empty check
        System.out.println("Is Empty: " + pq.isEmpty());

    }
}
