public class Increment_Eg9 {
    public static void main(String[] args) {

        int a = 7;

        boolean result =
                a++ == 7       // CONDITION–1
                        && ++a == 9    // CONDITION–2
                        || a++ == 9;   // CONDITION–3 (may or may not run)


        /*
         *********************************************************************
         *           FULL STEP-BY-STEP EXPLANATION (VERY DETAILED)
         *********************************************************************

         Initial value:
             a = 7

         ------------------------------------------------------------------
         CONDITION–1 : a++ == 7
         ------------------------------------------------------------------
         - a++ returns the OLD value 7
         - Then a becomes 8

         So the comparison becomes:
             7 == 7  → true

         Current a = 8

         Since left side of && is TRUE, Java must evaluate the right side
         (because for AND operator both parts must be checked when first is true).

         ------------------------------------------------------------------
         CONDITION–2 : ++a == 9
         ------------------------------------------------------------------
         - ++a increments a first → a becomes 9
         - Then it returns 9

         So the comparison becomes:
             9 == 9 → true

         Now we have:
             CONDITION–1  → true
             CONDITION–2  → true

         So:
             true && true  → true

         IMPORTANT:
         The entire left side of the OR (||) operator is already TRUE.

         ------------------------------------------------------------------
         CONDITION–3 : a++ == 9
         ------------------------------------------------------------------
         This condition belongs to the OR operator:

             (true) || (a++ == 9)

         For OR operator:
             If left side is TRUE → right side is NOT executed
             This is called SHORT-CIRCUIT evaluation.

         Therefore:
             a++ does NOT execute
             The comparison does NOT execute
             a does NOT increment

         So CONDITION–3 is SKIPPED completely.

         *********************************************************************
         FINAL VALUES:
         *********************************************************************

         - a is 9  (because:
                      a++ → made 7 → 8
                      ++a → made 8 → 9
                      last a++ did NOT run)

         - result is TRUE
           (because true && true gives true, and OR is never checked further)
         *********************************************************************
         */

        System.out.println(a);       // prints: 9
        System.out.println(result);  // prints: true
    }
}
