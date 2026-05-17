import java.util.*;

public class ArrayDeque_Eg1{

    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        // ===============================
        // 1. INSERT (Queue + Stack style)
        // ===============================
        dq.offerLast("Task1");       // Queue insert
        dq.offerLast("Task2");
        dq.offerFirst("UrgentTask"); // Stack insert (high priority)

        System.out.println("After Insertions: " + dq);

        // ===============================
        // 2. PEEK (Check elements)
        // ===============================
        System.out.println("Front (peekFirst): " + dq.peekFirst());
        System.out.println("Rear  (peekLast): " + dq.peekLast());

        // ===============================
        // 3. REMOVE (Both sides)
        // ===============================
        System.out.println("Removed from front (pollFirst): " + dq.pollFirst());
        System.out.println("Removed from rear  (pollLast): " + dq.pollLast());

        System.out.println("After Removals: " + dq);

        // ===============================
        // 4. ADD MORE (Mixed operations)
        // ===============================
        dq.offerLast("Task3");
        dq.offerFirst("CriticalTask");
        dq.offerLast("Task4");

        System.out.println("After More Insertions: " + dq);

        // ===============================
        // 5. REAL-TIME PROCESSING
        // ===============================
        System.out.println("\nProcessing Tasks:");

        while (!dq.isEmpty()) {
            String task = dq.pollFirst(); // always safe
            System.out.println("Processing: " + task);
        }

        // ===============================
        // 6. FINAL CHECK
        // ===============================
        System.out.println("\nDeque Empty? " + dq.isEmpty());
        System.out.println("Size: " + dq.size());
    }
}