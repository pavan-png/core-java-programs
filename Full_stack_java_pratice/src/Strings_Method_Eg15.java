public class Strings_Method_Eg15 {
    public static void main(String[] args) {

        // Creating a String object with value "pavan"
        String s = new String("pavan");

        // charAt(2) returns the character present at index 2
        // Indexing starts from 0
        // p -> 0, a -> 1, v -> 2, a -> 3, n -> 4
        // So output will be 'v'
        System.out.println(s.charAt(2));

        // charAt(-1) tries to access a negative index
        // Java does NOT support negative indexing
        // This will throw StringIndexOutOfBoundsException at runtime
        System.out.println(s.charAt(-1));

        // charAt(500) tries to access an index beyond string length
        // Length of "pavan" is 5 (valid index range: 0 to 4)
        // This will also throw StringIndexOutOfBoundsException at runtime
        System.out.println(s.charAt(500));

        // Strings cannot be accessed using array style indexing
        // This causes a compile-time error
        // Correct way is using charAt(index)
        // System.out.println(s[2]);

    }
}
