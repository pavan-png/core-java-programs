public class String_Eg133 {
    public static void main(String[] args) {
        String s = "Hey pavan how is the day";
        System.out.println(s.charAt(s.length()));
        // length => counts the no of characters , here the starting index is 1 .
        // charAt() =. index starts from 0 . so it leads to StringIndexOUtOfBoundsException
    }
}
