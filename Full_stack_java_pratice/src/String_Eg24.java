public class String_Eg24 {
    public static void main(String[] args) {

        // Creating a String literal
        String s = "pavan";

        // toUpperCase() creates a NEW String because content changes
        // "pavan" → "PAVAN"
        String s1 = s.toUpperCase();

        // toLowerCase() returns the SAME String object
        // because "pavan" is already in lowercase
        String s2 = s.toLowerCase();

        // '==' compares REFERENCES (memory addresses), not content
        // s and s1 refer to different objects
        // Output: false
        System.out.println(s == s1);

        // s and s2 refer to the SAME object
        // because no new object was created
        // Output: true
        System.out.println(s == s2);

        // Creating another String literal
        String s10 = "mohan";

        // toLowerCase() does NOT create a new object
        // because "mohan" is already in lowercase
        String s11 = s10.toLowerCase();

        // Both references point to the SAME object
        // Output: true
        System.out.println(s10 == s11);
    }
}
