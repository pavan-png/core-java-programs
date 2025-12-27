public class Counter {

    int count;
    // Instance variable
    // Each Counter object has its own 'count'

    private static void increment(Counter counter) {
        // 'counter' is a local reference variable
        // It receives a COPY of the reference passed from main()

        counter.count++;
        // Increments the 'count' field of the object
        // referenced by 'counter'
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        // Step 1:
        // A new Counter object is created in heap
        // c1 stores the reference to that object
        // count value is 0 (default for int)

        Counter c2 = c1;
        // Step 2:
        // c2 is assigned the same reference as c1
        // c1 and c2 now point to the SAME object

        Counter c3 = null;
        // Step 3:
        // c3 is a reference variable that points to no object
        // (not used further in this program)

        c2.count = 1000;
        // Step 4:
        // Using reference c2, the instance variable 'count'
        // of the shared object is set to 1000
        // Since c1 and c2 refer to the same object,
        // c1.count is also now 1000

        increment(c2);
        // Step 5:
        // c2 is passed to the static method increment()
        // A copy of the reference is received in parameter 'counter'
        // 'counter' also points to the SAME object

        // Inside increment():
        // counter.count++ changes count from 1000 to 1001

        System.out.println(c2.count);
        // Step 6:
        // Prints the current value of 'count'
        // Output: 1001
    }
}
