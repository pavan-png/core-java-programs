public class Switch_Eg14 {
    public static void main(String[] args) {

        String fruit = "mango";

        /*
         The switch expression is of type String.
         String is supported in switch statements from Java 7 onwards.

         IMPORTANT:
         ----------
         String comparison in switch is CASE-SENSITIVE.
         Internally, Java uses `String.equals()` for comparison.
        */
        switch (fruit) {

            /*
             This case will NOT match because:
             "Apple" ≠ "mango" (case-sensitive comparison)
            */
            case "Apple":
                System.out.println("Apple");

            /*
             This case will also NOT match because:
             "Mango" ≠ "mango" (capital M vs small m)
            */
            case "Mango":
                System.out.println("Mango");

            /*
             This case will NOT match either.
            */
            case "Banana":
                System.out.println("Banana");
                break;

            /*
             Since NONE of the above cases match,
             control jumps to default.

             "Any fruit will do" is printed.
            */
            default:
                System.out.println("Any fruit will do");
        }
    }
}
