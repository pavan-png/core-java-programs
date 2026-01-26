public class String_Eg83 {
    public static void main(String[] args) {

        // replace(oldChar, newChar)
        // Replaces ALL occurrences of the old character with the new character
        // "Hello" → 'l' is replaced with 'g'
        // Result: "Heggo"
        String s = "Hello".replace('l','g');
        System.out.println(s);

        // substring(beginIndex, endIndex)
        // Starts from index 1
        // Ends at index 5 - 1 (endIndex is excluded)
        // Characters taken: index 1 to 4
        // H e g g o
        // 0 1 2 3 4
        // Result: "eggo"
        System.out.println(s.substring(1,5));

        // substring(beginIndex, endIndex)
        // Here beginIndex = 4 and endIndex = 1
        // beginIndex must be LESS THAN or EQUAL TO endIndex
        // Since beginIndex > endIndex, this causes an exception
        // Exception: StringIndexOutOfBoundsException
        System.out.println(s.substring(4,1));
    }
}
