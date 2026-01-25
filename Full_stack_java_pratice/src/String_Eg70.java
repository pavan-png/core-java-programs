public class String_Eg70 {
    public static void main(String[] args) {

        // String used to build the final result
        String res = "";

        // Labeled for-loop
        // The label 'loop' allows breaking out of the LOOP from inside the switch
        loop:
        for (int i = 1; i <= 5; i++) {

            // switch is inside the loop
            switch (i) {

                case 1:
                    // break here exits ONLY the switch, NOT the loop
                    // Loop continues with next iteration
                    res += "UP ";
                    break;

                case 2:
                    // break here exits ONLY the switch, NOT the loop
                    // Loop continues
                    res += "TO ";
                    break;

                case 3:
                    // break here exits ONLY the switch
                    // Loop still continues to next i
                    break;

                case 4:
                    // break loop exits the ENTIRE labeled loop
                    // This stops both switch and loop execution
                    res += "DATE";
                    break loop;
            }
        }

        // Prints the collected string
        System.out.println(res);

        // split() divides the string using space as delimiter
        // join() joins the words using '-' as delimiter
        System.out.println(String.join("-", res.split(" ")));
    }
}
