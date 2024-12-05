public class String_Eg131 {
    public static void main(String[] args) {
        String s = "mohanpavankalyan";
        System.out.println(s.replace('a','A').indexOf('a'));
        // replace method replaces all the occurances of the 'a' with 'A' in the string
        // and in the index() 'a' is not found in the string it returns -1.

        StringBuilder s1 = new StringBuilder("mohanpavankalyan");
        s1.replace(2,4,"hello");
        System.out.println(s1);

        //replace() method is present in both String and stringBuilder but argument list is different
    }
}
