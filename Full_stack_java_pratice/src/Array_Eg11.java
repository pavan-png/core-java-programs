public class Array_Eg12 {
    public static void main(String[] args) {

        // 2D String array (Array of arrays)
        // arr has 2 rows
        // Row 0 → {"A", "B", "C"}
        // Row 1 → {"C", "D"}
        String[][] arr = {{"A","B","C"},{"C","D"}};

        // Outer loop → controls ROWS
        // i = 0 → first row
        // i = 1 → second row
        for (int i = 0; i < arr.length; i++) {

            // Inner loop → controls COLUMNS of current row
            // arr[i].length may change for each row
            for (int j = 0; j < arr[i].length; j++) {

                // Print current element
                System.out.print(arr[i][j] + " ");

                // Check if current element is "B"
                if (arr[i][j].equals("B")) {

                    // break → exits ONLY the INNER loop
                    // Control goes back to outer loop
                    break;
                }
            }

            // continue → skips remaining code in outer loop
            // and moves to the next row (i++)
            continue;

        }
    }
}
