public class Assignment_Operator_Eg3 {
    public static void main(String[] args) {
        // literal (number) increment is not possible.
        int x = 5;
        x *= 3*5 + 7*x-1+ ++x;
        /* first the right most part is evaluated based on the R.H.S part based on operator precedence.
        after that L.H.S part is evaluated, but during the Unary add,mul,div,sub the variable value is the original one
        irrespective of its increment and decrement in the R.H.S part
         */
        // check operator precedence
        System.out.println(x);
        int y = x+++1;
        System.out.println(x);


    }
}
