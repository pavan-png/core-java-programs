public class String_Eg17 {
    public static void main(String[] args) {

        // Creating an array of String objects
        String[] str = {"A", "B"};

        // Index variable to track array position
        int idx = 0;

        // Enhanced for loop to iterate through the String array
        for (String s : str) {

            // concat() does NOT change the original String
            // It creates a NEW String object with concatenated value
            // But here, the returned reference is NOT stored back into the array
            // So the new String object becomes unused
            // Unused objects are eligible for Garbage Collection
            str[idx].concat("element" + idx);

            // Move to the next index
            idx++;
        }

        // Normal for loop to print array elements
        for (idx = 0; idx < str.length; idx++) {

            // Since original strings were never updated,
            // output will still be "A B"
            System.out.print(str[idx] + " ");
        }
    }
}
