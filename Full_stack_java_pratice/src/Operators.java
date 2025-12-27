public class Operators {
    public static void main(String[] args) {

        int mask = 0;
        int count = 0;

        /*
         IF–1 FLOW:
         ----------
         (5 < 7) → true

         || is short-circuit OR
         → second operand (++count > 1) is NOT evaluated
         → count remains 0

         | is bitwise OR (no short-circuit)
         → mask++ < 10 IS evaluated

         mask++ < 10:
         → use mask = 0 → 0 < 10 → true
         → then increment → mask becomes 1

         true | true → true
         → if block executes
         → mask = mask + 1 → mask becomes 2
        */
        if (((5 < 7) || (++count > 1)) | mask++ < 10)
            mask = mask + 1;

        /*
         IF–2 FLOW:
         ----------
         6 > 8 → false

         ^ is XOR
         false ^ false → false

         → condition fails
         → mask is unchanged
        */
        if ((6 > 8) ^ false)
            mask = mask + 10;

        /*
         IF–3 FLOW:
         ----------
         mask = 2

         mask > 1 → true
         !(true) → false

         && is short-circuit AND
         → since first condition is false,
           ++count > 1 is NOT evaluated

         → count remains 0
         → if block does not execute
        */
        if (!(mask > 1) && ++count > 1)
            mask = mask + 100;

        /*
         FINAL STATE:
         mask  = 2
         count = 0
        */
        System.out.println(mask + " " + count);
    }
}
