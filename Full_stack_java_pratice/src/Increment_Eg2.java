public class Increment_Eg2 {
    public static void main(final String[] args) {

        int a = 100;

        // -a++ means:
        // Step 1: a++ → returns 100 (old value), then a becomes 101
        // Step 2: Negative sign applies to the returned value → -100
        //
        // So this prints: -100
        System.out.println(-a++);

        // Now a has already been incremented to 101,
        // so this prints the updated value: 101
        System.out.println(a);
    }
}
