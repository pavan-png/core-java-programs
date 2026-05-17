import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Eg1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Next Task: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}
