public class Nested_Ternary_Operator {
    public static void main(final String[] args) {

        int x = 100;

        /*
         Post-increment:
         a = x; then x becomes x + 1
         a = 100, x = 101
        */
        int a = x++;

        /*
         Pre-increment:
         x becomes x + 1; then assigned to b
         x = 102, b = 102
        */
        int b = ++x;

        /*
         Post-increment again:
         c = x; then x becomes x + 1
         c = 102, x = 103
        */
        int c = x++;

        /*
         Nested ternary operator explanation:

         Expression:
         (a < b) ? (a < c) ? a : (b < c) ? b : c : x

         Step-by-step logic:
         -------------------
         1. First condition: (a < b)
            If TRUE → evaluate the inner ternary
            If FALSE → result is x

         2. Inner ternary:
            (a < c) ? a : (b < c) ? b : c

         This effectively finds the smallest value among a, b, and c
         when (a < b) is true.

         Values:
         a = 100
         b = 102
         c = 102
         x = 103
        */
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;

        /*
         Since:
         a < b → true
         a < c → true

         d = a = 100
        */
        System.out.println(d);
    }
}
