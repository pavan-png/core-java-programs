import java.util.Stack;

public class Stack_Eg1 {
    public static void main(String[] args) {

        // 1️⃣ Create Stack (Constructor)
        Stack<Integer> stack = new Stack<>();

        // 2️⃣ empty()
        System.out.println("Is stack empty? " + stack.empty());

        // 3️⃣ push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after push: " + stack);

        // 4️⃣ peek()
        System.out.println("Top element (peek): " + stack.peek());

        // 5️⃣ search()
        System.out.println("Position of 20 from top: " + stack.search(20));
        System.out.println("Position of 100 from top: " + stack.search(100)); // not present

        // 6️⃣ pop()
        System.out.println("Removed element (pop): " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // Final empty check
        System.out.println("Is stack empty now? " + stack.empty());
    }
}