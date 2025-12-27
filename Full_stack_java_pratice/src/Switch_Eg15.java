public class Switch_Eg15 {
    public static void main(String[] args) {

        String fruit = "apple";

        /*
         The switch expression is a String.
         String comparison in switch is CASE-SENSITIVE.

         Value of fruit = "apple" (lowercase).
        */
        switch (fruit) {

            /*
             `default` can be placed anywhere inside switch.

             Since "apple" does NOT match:
             - "Apple"
             - "mango"
             - "Banana"

             control FIRST jumps to `default`.

             There is NO break here,
             so execution FALLS THROUGH to the next cases.
            */
            default:
                System.out.println("Any fruit will do");

            /*
             This case does NOT match,
             but it still executes due to fall-through.
            */
            case "Apple":
                System.out.println("Apple");

            /*
             This case does NOT match either,
             but executes due to fall-through.
            */
            case "mango":
                System.out.println("Mango");

            /*
             This case also does NOT match,
             but executes due to fall-through.

             `break` stops execution here.
            */
            case "Banana":
                System.out.println("Banana");
                break;
        }
    }
}
