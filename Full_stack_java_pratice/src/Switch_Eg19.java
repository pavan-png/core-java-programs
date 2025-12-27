public class Switch_Eg19 {
    public static void main(String[] args) {

        /*
         A String object is created using a character array.
         This creates a NEW String object in the heap.

         Content of the String = "MANGO"
        */
        String fruit = new String(new char[] {'M','A','N','G','O'});

        /*
         The switch expression is of type String.

         IMPORTANT:
         ----------
         - String switch comparison is CASE-SENSITIVE.
         - Java uses String.equals() internally, NOT reference comparison.
         - So content matters, not how the String object is created.
        */
        switch (fruit) {

            /*
             `default` can be placed anywhere in the switch.

             default executes ONLY if:
             - no case matches, OR
             - execution falls into it due to missing break.
            */
            default: {
                System.out.println(" i will eat all the fruits");
            }

            /*
             This case does NOT match because:
             "APPLE" ≠ "MANGO"
            */
            case "APPLE":
                System.out.println("this is  apple");

            /*
             This case MATCHES because:
             fruit content = "MANGO"

             Even though the String was created using `new`,
             content comparison succeeds using equals().

             There is NO break here,
             so execution FALLS THROUGH.
            */
            case "MANGO":
                System.out.println("this  is mango");

            /*
             This case executes due to fall-through
             from the matching case "MANGO".

             `break` stops further execution.
            */
            case "BANANA":
                System.out.println("this is  banana");
                break;
        }
    }
}
