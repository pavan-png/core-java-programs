public class String_Eg144 {
    public static void main(String[] args) {

        // String array with 3 elements
        String[] elements = {"for", "tea", "to"};

        // Ternary operator syntax:
        // condition ? value_if_true : value_if_false

        // elements.length > 0
        // Array length is 3, so condition is true

        // Since condition is true,
        // elements[0] is assigned to 'first'
        // elements[0] → "for"
        String first = (elements.length > 0) ? elements[0] : null;

        // Prints the value stored in 'first'
        System.out.println(first);   // for
    }
}
