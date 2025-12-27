class Infinity { }

public class Switch_Eg21 extends Infinity {

    // static wrapper variable → default value is null
    static Integer i;

    public static void main(String[] args) {

        // Math.random() → [0.0 , 1.0)
        // * 3           → [0.0 , 3.0)
        // cast to int   → 0, 1, or 2
        int sw = (int) (Math.random() * 3);

        switch (sw) {

            case 0: {

                /*
                 for-loop WITHOUT braces.
                 Only the immediate next statement (if) belongs to the loop.
                 */
                for (int x = 10; x > 5; x++)
                    // condition is NEVER true for these values
                    if (x > 10000000)
                        x = 10; // assignment, not declaration

                /*
                 Important:
                 - x is incremented (x++)
                 - condition x > 5 is always true once x starts at 10
                 - loop becomes INFINITE due to x++
                 - break is NOT part of the loop
                 - break belongs to the switch case
                 */
                break;
            }

            case 1: {

                /*
                 `i` is a static Integer.
                 Default value = null.

                 Expression 7 * i triggers AUTO-UNBOXING.
                 Unboxing null → NullPointerException at runtime.

                 This executes ONLY if sw == 1.
                 */
                int y = 7 * i;
                break;
            }

            case 2: {

                /*
                 Parent reference holding child object.
                 */
                Infinity inf = new Switch_Eg21();

                /*
                 Downcasting:
                 - Parent → Child
                 - Valid because actual object is Switch_Eg21
                 */
                Switch_Eg21 b = (Switch_Eg21) inf;
            }
        }
    }

    void demo() {

        /*
         Same rule here:
         - no braces → only if is inside for-loop
         - x++ with condition x > 5 → infinite loop
         */
        for (int x = 10; x > 5; x++)
            if (x > 10000000)
                x = 1;
    }
}
