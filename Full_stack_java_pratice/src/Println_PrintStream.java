import java.io.PrintStream;

public class Println_PrintStream {
    public static void main(String[] args) {

        System.out.println("Hello");

        // here we are creating PrintStream object and with that we are calling println().
        PrintStream ref =  System.out;
        ref.println("Hello");
    }
}
