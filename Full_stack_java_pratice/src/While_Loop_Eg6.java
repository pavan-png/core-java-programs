public class While_Loop_Eg6 {
    public static void main(String[] args) {

        // Two variables are initialized
        int a = 10;
        int b = 20;

        // while loop condition:
        // a < b is checked at RUNTIME
        // Even though it is true now, the compiler does NOT treat this as constant
        while (a < b) {

            // This statement keeps printing "hello"
            // NOTE: a and b are NEVER modified inside the loop
            // So the condition (a < b) will always remain true at runtime
            System.out.println("hello");
        }

        // This statement is SYNTactically valid
        // Compiler does NOT give unreachable statement error
        // Because it cannot GUARANTEE at compile time that the loop is infinite
        System.out.println("hi");
    }
}
