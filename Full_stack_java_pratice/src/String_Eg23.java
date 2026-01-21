public class String_Eg23 {
    public static void main(String[] args) {

        // Creating a String literal
        String s = "Hello woooooooooorld";

        // indexOf(char)
        // Returns the index of the FIRST occurrence of the given character
        // Index counting starts from 0
        System.out.println(s.indexOf('w'));

        // indexOf(char)
        // Returns the index of the FIRST occurrence of the character 'o'
        // Even though 'o' appears many times, only the first index is returned
        System.out.println(s.indexOf('o')); // index starts from 0

        // If the character is NOT found in the string,
        // indexOf() returns -1
        System.out.println(s.indexOf('y'));

        // lastIndexOf(char)
        // Returns the index of the LAST occurrence of the given character
        System.out.println(s.lastIndexOf('o'));

        // If the character is NOT found in the string,
        // lastIndexOf() also returns -1
        System.out.println(s.lastIndexOf('z'));
    }
}
