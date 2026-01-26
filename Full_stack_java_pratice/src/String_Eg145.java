public class String_Eg145 {
    public static void main(String[] args) {

        // String array
        // Characters are stored as String using DOUBLE quotes
        // Using single quotes ('A') would be char and cause compile-time error
        String[] arr = {"A", "B", "C", "D"};

        // Loop iterates over array elements
        for (int i = 0; i < arr.length; i++) {

            // Prints current array element followed by space
            System.out.println(arr[i] + " ");

            // equals() compares String content
            // When current element is "C"
            if (arr[i].equals("C"))
                // continue skips the remaining statements
                // and moves control to next loop iteration
                continue;

            // This line executes ONLY when element is NOT "C"
            System.out.println("Workdone");

            // break terminates the loop immediately
            // Loop stops after first iteration because break is executed
            break;
        }
    }
}
