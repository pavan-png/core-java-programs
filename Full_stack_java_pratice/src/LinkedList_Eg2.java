import java.util.Deque;
import java.util.LinkedList;

public class LinkedList_Eg2 {
    public static void main(String[] args) {

        // Deque = Double Ended Queue (used in real-time systems like caching, queues)
        Deque<String> deque = new LinkedList<>();

        // offerFirst() → adds element at FRONT (SAFE method)
        // Preferred in industry over addFirst() because:
        // ✔ Does NOT throw exception if insertion fails
        // ✔ Returns false instead → safer for production systems
        deque.offerFirst("Page1");

        // offerLast() → adds element at END (SAFE method)
        // Preferred over addLast() for same reason (no exception risk)
        deque.offerLast("Page2");
        deque.offerLast("Page3");

        // Current deque state:
        // Front → [Page1, Page2, Page3] ← Rear

        // peekFirst() → gets first element WITHOUT removing
        // ✔ Safe (returns null if empty)
        System.out.println("Peek First: " + deque.peekFirst());

        // peekLast() → gets last element WITHOUT removing
        System.out.println("Peek Last: " + deque.peekLast());

        // pollFirst() → removes and returns element from FRONT
        // ✔ Safe (returns null if empty, no exception)
        System.out.println("Removed First: " + deque.pollFirst());

        // Now deque becomes:
        // [Page2, Page3]

        // pollLast() → removes and returns element from END
        // ✔ Safe (returns null if empty)
        System.out.println("Removed Last: " + deque.pollLast());

        // Final deque:
        // [Page2]
    }
}