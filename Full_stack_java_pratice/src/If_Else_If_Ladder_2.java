public class If_Else_If_Ladder_2 {
    public static void main(String[] args) {

        String city = "vijayawada";

        /*
         This is an if–else–if ladder.

         IMPORTANT STRING RULE:
         ----------------------
         `==` compares String REFERENCES, not String CONTENT.

         Here, `city` refers to the String object "vijayawada".
         It is compared with:
         - "hyderabad"
         - "chennai"

         Since neither reference matches,
         both conditions evaluate to FALSE.
        */
        if (city == "hyderabad") {

            // This block executes only if reference matches "hyderabad"
            System.out.println(" the city is hyd");

        } else if (city == "chennai") {

            // This block executes only if reference matches "chennai"
            System.out.println(" the city is chn");

        } else {

            /*
             Since all above conditions are false,
             the else block executes.
            */
            System.out.println("the city is vja");
        }
    }
}
