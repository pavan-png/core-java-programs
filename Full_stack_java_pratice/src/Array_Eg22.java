public class Array_Eg22 {

    public static void main(String[] args) {

        // 2D array of String
        // arr has two rows:
        // First row  -> {"%", "***"}
        // Second row -> {"!!!!", "@@@@@", "######"}
        String[][] arr = {
                {"%", "***"},
                {"!!!!", "@@@@@", "######"}
        };

        // Outer for-each loop
        // 'str' represents ONE complete row of the 2D array at a time
        for (String[] str : arr) {

            // Inner for-each loop
            // 's' represents ONE String element from the current row
            for (String s : str) {

                // Print the current string
                System.out.println(s);

                // Check the length of the current string
                if (s.length() == 4) {
                    // If length is 4 (example: "!!!!")
                    // break stops ONLY the inner loop
                    // control goes back to the outer loop
                    break;
                }
            }
            // No break here, so the outer loop continues
            // and processes the next row
        }
    }
}
