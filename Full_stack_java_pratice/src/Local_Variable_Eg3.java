public class Local_Variable_Eg3 {

    public static void main(String[] args) {

        int i;
        // i is a local (stack) variable declared inside main()
        // It is NOT initialized

        System.out.println("hello");
        // No Compile Time Error here

        // Reason:
        // Java allows declaration of a local variable without initialization
        // Compile Time Error occurs ONLY when an uninitialized local variable is USED

        // Example of invalid usage:
        // System.out.println(i);  // ❌ Compile Time Error (variable i might not have been initialized)
    }
}
