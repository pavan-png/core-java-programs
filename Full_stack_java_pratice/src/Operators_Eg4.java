public class Operators_Eg4 {
    public static void main(String[] args) {
        boolean status = true;
        // compile time error.
       // System.out.println((status = false || status = true | status = false));
        // if same variable is used for reassigning during the condition check first it should be surrounded with brackets. otherwise
        // it will throw compile time error.
        System.out.println(status);
    }
}
