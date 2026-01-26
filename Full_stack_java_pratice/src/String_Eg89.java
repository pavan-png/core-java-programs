public class String_Eg89 {
    public static void main(String[] args) {

        // Creating a String that contains a single space character
        String s1 = " ";

        // isBlank()
        // Returns true if the string is empty OR
        // contains only white spaces (spaces, tabs, new lines)
        // Here s1 has only a space, so it returns true
        System.out.println(s1.isBlank()); // true

        // isEmpty()
        // Returns true ONLY if the string length is 0
        // Here s1 has one space character, so length is 1
        // Therefore, it returns false
        System.out.println(s1.isEmpty()); // false
    }
}
