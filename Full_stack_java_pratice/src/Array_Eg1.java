public class Array_Eg1 {

    public static void main(String[] args) {

        // Step 1: Create and initialize the array
        // Index :  0  1  2  3  4
        // Values: {0, 2, 4, 1, 3}
        int[] arr = {0, 2, 4, 1, 3};

        // Step 2: Loop through each index of the array
        for (int i = 0; i < arr.length; i++) {

            /*
             Core tricky statement:

             arr[i] = arr[(arr[i] + 3) / 5];

             Explanation:
             1) arr[i]        → value at index i
             2) arr[i] + 3    → add 3 to that value
             3) (arr[i]+3)/5 → integer division (no decimals)
             4) That result is used as an INDEX
             5) Value at that index is assigned back to arr[i]
            */

            arr[i] = arr[(arr[i] + 3) / 5];
        }

        // Step 3: Print the element at index 1
        System.out.println(arr[1]);
    }
}
