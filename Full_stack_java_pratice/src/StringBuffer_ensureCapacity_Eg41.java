public class StringBuffer_ensureCapacity_Eg41 {
    public static void main(String[] args) {

        // Creating an empty StringBuffer
        // Default initial capacity = 16
        StringBuffer s = new StringBuffer();

        // Prints the default capacity
        System.out.println(s.capacity());   // 16

        // ensureCapacity(int minimumCapacity)
        // Ensures that the capacity is at least 20
        // If current capacity is already sufficient, nothing changes
        // If not sufficient, capacity is increased using JVM growth rule
        s.ensureCapacity(20);

        /*
         Important rules of ensureCapacity():

         1) Default StringBuffer capacity = 16

         2) ensureCapacity(n) guarantees that capacity will be
            AT LEAST 'n'

         3) If n <= current capacity:
            → capacity remains unchanged

         4) If n > current capacity:
            → new capacity is calculated as:
              (current capacity + 1) * 2

         NOTE:
         - ensureCapacity() does NOT use user-defined constructor values
         - It works only with the CURRENT capacity
         - No new StringBuffer object is created
         */

        // After ensureCapacity(20):
        // current capacity = 16
        // required = 20 (>16)
        // new capacity = (16 + 1) * 2 = 34
        System.out.println(s.capacity());   // 34

        // Printing content (still empty)
        System.out.println(s);

        // length() returns number of characters stored
        // No characters added yet
        System.out.println(s.length());     // 0

        // Capacity remains the same until exceeded again
        System.out.println(s.capacity());   // 34
    }
}
