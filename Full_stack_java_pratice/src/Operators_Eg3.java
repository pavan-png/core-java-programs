public class Operators_Eg3 {
    public static void main(String[] args) {

        boolean flag = true;

        /*
         Expression:
         -----------
         (flag = true) | (flag = false) || (flag = true)

         IMPORTANT OPERATOR RULES:
         -------------------------
         1) `=`  → assignment (returns the assigned value)
         2) `|`  → bitwise OR (NO short-circuit, both sides evaluated)
         3) `||` → logical OR (short-circuit)
         4) Operator precedence:  |  is evaluated BEFORE  ||

         Step-by-step evaluation:
         ------------------------

         Step 1: (flag = true)
         → flag becomes true
         → expression value = true

         Step 2: (flag = false)
         → flag becomes false
         → expression value = false

         Now evaluate bitwise OR:
         true | false → true
         (since `|` does NOT short-circuit, both assignments happened)

         Step 3: true || (flag = true)
         → `||` is short-circuit OR
         → left side is already true
         → (flag = true) is NOT evaluated

         Final result of whole expression → true
        */
        System.out.println((flag = true) | (flag = false) || (flag = true));

        /*
         Final value of flag:
         --------------------
         - flag was last assigned in (flag = false)
         - third assignment did NOT execute due to short-circuit ||

         So:
         flag = false
        */
        System.out.println(flag);
    }
}
