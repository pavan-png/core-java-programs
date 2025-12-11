public class Command_line_Arguments_Eg6 {
    public static void main(String[] args) {

        // local variable
        int x;

        if (args.length > 0) {
            int y = 10;
            x = 10;    // x is initialized only inside this block
        }

        // System.out.println(x);  //  Compile-time error
    }
}
