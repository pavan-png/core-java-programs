public class String_Eg129 {
    public static void main(String[] args) {

        // String literal stored in String Constant Pool (SCP)
        // s initially refers to "hello"
        String s = "hello";

        // boolean array of size 1 is created
        // Default value of boolean array elements is false
        boolean[] flag = new boolean[1];

        // flag[0] is false by default
        // Condition fails, so control NEVER enters this block
        if (flag[0]) {   // false
            // This line is never executed
            // s will NOT be reassigned
            s = "welcome";
        }

        // Since s was never changed,
        // it still refers to "hello"
        System.out.println(s);   // prints "hello"
    }
}
