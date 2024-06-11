public class String_Eg116 {
    public static void main(String[] args) {
        String s1 = "ONE";

        // since there reference to collect garbage collector will clear both "TWO" and "THREE"
        s1.concat("TWO");
        s1.concat("THREE");

        System.out.println(s1);
    }
}
