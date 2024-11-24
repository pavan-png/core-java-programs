public class Switch_Case_Eg3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        switch (10){ // in switch condition we can have compile time constants (or)operands  but only of the same datatype as of case label
            case 10:  // in case only literals (or) compile time constants are allowed but not operands.
                System.out.println("hello");
                break;
         /*   case y :         // y value is not compile time constant
                System.out.println("hi");
                */
        }
    }
}
