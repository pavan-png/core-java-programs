public class String_Eg72 {
    public static void main(String[] args) {

        // Creating a 2D String array with ONLY row size defined
        // This is a JAGGED ARRAY (rows can have different column sizes)
        String[][] chs = new String[2][];

        // Row 0 has 2 columns
        chs[0] = new String[2];

        // Row 1 has 5 columns
        chs[1] = new String[5];

        // Starting value (ASCII value of 'a' is 97)
        int i = 97;

        // Outer loop iterates over rows
        for (int a = 0; a < chs.length; a++) {

            // INNER LOOP IS TRICKY:
            // chs.length = 2 (number of rows)
            // This loop runs ONLY 2 times for EVERY row,
            // even though row 1 has 5 columns
            for (int b = 0; b < chs.length; b++) {

                // Assigning string value with current number
                // Only first 2 columns of each row are filled
                chs[a][b] = " " + i;
                i++;
            }
        }

        // Printing the 2D array
        for (String[] ca : chs) {
            for (String c : ca) {

                // Unassigned elements remain null
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
