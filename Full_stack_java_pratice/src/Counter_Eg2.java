public class Counter_Eg2 {

    int count;
    // Instance variable
    // Each Counter_Eg2 object has its own 'count'

    private static void increment(Counter_Eg2 counter) {
        // 'counter' is a local reference variable
        // It receives a COPY of the reference passed from main()
        // It points to the SAME object as c1 and c2

        System.out.println(counter.count++);
        // Post-increment operation:
        // 1. Prints the current value of count (1000)
        // 2. Then increments count to 1001
    }

    public static void main(String[] args) {

        Counter_Eg2 c1 = new Counter_Eg2();
        // Step 1:
        // A new Counter_Eg2 object is created in heap
        // c1 stores the reference to that object
        // Default value of count is 0

        Counter_Eg2 c2 = c1;
        // Step 2:
        // c2 is assigned the same reference as c1
        // c1 and c2 point to the SAME object

        Counter_Eg2 c3 = null;
        // Step 3:
        // c3 is a reference variable pointing to null
        // (not used further)

        c2.count = 1000;
        // Step 4:
        // Using reference c2, count is set to 1000
        // Since c1 and c2 refer to the same object,
        // c1.count is also now 1000

        increment(c2);
        // Step 5:
        // c2 is passed to increment()
        // A copy of the reference is stored in 'counter'
        // counter.count++ prints 1000 and then increments count to 1001

        System.out.println(c2.count);
        // Step 6:
        // Prints updated value of count
        // Output: 1001
    }
}
