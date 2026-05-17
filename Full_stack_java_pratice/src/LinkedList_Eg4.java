import java.util.LinkedList;

public class LinkedList_Eg4 {
    public static void main(String[] args) {
        LinkedList<String> users = new LinkedList<>();

        users.add("Pavan");
        users.add("Ravi");
        users.add("Pavan"); // duplicate

        // contains() → check user exists
        if (users.contains("Pavan")) {
            System.out.println("User already exists");
        }

        // indexOf() → first occurrence
        System.out.println("First Pavan index: " + users.indexOf("Pavan"));

        // lastIndexOf() → last occurrence
        System.out.println("Last Pavan index: " + users.lastIndexOf("Pavan"));

        // equals() → compare lists
        LinkedList<String> newUsers = new LinkedList<>(users);

        if (users.equals(newUsers)) {
            System.out.println("Both lists are same");
        }
    }
}
