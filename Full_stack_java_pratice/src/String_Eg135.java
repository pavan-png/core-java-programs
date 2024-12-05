public class String_Eg135 {
    public static void main(String[] args) {
        String s1 = "null"+null+1;
        // if the 1st one is string all the other data is also treated as string
        // treated as String and concatenated.
        System.out.println(s1);
    }
}
