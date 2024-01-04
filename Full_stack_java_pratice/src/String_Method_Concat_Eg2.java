public class String_Method_Concat_Eg2 {
    public static void main(String[] args) {
        String s1 = "Hello";

        System.out.println("using concat method in print statement  :  " +s1.concat("Everyone"));

        // concat is method of string class .
        String s2 = s1.concat("Everyone ");

        System.out.println(s1);
        System.out.println(s2);
    }
}
