public class Valid_Array_Declarations {

    public static void main(String[] args) {

        /* =====================================================
           1️⃣ ONE-DIMENSIONAL ARRAY DECLARATIONS
           ===================================================== */

        // Valid 1-D array declarations
        int[] arr1;        // Recommended and most readable style
        int arr2[];        // Valid but less preferred (C-style)
        int[] arr3;        // Valid

        // Invalid declaration
        // []int arr4;     // ❌ Invalid: data type must come first


        /* =====================================================
           2️⃣ MULTIPLE 1-D ARRAY DECLARATIONS
           ===================================================== */

        int[] a, b;        // Both 'a' and 'b' are 1-D arrays
        int c[], d[];      // Both 'c' and 'd' are 1-D arrays

        // Invalid multiple declaration
        // int[] e, []f;   // ❌ Invalid: brackets cannot appear before variable name


        /* =====================================================
           3️⃣ ARRAY OBJECT CREATION (SIZE DECLARATION)
           ===================================================== */

        arr1 = new int[4];   // Valid: size specified during object creation
        a = new int[4];
        b = new int[5];

        // Invalid size declaration
        // int[3] arr5;     // ❌ Invalid: size cannot be mentioned in declaration


        /* =====================================================
           4️⃣ ARRAY INITIALIZATION
           ===================================================== */

        // Declaration + initialization (valid)
        int[] arr6 = {4, 5, 6, 7, 8};

        // Declaration + object creation + initialization (valid)
        int[] arr7 = new int[] {9, 10, 11, 12, 13};

        // Invalid initialization
        /*
        int[] arr8;
        arr8 = {1, 3, 4, 5, 6};   // ❌ Invalid: array literal must be in same line
        */


        /* =====================================================
           5️⃣ TWO-DIMENSIONAL ARRAY DECLARATIONS
           ===================================================== */

        // Valid 2-D array declarations
        int[][] arr9;
        int [][]arr10;
        int arr11[][];
        int[] arr12[];
        int []arr13[];
        int[] []arr14;

        // Invalid declaration
        // [][]int arr15;   // ❌ Invalid: brackets cannot be before data type


        /* =====================================================
           6️⃣ MULTIPLE 2-D ARRAY DECLARATIONS
           ===================================================== */

        int[][] arr16, arr17;   // Both are 2-D arrays

        // Mixed declarations (VALID but confusing – avoid in real projects)
        int[] []arr18, arr19[]; // arr18 → 2-D, arr19 → 3-D

        // Invalid multiple declaration
        // int[] []arr20, []arr21; // ❌ Invalid: brackets cannot be placed before variable name. this rule is applied from 2nd variable during multiple initialization


        /* =====================================================
           7️⃣ DIMENSION VARIATION EXAMPLES (VERY IMPORTANT)
           ===================================================== */

        int[] arr22, arr23;          // Both are 1-D arrays

        int[][] arr24, arr25;        // Both are 2-D arrays

        int[] arr26, arr27[][];      // arr26 → 1-D, arr27 → 3-D

        int[] []arr28[], arr29[];    // arr28 → 3-D, arr29 → 2-D

        int []arr30[], arr31[];      // arr30 → 2-D, arr31 → 2-D


        /* =====================================================
           8️⃣ BEST PRACTICE (INTERVIEW POINT)
           ===================================================== */

        // ✔️ Always prefer this style:
        int[][] matrix;

        // ❌ Avoid confusing mixed-bracket declarations in real projects
    }
}
