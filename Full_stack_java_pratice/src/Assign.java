public class Assign {
    public static void main(String[] args) {
        int a =10;
        a *= 10+3*4 - --a + a-- + ++a;
          /* first the right most part is evaluated based on the R.H.S part based on operator precedence.
        after that L.H.S part is evaluated, but during the Unary add,mul,div,sub the variable value is the original one
        irrespective of its increment and decrement in the R.H.S part
         */
        System.out.println(a);

    }
}
