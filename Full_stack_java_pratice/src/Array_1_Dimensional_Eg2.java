public class Array_1_Dimensional_Eg2 {
    public static void main(String[] args) {

        // 1️⃣ Array declaration and initialization using 'new' keyword
        // This explicitly creates an integer array with given values
        int[] ar = new int[]{20, 40, 50, 50};

        // 2️⃣ Array declaration and initialization using shortcut syntax
        // Java automatically creates the array and assigns values
        int[] arr = {10, 20, 30, 40};

        // Both the above array declarations are valid
        // They differ only in syntax, not in behavior

        // 3️⃣ for-each loop (Enhanced for loop) for the first array 'ar'
        // The loop reads each element of the array one by one
        // 'num' is a temporary variable that holds a copy of each element
        System.out.println("Elements of first array (ar):");
        for (int num : ar) {
            System.out.println(num);
        }

        // 4️⃣ for-each loop for the second array 'arr'
        // The loop automatically starts from the first element
        // and ends at the last element of the array
        System.out.println("Elements of second array (arr):");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
