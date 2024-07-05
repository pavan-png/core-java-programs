public class String_Eg135 {
    public static void main(String[] args) {
        String s1 = "null"+null+1;
        // if "+" operator is applied on the string and other data types, remaining data types is also
        // treated as String and concatenated.
        System.out.println(s1);
    }
}
