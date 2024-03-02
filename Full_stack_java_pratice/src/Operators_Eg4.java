public class Operators_Eg4 {
    public static void main(String[] args) {
        boolean status = true;
        // compile time error.
       //  System.out.println((status = false || status = true | status = false);
        System.out.println(status);
    }
}
