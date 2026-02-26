public class Exception_Handling_Eg12 {

    static String s = "-";
    // Step 1: Static variable initialized → s = "-"

    public static void main(String[] args) {

        // Step 2: main() creates object and calls s1()
        new Exception_Handling_Eg12().s1();

        // Step 9: After exception handling completes, print s
        System.out.println(s);   // Output: -c
    }

    void s1() {
        try {
            // Step 3: s1() calls s2()
            s2();
        }
        catch (Exception e) {
            // Step 8: Exception caught here (propagated from s2)
            s += "c";   // s becomes "-c"
        }
    }

    public void s2() throws Exception {

        // Step 4: s2() calls s3()
        s3();

        // Step 6: These lines are NEVER executed
        // because exception already occurred in s3()

        s += "2";     // ❌ skipped
        s3();         // ❌ skipped
        s += "2b";    // ❌ skipped
    }

    void s3() throws Exception {

        // Step 5: Exception thrown here
        throw new Exception();

        // Step 7: After throwing, control returns to s2(),
        // but since s2() does not handle it,
        // the method immediately exits and exception
        // propagates to s1()
    }
}