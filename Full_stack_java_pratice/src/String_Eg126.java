public class String_Eg126 {
    public static void main(String[] args) {

        // String with multiple words
        String s = "java j2ee Spring Hibernate Sql";

        // Another String with different words
        String s1 = "python java scala c c++";

        // contains("HTML") checks whether the given substring is present
        // contains() returns boolean value → true or false
        // "HTML" is NOT present in both s and s1
        // So both expressions return false
        // false == false results in true
        System.out.println(s.contains("HTML") == s1.contains("HTML")); // true


        // String with leading space
        String s2 = " hello pavan how are you";

        // contains("pavan") checks for exact sequence of characters
        // It is case-sensitive
        // "pavan" is present in s2
        // Hence it returns true
        System.out.println(s2.contains("pavan"));  // true
    }
}
