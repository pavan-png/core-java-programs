public class String_Builder_Equals_Method_Eg5 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Hello");
        System.out.println("Without equals method : " +(s1==s2)); // equals operator does not compare the content
        // works similarly as above print statement , compares reference
        System.out.println("with equals method : " +s1.equals(s2));
        int a =10;
    }
}
