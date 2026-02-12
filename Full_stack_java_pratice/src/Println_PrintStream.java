import java.io.PrintStream;  // Importing PrintStream class because System.out is of this type

public class Println_PrintStream {

    public static void main(String[] args) {

        // System is a predefined class.
        // out is a static variable inside System class.
        // out is an object of PrintStream class.
        // println() is a method of PrintStream class.
        // Here we are calling println() using the PrintStream object stored in System.out.
        System.out.println("Hello");

        // We are NOT creating a new PrintStream object here.
        // System.out already holds a PrintStream object.
        // We are just storing that existing object reference into another variable 'ref'.
        PrintStream ref = System.out;

        // Now 'ref' and 'System.out' both refer to the same PrintStream object.
        // So calling println() using 'ref' will produce the same result.
        ref.println("Hello");
    }
}
