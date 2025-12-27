public class Local_Variable_Eg6 {

    public static void main(String[] args) {

        int x = 5;
        // x is a local variable of main()
        // Stored in stack with value 5

        Local_Variable_Eg6 p = new Local_Variable_Eg6();
        // Object 'p' is created in heap
        // Reference 'p' is stored in stack

        p.doStuff(x);
        // Step 1:
        // The VALUE of x (5) is passed to doStuff()
        // Java is strictly pass-by-value
        // A COPY of x is sent, not the original variable

        System.out.println(" main x = " + x);
        // Step 4:
        // Prints the value of x in main()
        // main's x is NOT affected by doStuff()
        // Output: main x = 5
    }

    void doStuff(int x) {
        // Step 2:
        // This x is a NEW local variable
        // It is DIFFERENT from main()'s x
        // Initial value here is 5 (copied)

        System.out.println(" do stuff x = " + x++);
        // Step 3:
        // Post-increment behavior:
        // 1. Prints current value of x → 5
        // 2. Then increments x to 6
        // Increment happens ONLY to this local copy

        // After this method ends,
        // this local x is destroyed
    }
}
