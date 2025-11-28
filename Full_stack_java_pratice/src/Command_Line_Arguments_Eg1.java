public class Command_Line_Arguments_1 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide at least 2 arguments!");
            return; // exits the entire method
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
