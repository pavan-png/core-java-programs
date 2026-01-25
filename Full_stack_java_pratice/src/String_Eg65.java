public class String_Eg65 {
    public static void main(String[] args) {

        // final String literal
        // Value is known at COMPILE TIME
        final String fname = "james";

        // Normal String variable (NOT final)
        // Even though value is assigned, it is treated as a variable
        String Lname = "Gosling";

        // Runtime concatenation
        // Because Lname is NOT final, compiler cannot pre-calculate this
        // A NEW String object is created in Heap
        String name1 = fname + Lname;

        // Compile-time concatenation
        // fname is final and value is known at compile time
        // "james" + "Gosling" → "jamesGosling"
        // Stored in String Constant Pool (SCP)
        String name2 = fname + "Gosling";

        // Compile-time concatenation using only literals
        // Stored in SCP
        String name3 = "james" + "Gosling";

        // == compares REFERENCES (memory addresses)
        // name1 → Heap object
        // name2 → SCP object
        System.out.println(name1 == name2); // false

        // Both name2 and name3 point to SAME SCP object
        System.out.println(name2 == name3); // true
    }
}
