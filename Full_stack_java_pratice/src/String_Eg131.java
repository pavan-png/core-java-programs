public class String_Eg131 {
    public static void main(String[] args) {
        String s = "mohanpavankalyan";
        System.out.println(s.replace('a','A').indexOf('a'));
        // replace method replaces all the occurances of the 'a' with 'A' in the string
        // and hence 'a' is not found in the string it returns -1.
    }
}
