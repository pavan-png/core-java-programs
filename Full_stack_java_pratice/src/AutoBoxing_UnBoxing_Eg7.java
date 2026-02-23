public class AutoBoxing_UnBoxing_Eg7 {

    public static void main(String[] args) {

        // Using 'new' explicitly.
        // A new Integer object is created in heap memory.
        Integer i1 = new Integer(10);

        // Here we are NOT creating a new object.
        // We are just copying the reference of i1 into i2.
        //
        // So both i1 and i2 point to the SAME object in memory.
        Integer i2 = i1;  // reference copy

        // '==' compares references (memory addresses).
        // Since both references point to same object,
        // result will be TRUE.
        System.out.println(i1 == i2);   // true
    }
}