public class String_Eg51 {
    public static void main(String[] args) {

        // String contains two words with ONE space in between
        String s = "Hello world";

        // trim() removes spaces only from beginning and end
        // There are NO leading or trailing spaces here
        // Also, String is immutable, so this call has NO effect
        s.trim();

        // indexOf(" ") finds the position of the FIRST space character
        // Indexing in Java starts from 0
        // H = 0, e = 1, l = 2, l = 3, o = 4, space = 5
        int i = s.indexOf(" ");

        // Prints the index position of the space
        System.out.println(i);

        // IMPORTANT NOTES:
        // indexOf() → index starts from 0
        // length()  → total count of characters (starts from 1 conceptually)
        // trim() does NOT remove spaces in between words
    }
}
