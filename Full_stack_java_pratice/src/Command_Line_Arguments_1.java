public class Command_Line_Arguments_1 {
    public static void main(String []args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        // if the arguments are not provided and above code is executed it will lead to ArrayIndexOutOfBounds Exception
    }
}
