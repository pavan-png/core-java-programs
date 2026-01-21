public class Array_Eg21 {

    public static void main(String[] args) {

        // 2D array of Strings
        // arr has 2 rows:
        // Row 0 -> {"%", "***"}
        // Row 1 -> {"!!!!", "@@@@@", "######"}
        String[][] arr = {
                {"%", "***"},
                {"!!!!", "@@@@@", "######"}
        };

        // Outer for-each loop:
        // 'str' represents ONE complete row at a time (String[])
        for (String[] str : arr) {

            // Inner for-each loop:
            // 's' represents ONE element inside the current row
            for (String s : str) {

                // Print the current string
                System.out.println(s);

                // If the length of the string is exactly 4
                // example: "!!!!"
                if (s.length() == 4)
                    break; // breaks ONLY the INNER loop
            }

            // Control comes here after inner loop ends
            // This break stops the OUTER loop completely
            // So no further rows are processed
            break;
        }
    }
}
