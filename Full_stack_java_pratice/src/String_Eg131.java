public class String_Eg131 {
    public static void main(String[] args) {

        // String is IMMUTABLE
        // Original String object
        String s = "mohanpavankalyan";

        // replace('a','A') replaces ALL occurrences of 'a' with 'A'
        // A NEW String object is created
        // Result becomes: "mohAnpAvAnkAlyAn"
        // indexOf('a') searches for lowercase 'a'
        // Since all 'a' are replaced with 'A',
        // lowercase 'a' is NOT present
        // Hence indexOf() returns -1
        System.out.println(s.replace('a', 'A').indexOf('a'));  // -1


        // StringBuilder is MUTABLE
        // Initial content → "mohanpavankalyan"
        StringBuilder s1 = new StringBuilder("mohanpavankalyan");

        // replace(int start, int end, String str)
        // Replaces characters from index 2 to (4 - 1)
        // Index 2 → 'h', Index 3 → 'a'
        // These characters are replaced with "hello"
        // Modification happens on the SAME object
        // Result → "mohellonpavankalyan"
        s1.replace(2, 4, "hello");

        // Prints modified StringBuilder content
        System.out.println(s1);


        // IMPORTANT NOTE:
        // replace() method exists in BOTH String and StringBuilder
        // BUT the method signatures (argument list) are DIFFERENT
        //
        // String        → replace(char, char)
        // StringBuilder → replace(int, int, String)
    }
}
