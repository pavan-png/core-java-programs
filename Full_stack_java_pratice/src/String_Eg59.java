public class String_Eg59 {
    public static void main(String[] args) {

        // String literal stored in String Constant Pool (SCP)
        String s1 = "Hello";

        // Another String literal in SCP
        String s2 = "pavan";

        // IMPORTANT:
        // This is ASSIGNMENT (=), NOT comparison (==)
        // RHS (s2) is evaluated first
        // The reference of s2 is assigned to s1
        // So s1 now points to the same object as s2
        //
        // println prints the VALUE of the assignment expression
        // After assignment, s1 contains "pavan"
        System.out.println(s1 = s2);

        // After this line:
        // s1 → "pavan"
        // s2 → "pavan"
        // "Hello" is no longer referenced by s1
    }
}
