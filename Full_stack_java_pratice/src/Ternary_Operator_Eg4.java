public class Ternary_Operator_Eg4 {
    public static void main(String[] args) {

        Integer i = 42;

        /*
         Nested ternary operator.

         Evaluation order:
         -----------------
         (i < 40) ? "life" : (i > 50) ? "universe" : "everything"

         Step 1:
         i < 40 → false

         Step 2:
         Evaluate second condition:
         i > 50 → false

         Step 3:
         Final result → "everything"

         Type rule:
         ----------
         Both possible results are String literals.
         Hence, the ternary expression result type is String.

         Since the LHS variable is also String,
         there is NO compile-time error.
        */
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";

        System.out.println(s);
    }
}
