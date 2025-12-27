public class Ternary_Operator {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        /*
         Ternary operator syntax:
         ------------------------
         condition ? expression_if_true : expression_if_false

         Here:
         condition            → (a > b)
         expression_if_true   → a
         expression_if_false  → b

         If (a > b) is true, value of `a` is assigned to `min`.
         If (a > b) is false, value of `b` is assigned to `min`.
        */
        int min = (a > b) ? a : b;

        /*
         Prints the value selected by the ternary operator.
         Since a = 5 and b = 10, condition is false,
         so b (10) is printed.
        */
        System.out.println(min);
    }
}
