public class Switch_Eg16 {
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
             This case does NOT match either.
            */
            case "Banana":
                System.out.println("Banana");
                break;

            /*
             This case MATCHES because:
             "mango" == "mango"

             "mango" is printed.
             There is NO break here,
             so execution FALLS THROUGH to default.
            */
            case "mango":
                System.out.println("mango");

            /*
             `default` executes here due to fall-through,
             even though a case has already matched.

             "Any fruit will do" is printed.
            */
            default:
                System.out.println("Any fruit will do");
        }
    }
}
