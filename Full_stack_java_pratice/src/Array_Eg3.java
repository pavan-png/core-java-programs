public class Array_Eg3 {

    public static void main(String[] args) {

        // Step 1: Declare an integer array reference
        // At this point, no array object is created
        // ar is only a reference variable (points to nothing yet)
        int[] ar;

        // Step 2: Create the array object with size 2
        // Memory for 2 integers is allocated in heap
        // Default values are assigned (0 for int)
        ar = new int[2];

        // Step 3: Assign value 10 to index 0
        ar[0] = 10;

        // Step 4: Assign value 5 to index 1
        ar[1] = 5;

        // Step 5: Print values stored at index 0 and index 1
        System.out.println(ar[0] + " : " + ar[1]);
    }
}
