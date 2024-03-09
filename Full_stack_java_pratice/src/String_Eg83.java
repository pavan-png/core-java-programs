public class String_Eg83 {
    public static void main(String[] args) {
        String s = "Hello".replace('l','g');
        System.out.println(s);
        // all the occurances of old character is replaced with new character.

        System.out.println(s.substring(1,5));
        // end index is n-1 .

        System.out.println(s.substring(4,1));
        // exception because starting index  should always  be greater than end index.

    }
}
