public class Static_Block_Eg5 {

    // Static variable initialized first
    static int x = 7;

    /*
     Static block:
     - Executes ONCE during class loading
     - Executes BEFORE main()
     */
    static {
        x++;   // x becomes 8 before main() starts
    }

    public static void main(String[] args) {

        // Local string to collect output
        String s = "";

        /*
         Loop runs 3 times:
         y = 0, 1, 2
        */
        for (int y = 0; y < 3; y++) {

            // Increment x at the start of each iteration
            x++;

            /*
             switch statement:
             - If no break is used, execution FALLS THROUGH
             - Control continues to next cases
            */
            switch (x) {

                case 8:
                    s += "8 ";
                    // no break → fall-through

                case 9:
                    s += "9 ";
                    // no break → fall-through

                case 10: {
                    s += "10 ";
                    break;   // exits switch
                }

                default:
                    s += "d ";
                    // no break → fall-through

                case 13:
                    s += "13 ";
            }
        }

        // Print final accumulated string
        System.out.println(s);
    }
}
