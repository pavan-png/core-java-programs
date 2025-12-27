public class Increment_Eg8 {
    public static void main(String[] args) {

        int i = 5;

        // i++ → prints 5, then i becomes 6
        System.out.print(i++ + " ");   // Output: 5

        // i is now 6 → prints 6
        System.out.print(i + " ");     // Output: 6

        // ++i → i becomes 7, prints 7
        System.out.print(++i + " ");   // Output: 7

        // Expression: ++i + i++
        //
        // Step 1: ++i → i becomes 8, returns 8
        // Step 2: i++ → returns 8, then i becomes 9
        //
        // So: ++i + i++ = 8 + 8 = 16
        //
        // After everything, i = 9
        System.out.print(++i + i++ + " ");   // Output: 16
    }
}
