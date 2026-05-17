import java.util.Deque;
import java.util.LinkedList;

public class LinkedList_Eg3 {
    public static void main(String[] args) {

        // Using Deque as Stack (industry preferred approach)
        Deque<String> stack = new LinkedList<>();

        // push() → adds element to TOP of stack
        // Internally same as addFirst()
        stack.push("Page1");
        stack.push("Page2");
        stack.push("Page3");

        // Stack now:
        // TOP → [Page3, Page2, Page1]

        // peek() → views top element WITHOUT removing
        // ✔ Safe → returns null if empty
        System.out.println("Peek (Top Element): " + stack.peek());

        // pop() → removes and returns top element
        // ⚠ Throws exception if empty
        // Used when we are sure stack is not empty
        System.out.println("Removed (Pop): " + stack.pop());

        // Stack becomes:
        // [Page2, Page1]

        System.out.println("Removed (Pop): " + stack.pop());

        // Final stack:
        // [Page1]
    }
}
