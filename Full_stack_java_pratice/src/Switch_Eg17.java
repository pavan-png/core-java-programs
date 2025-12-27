public class Switch_Eg17 {
    public static void main(String[] args) {

        String fruit = "mango";

        /*
         The switch expression is a String.
         String comparison in switch is CASE-SENSITIVE.

         Value of fruit = "mango".
        */
        switch (fruit) {

            /*
             This case does NOT match because:
             "Apple" ≠ "mango"
            */
            case "Apple":
                System.out.println("Apple");

            /*
             This case MATCHES because:
             "mango" == "mango"

             "mango" is printed.
             There is NO break here,
             so execution FALLS THROUGH to the next case.
            */
            case "mango":
                System.out.println("mango");

            /*
             This case executes due to fall-through
             from the matching case "mango".

             "Grapes" is printed.
             `break` stops further execution.
            */
            case "Grapes":
                System.out.println("Grapes");
                break;

            /*
             This case executes ONLY if fruit == "Banana".
             Since a break already occurred above,
             this case is SKIPPED.
            */
            case "Banana":
                System.out.println("Banana");

            /*
             `default` executes ONLY when:
             - no case matches, OR
             - execution falls into it due to missing break.

             In this program, default is NOT executed
             because execution stopped at the break in "Grapes".
            */
            default:
                System.out.println("Any fruit will do");
        }
    }
}
