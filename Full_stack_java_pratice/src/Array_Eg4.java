public class Array_Eg4 {

    public static void main(String[] args) {

        // Step 1: Create and initialize the integer array
        // Index :  0   1   2   3   4
        // Value : {15, 30, 45, 60, 75}
        int[] intArr = {15, 30, 45, 60, 75};

        // Step 2: Copy value from index 4 into index 2
        // intArr[4] value is 75
        // intArr[2] becomes 75 (old value 45 is overwritten)
        intArr[2] = intArr[4];

        // Step 3: Assign new value 90 to index 4
        // This does NOT affect index 2
        intArr[4] = 90;

        // Step 4: Print all elements using for-each loop
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }
}
